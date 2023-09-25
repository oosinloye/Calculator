package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;  // Import statement for Intent
import android.os.Bundle;  // Import statement for Bundle
import android.widget.TextView;  // Import statement for TextView



public class SolutionActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView.setText("Solution: " + str);
    }
}