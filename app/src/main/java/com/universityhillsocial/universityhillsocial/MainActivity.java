package com.universityhillsocial.universityhillsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.app.IntentService;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userEmail, userPassword;
    private Button LoginButton;
    private TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    // move to profile screen

                    //Intent changeScreen = new Intent(getApplicationContext(), WelcomeActivity.class);
                    //startActivity(changeScreen);
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
            }
        });

    }

    private void setViews() {

        userEmail = (EditText) findViewById(R.id.userEmail);
        userPassword = (EditText) findViewById(R.id.userPassword);
        LoginButton = (Button) findViewById(R.id.LogInButton);
        signUp = (TextView) findViewById(R.id.SignUp);

    }

    private Boolean validate() {

        Boolean filled = false;
        String inputEmail = userEmail.getText().toString();
        String inputPassword = userPassword.getText().toString();

        if (inputEmail.isEmpty() || inputPassword.isEmpty())
            Toast.makeText(this, "Please fill out all of the fields", Toast.LENGTH_SHORT).show();
        else
            filled = true;

        return filled;
    }


}

