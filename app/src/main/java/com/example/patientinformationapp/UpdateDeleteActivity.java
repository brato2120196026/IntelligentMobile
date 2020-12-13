package com.example.patientinformationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateDeleteActivity extends AppCompatActivity {

    private UserModel userModel;
    private EditText etname, etaddress, etage, etsex, etcontact, etcity;
    private Button btnupdate, btndelete;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete);

        Intent intent = getIntent();
        userModel = (UserModel) intent.getSerializableExtra("user");

        databaseHelper = new DatabaseHelper(this);

        etname = findViewById(R.id.etname);
        etaddress = findViewById(R.id.etaddress);
        etsex = findViewById(R.id.etsex);
        etage = findViewById(R.id.etage);
        etcontact = findViewById(R.id.etcontact);
        etcity = findViewById(R.id.etcity);
        btndelete = findViewById(R.id.btndelete);
        btnupdate = findViewById(R.id.btnupdate);

        etname.setText(userModel.getName());
        etaddress.setText(userModel.getAddress());
        etage.setText(userModel.getAge());
        etsex.setText(userModel.getSex());
        etcontact.setText(userModel.getContact());
        etcity.setText(userModel.getCity());

        btnupdate.setOnClickListener(view -> {
            databaseHelper.updateUser(userModel.getId(),etname.getText().toString(),etaddress.getText().toString(),etage.getText().toString(),etsex.getText().toString(),etcontact.getText().toString(),etcity.getText().toString());
            Toast.makeText(UpdateDeleteActivity.this, "Updated Successfully!", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(UpdateDeleteActivity.this,MainActivity.class);
            intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent1);
        });

        btndelete.setOnClickListener(view -> {
            databaseHelper.deleteUSer(userModel.getId());
            Toast.makeText(UpdateDeleteActivity.this, "Deleted Successfully!", Toast.LENGTH_SHORT).show();
            Intent intent12 = new Intent(UpdateDeleteActivity.this,MainActivity.class);
            intent12.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent12);
        });
    }
}