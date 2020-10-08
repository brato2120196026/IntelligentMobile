package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hellotoast.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0, resetZero = 0;
    private TextView mShowCount;
    private Button button_zero, button_count, button_toast;
    private int pink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_count= (Button) findViewById(R.id.button_count);
        button_toast = (Button)findViewById(R.id.button_toast);
        button_zero = (Button)findViewById(R.id.button_zero);

    }

//Toast method
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

//Count method
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
            button_zero.setBackgroundColor(getResources().getColor(R.color.pink));;
    }

    public void setZero(View view) {
        mShowCount.setText(Integer.toString(mCount=0));
        button_zero.setBackgroundColor(Color.GRAY);

    }
}