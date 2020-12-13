package com.example.patientinformationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PatientDetailActivity extends AppCompatActivity {

    private Button btnStore, btnGetall;
    private EditText etname, etaddress, etage, etsex, etcontact, etcity;
    private DatabaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_detail);

        databaseHelper = new DatabaseHelper(this);

        btnStore = findViewById(R.id.btnstore);
        btnGetall = findViewById(R.id.btnget);
        etname = findViewById(R.id.etname);
        etaddress = findViewById(R.id.etaddress);
        etage = findViewById(R.id.etage);
        etsex = findViewById(R.id.etsex);
        etcontact = findViewById(R.id.etcontact);
        etcity = findViewById(R.id.etcity);


//add onclick()
        btnStore.setOnClickListener(view -> {
            databaseHelper.addUser(etname.getText().toString(), etaddress.getText().toString(), etage.getText().toString(), etsex.getText().toString(), etcontact.getText().toString(), etcity.getText().toString());
            etname.setText("");
            etaddress.setText("");
            etage.setText("");
            etsex.setText("");
            etcontact.setText("");
            etcity.setText("");
            Toast.makeText(PatientDetailActivity.this, "Stored Successfully!", Toast.LENGTH_SHORT).show();
        });

        btnGetall.setOnClickListener(view -> {
            Intent intent = new Intent(PatientDetailActivity.this, GetAllUsersActivity.class);
            startActivity(intent);
        });
    }
}