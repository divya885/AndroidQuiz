package com.example.divya.androidquiz;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;
import java.util.List;

public class StartQuiz extends AppCompatActivity {

    public static final String EXTRA_SCORE = "extraScore";
    TextView textViewScore, textViewQuestionCount, textViewQuestion_text,textViewDifficulty;
    RadioGroup radioGroup;
    RadioButton rb1, rb2, rb3, rb4;
    Button buttonConfirmNext;


    ColorStateList textColorDefaultRb;

    int questionCounter, questionCountTotal, Score;

    boolean answered;

    private long backPressedTime;

    Question currentQuestion;

    List<Question> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);

        textViewScore = (TextView) findViewById(R.id.score);
        textViewQuestionCount = (TextView) findViewById(R.id.question);
        textViewQuestion_text = (TextView) findViewById(R.id.question_text);
        textViewDifficulty = (TextView) findViewById(R.id.text_view_difficulty);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        rb1 = (RadioButton) findViewById(R.id.option1);
        rb2 = (RadioButton) findViewById(R.id.option2);
        rb3 = (RadioButton) findViewById(R.id.option3);
        rb4 = (RadioButton) findViewById(R.id.option4);
        buttonConfirmNext = (Button) findViewById(R.id.confirm);
        textColorDefaultRb = rb1.getTextColors();

        QuizQuestionsDbHelper dbHelper = new QuizQuestionsDbHelper(this);

        Intent intentdifficulty = getIntent();
        String difficulty_result = intentdifficulty.getStringExtra(Intent.EXTRA_TEXT);
        textViewDifficulty.setText("Difficulty : "+ difficulty_result);
        questionList = dbHelper.getQuestions(difficulty_result);
        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);

        showNextQuestion();

        buttonConfirmNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answered) {
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(getApplicationContext(), "Please Select Answer", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    showNextQuestion();
                }
            }
        });
    }

    private void showNextQuestion() {
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rb4.setTextColor(textColorDefaultRb);
        radioGroup.clearCheck();

        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);

            textViewQuestion_text.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());

            questionCounter++;
            textViewQuestionCount.setText("Question : " + questionCounter + "/" + questionCountTotal);
            answered = false;
            buttonConfirmNext.setText("Confirm");

        } else {
            finishQuiz();
        }
    }

    private void checkAnswer() {
        answered = true;
        RadioButton rbSelected = findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNr = radioGroup.indexOfChild(rbSelected) + 1;

        if (answerNr == currentQuestion.getAnswerNr()) {
            Score++;
            textViewScore.setText("  Score is : " + Score);
        }

        showSolution();
    }

    private void showSolution() {
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);

        switch (currentQuestion.getAnswerNr()) {
            case 1:
                rb1.setTextColor(Color.GREEN);
                textViewQuestion_text.setText("Answer 1 is correct");
                break;

            case 2:
                rb2.setTextColor(Color.GREEN);
                textViewQuestion_text.setText("Answer 2 is correct");
                break;

            case 3:
                rb3.setTextColor(Color.GREEN);
                textViewQuestion_text.setText("Answer 3 is correct");
                break;

            case 4:
                rb4.setTextColor(Color.GREEN);
                textViewQuestion_text.setText("Answer 4 is correct");
                break;
        }
        if (questionCounter < questionCountTotal) {
            buttonConfirmNext.setText("Next");
        } else {
            buttonConfirmNext.setText("Finish");
        }

    }

    private void finishQuiz() {
        Intent resultIntent = new Intent(this,QuizActivity.class);
        resultIntent.putExtra(EXTRA_SCORE, Score);
        setResult(2, resultIntent);
        finish();
    }

    public void onBackPressed(){
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            finishQuiz();
        }
        else {
            Toast.makeText(getApplicationContext(),"Press back again to Finish",Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();
    }


}


