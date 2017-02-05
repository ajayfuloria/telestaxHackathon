package com.example.merlin.calapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


///


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.net.ssl.HttpsURLConnection;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText)findViewById(R.id.etUsername);
        final TextView tvWelcomeMsg = (TextView)findViewById(R.id.tvWelcomeMsg) ;
        final TextView tvMsg = (TextView)findViewById(R.id.tvMsg);

        final ImageButton bChild = (ImageButton)findViewById(R.id.bChild);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");

        String message = "Welcome " + name + "  !!";

        tvWelcomeMsg.setText(message);


        bChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    URL url  = new URL("https://ACae8f5f460dc6fc981c24b18c3f062fd3:abf9000307350d1cff02fbd97ff33856@cloud.restcomm.com/restcomm/2012-04-24/Accounts/ACae8f5f460dc6fc981c24b18c3f062fd3/SMS/Messages -d \"To=%2B919176273911\" -d \"From=%2B12393089320\" -d \"Body=This is a test from RestComm\"");


                    try {
                        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                        String urlParameters= "";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }


            }
        });

    }
}
