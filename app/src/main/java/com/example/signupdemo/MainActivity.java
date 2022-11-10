package com.example.signupdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.subBtn);

        btn.setOnClickListener(this);
    }

    public void onLogin(View view) {
        EditText email = findViewById(R.id.email);
        String em = email.getText().toString();

        EditText password = findViewById(R.id.password);
        String pass = password.getText().toString();

        String msg = "Welcome! " + em + ".\n Your Password is " + pass;


        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        onLogin(v);
    }
}