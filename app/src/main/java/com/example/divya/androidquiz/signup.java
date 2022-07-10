package com.example.divya.androidquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity implements View.OnClickListener {

    EditText name,email_id,psswd,c_psswd;

    Button create;

    DatabaseHandler dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name= findViewById(R.id.editText1);
        email_id= findViewById(R.id.editText2);
        psswd= findViewById(R.id.editText3);
        c_psswd= findViewById(R.id.editText4);

        create= findViewById(R.id.button_start);

        dh = new DatabaseHandler(this);

        create.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String s1 = name.getText().toString();
        String s2 = email_id.getText().toString();
        String s3 = psswd.getText().toString();
        String s4 = c_psswd.getText().toString();

        if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if (s3.equals(s4))
            {
                Boolean chk_name = dh.chkname(s1);
                if (!chk_name)   //if username not found or does not exists
                {
                    boolean chk_insert = dh.insert(s1, s2, s3);
                    if (chk_insert)
                    {
                        Toast.makeText(getApplicationContext(), "Account has been created Successfully", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(this, QuizActivity.class);
                        startActivity(i);
                    }

                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Username Already Exists", Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Password do not match", Toast.LENGTH_SHORT).show();
            }
        }


    }

}

