package com.example.divya.androidquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity implements View.OnClickListener {

    Button Login;
    EditText e_name,e_psswd;
    TextView t1;
    DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Login=(Button)findViewById(R.id.button_start);

        e_name=(EditText)findViewById(R.id.editText1);
        e_psswd=(EditText)findViewById(R.id.editText2);

        t1=(TextView)findViewById(R.id.textView3);

        db = new DatabaseHandler(this);

        Login.setOnClickListener(this);
        t1.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v)
    {

        switch(v.getId())
        {
            case R.id.button_start:
                String name = e_name.getText().toString();
                String psswd = e_psswd.getText().toString();
                Boolean chk_name = db.chkname(name);
                Boolean chk_psswd = db.chkpsswd(psswd);

                if (chk_name)   //if user exists
                {
                    if(chk_psswd)   //if password matches
                    {
                        Intent i = new Intent(this, QuizActivity.class);
                        startActivity(i);
                        Toast.makeText(getApplicationContext(),"You Logged Successfully",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Password Does Not Matches",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"User Account Does Not Exists",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.textView3:
                Intent i = new Intent(this, signup.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}