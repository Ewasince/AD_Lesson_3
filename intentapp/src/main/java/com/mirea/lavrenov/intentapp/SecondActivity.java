package com.mirea.lavrenov.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


//import com.mirea.lavrenov.intentapp.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView228);
        String text = getIntent().getStringExtra("message");
        textView.setText(text);
    }

}
