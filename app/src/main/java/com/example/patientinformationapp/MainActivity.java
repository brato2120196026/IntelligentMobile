package com.example.patientinformationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvgithub);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void getStarted(View view) {
        startActivity(new Intent(this, PatientDetailActivity.class));
    }
}