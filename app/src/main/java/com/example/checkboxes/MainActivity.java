package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox CheckBox_1, CheckBox_2,
            CheckBox_3, CheckBox_4,
            CheckBox_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox_1 = findViewById(R.id.checkBox_1);
        CheckBox_2 = findViewById(R.id.checkBox_2);
        CheckBox_3 = findViewById(R.id.checkBox_3);
        CheckBox_4 = findViewById(R.id.checkBox_4);
        CheckBox_5 = findViewById(R.id.checkBox_5);
    }

    public void onCheckBoxClicked(View v) {
        String msg = "";

        if (CheckBox_1.isChecked())
            msg = msg + " Chocolate syrup ";
        if (CheckBox_2.isChecked())
            msg = msg + " Sprinkles";
        if (CheckBox_3.isChecked())
            msg = msg + " Crushed nuts";
        if (CheckBox_4.isChecked())
            msg = msg + " Cherries";
        if (CheckBox_5.isChecked())
            msg = msg + " Orio cookies crumbles";

        Toast.makeText(this, msg + "are selected",
                Toast.LENGTH_LONG).show();
    }
}

