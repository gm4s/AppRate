package com.octopepper.apprate.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.octopepper.apprate.AppRate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AppRate(this)
                .showDoYouLikeTheAppFlow("guillaume.mas@octopepper.com")
                .setShowIfAppHasCrashed(false)
                .init();
    }

}
