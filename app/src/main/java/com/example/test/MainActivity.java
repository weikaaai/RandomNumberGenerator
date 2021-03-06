package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num = findViewById(R.id.editTextNumber);
        Button button = findViewById(R.id.button);
        TextView genNum = findViewById(R.id.textView3);

        Random rand = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(num.getText()) || Integer.parseInt(num.getText().toString()) < 1) {
                    genNum.setTextSize(20);
                    genNum.setText("please enter a valid number.");
                    return;
                }
                int bound = Integer.parseInt(num.getText().toString());
                int r = rand.nextInt(bound) + 1;
                genNum.setTextSize(36);
                genNum.setText(String.valueOf(r));
            }
        });
    }
}