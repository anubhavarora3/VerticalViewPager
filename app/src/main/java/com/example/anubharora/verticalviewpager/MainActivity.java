package com.example.anubharora.verticalviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    VerticalPager mVerticalPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        mVerticalPager = (VerticalPager) findViewById(R.id.viewPager);
        mVerticalPager.setAdapter(new PageAdapter(getSupportFragmentManager()));

    }
}
