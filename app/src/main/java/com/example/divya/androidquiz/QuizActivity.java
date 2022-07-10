package com.example.divya.androidquiz;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    ActivityResultLauncher<Intent> activityResultLauncher=registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult activityResult) {
                    int result1 = activityResult.getResultCode();
                    Intent data = activityResult.getData();
                    if (result1==2)
                    {
                        int result = data.getIntExtra(StartQuiz.EXTRA_SCORE,0);
                        textViewHighScore.setText("Score is : " + result);
                        score_share = result;
                    }

                }
            }
    );
    Button start_quiz;
    TextView textViewHighScore;
    Spinner spinnerDifficulty;

    String difficulty;

    AlertDialog.Builder adb = null;
    AlertDialog ad = null;

    int score_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        textViewHighScore = (TextView)findViewById(R.id.highScore);
        spinnerDifficulty = (Spinner)findViewById(R.id.spinner_difficulty);
        start_quiz=(Button)findViewById(R.id.button_start);

        start_quiz.setOnClickListener(this);
        spinnerDifficulty.setOnItemSelectedListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(this, StartQuiz.class);
        i.putExtra(Intent.EXTRA_TEXT, difficulty);
        //startActivityForResult(i, 10);
        activityResultLauncher.launch(i);

    }
/*
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);

        if (requestCode==10&&resultCode==2)
        {
            int result = data.getIntExtra(StartQuiz.EXTRA_SCORE,0);
            textViewHighScore.setText("Score is : " + result);
            score_share = result;
        }
    }
*/
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String s = parent.getItemAtPosition(position).toString();
        switch (s)
        {
            case "Easy" :   difficulty = "Easy";
                break;

            case "Medium" : difficulty = "Medium";
                break;

            case "Hard" :   difficulty = "Hard";
                break;

            default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        Toast.makeText(getApplicationContext(),"Plz select a difficulty level",Toast.LENGTH_SHORT).show();
    }


    public boolean onCreateOptionsMenu(Menu m)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menufile,m);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem i1)
    {
        Intent intent;
        switch (i1.getItemId())
        {
            case R.id.home_item :
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.knowledge_item :
                intent = new Intent(this,Knowledge.class);
                startActivity(intent);
                break;

            case R.id.share_item :
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"Score is : " + score_share);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent,"Share your score(Choose one)"));
                break;

            default:
                break;
        }

        return true;
    }

}
