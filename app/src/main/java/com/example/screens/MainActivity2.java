package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("NAME");
        String city = bundle.getString("CITY");
        String age = bundle.getString("AGE");
        TextView textview = (TextView) findViewById(R.id.textView2);
        TextView textview2 = (TextView) findViewById(R.id.textView3);
        TextView textview3 = (TextView) findViewById(R.id.textView5);
        textview.setText(name);
        textview2.setText(city);
        textview3.setText(age);
    }
}