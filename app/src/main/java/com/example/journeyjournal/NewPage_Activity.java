package com.example.journeyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NewPage_Activity extends AppCompatActivity {

    ImageView img_BackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_page);

        img_BackArrow = findViewById(R.id.imgBackArrow);

        img_BackArrow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(NewPage_Activity.this, MainActivity.class);
                startActivity(intent);
            }});

    }
}