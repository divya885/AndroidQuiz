package com.example.divya.androidquiz;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button start,help,contact;
    AlertDialog.Builder adb = null;
    AlertDialog ad = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.button_start);
        help = findViewById(R.id.button_help);
        contact = findViewById(R.id.button_contact);

        start.setOnClickListener(this);
        help.setOnClickListener(this);
        contact.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v)
    {
        Intent i;

        switch (v.getId()) {

            case R.id.button_start :
                i = new Intent(MainActivity.this, login.class);
                startActivity(i);
                break;

            case R.id.button_help :
                i = new Intent(this,Help.class);
                startActivity(i);
                break;

            case R.id.button_contact :
                i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:9718931967"));
                startActivity(Intent.createChooser(i,"choose one"));
                break;

            default:
                break;
        }
    }

    public boolean onCreateOptionsMenu(Menu m)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menufile_exit,m);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem i1)
    {
        adb = new AlertDialog.Builder(this);
        adb.setCancelable(true);
        adb.setMessage("Are u sure u want to Exit?");

        adb.setPositiveButton("OK", (di, id) -> {
            finish();
            Toast.makeText(getApplicationContext(), "You Pressed Exit Button", Toast.LENGTH_SHORT).show();
        });

        adb.setNegativeButton("CANCEL", (di, id) -> Toast.makeText(getApplicationContext(), "You Pressed Cancel Button", Toast.LENGTH_SHORT).show());

        ad = adb.create();
        ad.show();

        return true;
    }
}