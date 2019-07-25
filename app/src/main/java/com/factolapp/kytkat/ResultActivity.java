package com.factolapp.kytkat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class ResultActivity extends AppCompatActivity {

    Integer questions;
    Integer errors;

    private InterstitialAd mInterstitialAd;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            questions = extras.getInt("QUESTIONS");
            errors = extras.getInt("ERRORS");
        }
        ((TextView) findViewById(R.id.nbrQ)).setText(Integer.toString(questions));
        ((TextView) findViewById(R.id.nbrE)).setText(Integer.toString(errors));
        float res = questions - errors;
        res /= questions;
        res *= 100;
        ((TextView) findViewById(R.id.nbrP)).setText(String.format("%.0f", res));
        if (res < 75)
            ((TextView) findViewById(R.id.error_msg)).setText("Too much errors try again!");

        MobileAds.initialize(this,
                "ca-app-pub-2489724153428647~1398292132");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2489724153428647/1589524513");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
                finish();
            }

        });

    }

    public void goToMain(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded())
            mInterstitialAd.show();
        else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(0, 0);
            finish();
        }
    }
}
