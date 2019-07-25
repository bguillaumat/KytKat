package com.factolapp.kytkat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseModeActivity extends AppCompatActivity {

    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);

        Bundle extras = getIntent().getExtras();
        if (extras != null)
            value = extras.getString("CATEGORY");

        Button all_quest = findViewById(R.id.button_allquestions);
        Button twenty_quest = findViewById(R.id.button_20_questions);
        Button five_errors = findViewById(R.id.button_5_errors);

        all_quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchQuestion(1);
            }
        });

        twenty_quest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchQuestion(2);
            }
        });

        five_errors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchQuestion(3);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(0,0);
        finish();
    }

    public void LaunchQuestion(int mode) {
        Intent intent = new Intent(this, QuestionActivity.class);
        intent.putExtra("MODE", mode);
        intent.putExtra("CATEGORY", value);
        startActivity(intent);
        overridePendingTransition(0,0);
        finish();
    }
}
