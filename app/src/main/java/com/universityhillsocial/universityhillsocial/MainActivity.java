package com.universityhillsocial.universityhillsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.app.IntentService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LogInButton = (Button) findViewById(R.id.LogInButton);

        LogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changeScreen = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(changeScreen);
            }
        });

        /*View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent changeScreen = new Intent(MainActivity.this, WelcomeActivity.class);
                MainActivity.this.startActivity(changeScreen);
            }
        };*/

    }
}
