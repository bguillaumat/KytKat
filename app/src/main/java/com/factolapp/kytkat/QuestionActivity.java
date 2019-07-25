package com.factolapp.kytkat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

public class QuestionActivity extends AppCompatActivity {

    TextView question;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    String category;
    Integer mode;
    
    Integer count;
    Integer maxErrors;
    Integer maxQ;
    Integer error;
    Integer incr;
    String answer;

    String[][] list;
    ArrayList<Questions> L = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_activity);

        question = findViewById(R.id.question_string);
        button1 = findViewById(R.id.button_answer1);
        button2 = findViewById(R.id.button_answer2);
        button3 = findViewById(R.id.button_answer3);
        button4 = findViewById(R.id.button_answer4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(button1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(button2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(button3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(button4);
            }
        });

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            category = extras.getString("CATEGORY");
            mode = extras.getInt("MODE");
        }
        prepareQuestions();
    }

    private void prepareQuestions() {
        switch (category) {
            case "network": Network_Communication network_communication = new Network_Communication();
                            list = network_communication.returnList();
                            break;
            case "ai": Artificial_Intelligence artificial_intelligence = new Artificial_Intelligence();
                            list = artificial_intelligence.returnList();
                            break;
        }
        switch (mode) {

            case 1: init();
                    incr = randInt(0, L.size()-1);
                    maxQ = L.size();
                    break;

            case 2: maxQ = 20;
                    init();
                    incr = randInt(0, L.size()-1);
                    break;

            case 3: maxErrors = 5;
                    init();
                    incr = randInt(0, L.size()-1);
                    maxQ = L.size();
                    break;
        }
        startQuestions();
    }

    private void startQuestions() {
        switch (mode) {

            case 1:
                if (count < L.size() && count < maxQ) {
                    if (!(L.get(incr)).getUsed()) {
                        createQuestions((L.get(incr)));
                        (L.get(incr)).setUsed(true);
                    } else {
                        incr = randInt(0, L.size()-1);
                        startQuestions();
                    }
                } else goToResult();
                break;

            case 2:
                if (count < L.size() && count < maxQ) {
                    if (!(L.get(incr)).getUsed()) {
                        createQuestions((L.get(incr)));
                        (L.get(incr)).setUsed(true);
                    } else {
                        incr = randInt(0, L.size()-1);
                        startQuestions();
                    }
                } else goToResult();
                break;

            case 3:
                if (count < L.size() && count < maxQ && error < maxErrors) {
                    if (!(L.get(incr)).getUsed()) {
                        createQuestions((L.get(incr)));
                        (L.get(incr)).setUsed(true);
                    } else {
                        incr = randInt(0, L.size()-1);
                        startQuestions();
                    }
                } else goToResult();
                    break;
        }
    }

    private void createQuestions(Questions ques) {
        question.setText(ques.Q);
        int choice = randInt(0, 3);
        choice %= 4;
        switch (choice) {
            case 0: answer = ques.getGoodAnswer();
                    button1.setText(ques.getA1());
                    button1.setClickable(true);
                    button2.setText(ques.getA2());
                    button2.setClickable(true);
                    button3.setText(ques.getA3());
                    button3.setClickable(true);
                    button4.setText(ques.getA4());
                    button4.setClickable(true);
                    break;
            case 1: answer = ques.getGoodAnswer();
                    button1.setText(ques.getA2());
                    button1.setClickable(true);
                    button2.setText(ques.getA3());
                    button2.setClickable(true);
                    button3.setText(ques.getA4());
                    button3.setClickable(true);
                    button4.setText(ques.getA1());
                    button4.setClickable(true);
                    break;
            case 2: answer = ques.getGoodAnswer();
                    button1.setText(ques.getA3());
                    button1.setClickable(true);
                    button2.setText(ques.getA4());
                    button2.setClickable(true);
                    button3.setText(ques.getA1());
                    button3.setClickable(true);
                    button4.setText(ques.getA2());
                    button4.setClickable(true);
            case 3: answer = ques.getGoodAnswer();
                    button1.setText(ques.getA4());
                    button1.setClickable(true);
                    button2.setText(ques.getA1());
                    button2.setClickable(true);
                    button3.setText(ques.getA2());
                    button3.setClickable(true);
                    button4.setText(ques.getA3());
                    button4.setClickable(true);
            }
    }

    private void quest_answerd() {
        count++;
        CountDownTimer mTimer;
        mTimer = new CountDownTimer(2000, 9000) {
            public void onTick(long millisUntilFinished) {
                button1.setClickable(false);
                button2.setClickable(false);
                button3.setClickable(false);
                button4.setClickable(false);
            }
            @SuppressLint("PrivateResource")
            public void onFinish() {
                startQuestions();
                button1.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.button_material_light)));
                button2.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.button_material_light)));
                button3.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.button_material_light)));
                button4.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.button_material_light)));
            }
        };
        mTimer.start();
    }

    private void goToResult() {
        onBackPressed();
    }

    private void check_button() {
        error++;
        if (button1.getText().toString().equals(answer)) button1.setBackgroundTintList(ColorStateList.valueOf(GREEN));
        if (button2.getText().toString().equals(answer)) button2.setBackgroundTintList(ColorStateList.valueOf(GREEN));
        if (button3.getText().toString().equals(answer)) button3.setBackgroundTintList(ColorStateList.valueOf(GREEN));
        if (button4.getText().toString().equals(answer)) button4.setBackgroundTintList(ColorStateList.valueOf(GREEN));
        quest_answerd();
    }

    private void buttonClicked(Button button) {
        if (button.getText().toString().equals(answer)) {
            button.setBackgroundTintList(ColorStateList.valueOf(GREEN));
            quest_answerd();
        }
        else {
            button.setBackgroundTintList(ColorStateList.valueOf(RED));
            check_button();
        }
    }

    private void init() {
        int x = 0;
        error = 0;
        incr = 0;
        count = 0;
        L.clear();
        while (x < list.length) {
            Questions q = new Questions(list[x][0], list[x][1], list[x][2], list[x][3], list[x][4], list[x][5]);
            L.add(q);
            x++;
        }
    }

    private int randInt(int mini, int maxi) {
        int n = maxi - mini;
        Random random = new Random();
        if (n > 0) return random.nextInt(n + 1) + mini;
        else return mini;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("ERRORS", error);
        intent.putExtra("QUESTIONS", count);
        startActivity(intent);
        overridePendingTransition(0,0);
        finish();
    }
}
