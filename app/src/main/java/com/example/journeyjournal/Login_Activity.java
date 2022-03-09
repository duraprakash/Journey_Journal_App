package com.example.journeyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    TextView tv_Login, tv_SignUp, tv_ForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_Login = findViewById(R.id.tvLogin);
        tv_SignUp = findViewById(R.id.tvSignUp);
        tv_ForgotPassword = findViewById(R.id.tvForgotPassword);

        tv_Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Toast.makeText(Login_Activity.this, "Taking you to login Page", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Login_Activity.this, MainActivity.class);
                startActivity(intent);
            }});

        tv_ForgotPassword.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Login_Activity.this, ForgotPassword_Activity.class);
                startActivity(intent);
            }});

        tv_SignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Login_Activity.this, SignUp_Activity.class);
                startActivity(intent);
            }});



    }
}