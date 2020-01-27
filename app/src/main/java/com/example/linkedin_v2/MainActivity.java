package com.example.linkedin_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {

    PreferenceManager preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = new PreferenceManager(this);







        if (preferences.isFirstTimeLaunch()) {
            Intent intent = new Intent(MainActivity.this, SignIn.class);
            startActivity(intent);
        }



    }
}
