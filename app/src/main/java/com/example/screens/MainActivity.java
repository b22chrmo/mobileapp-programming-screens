package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("NAME", "Chrille");
                bundle.putString("CITY", "Skovde");
                bundle.putString("AGE", "25");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}
