package com.example.journeyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SignUp_Activity extends AppCompatActivity {

    TextView tv_register, tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        tv_register = findViewById(R.id.tvRegister);
        tv_login = findViewById(R.id.tvLogin);

        tv_register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SignUp_Activity.this, Login_Activity.class);
                startActivity(intent);
            }});

        tv_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(SignUp_Activity.this, Login_Activity.class);
                startActivity(intent);
            }});
        
    }
}