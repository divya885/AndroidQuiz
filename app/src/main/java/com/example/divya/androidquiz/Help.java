
package com.example.divya.androidquiz;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Help extends AppCompatActivity {

    TextView textviewscroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        textviewscroll = (TextView)findViewById(R.id.textView_scroll);

        String s = "Android Quiz Privacy Policy\n" +
                "October 28, 2018\n" +
                "This Privacy Policy is meant to help you understand what data we collect, why we collect it, and what we do with it. This is important; we hope you will take time to read it carefully.\n" +
                "\n" +
                "What information do Android Tutorials collect?\n" +
                "We collect none of your information.Nor do we share any of your information with 3rd Parties.\n" +
                "\n" +
                "Why do we required permissions?\n" +
                "All the permissions mentioned in the app are required with the sole purpose of running the demo Examples.\n" +
                "\n" +
                "What are the permissions required in the App?\n" +
                "Contacts:\n" +
                "--read your contacts\n" +
                "Location:\n" +
                "--precise location (GPS and network-based)\n" +
                "SMS:\n" +
                "--read your text messages (SMS or MMS)\n" +
                "--send SMS messages\n" +
                "Phone:\n" +
                "--directly call phone numbers\n" +
                "--read phone status and identity\n" +
                "Wi-Fi connection information:\n" +
                "--view Wi-Fi connections\n" +
                "Device ID & call information:\n" +
                "--read phone status and identity\n" +
                "Other:\n" +
                "--connect and disconnect from Wi-Fi\n" +
                "--full network access";

        textviewscroll.setText(s);
    }
}