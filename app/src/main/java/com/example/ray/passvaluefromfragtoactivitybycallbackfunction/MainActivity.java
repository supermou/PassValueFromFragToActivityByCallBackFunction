package com.example.ray.passvaluefromfragtoactivitybycallbackfunction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
此範例展示如何利用callback function將參數從fragment傳遞至activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
