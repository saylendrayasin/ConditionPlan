package com.example.conditionplan;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {

    private Button regis;
    private EditText rEmail, rPass;
    private FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regis = findViewById(R.id.btnRegister);
        rEmail = findViewById(R.id.etREmail);
        rPass = findViewById(R.id.etRPass);
        fAuth = FirebaseAuth.getInstance();

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
            }
        });


    }

    private void addUser(){
        try {
            fAuth.createUserWithEmailAndPassword(rEmail.getText().toString(), rPass.getText().toString()).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Registration.this, "Successful To Registration Email and Password", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), Login.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Registration.this, "Failed To Registration Your Email and Password, Please Check Your Input", Toast.LENGTH_LONG).show();
                    }
                }
            });
        }catch (Throwable t){
            handle(t);
        }
    }

    private void handle(Throwable t){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Exception!")
                .setMessage(t.toString())
                .setPositiveButton("Ok", null)
                .show();
    }
}