package com.example.journeyjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class SplashScreen_Activity extends AppCompatActivity {

    // numbers between: 1 - 2

    // 1.0 initial variable/attributes
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // hide action bar doesn't work if themes is set to no_actionbar
        // getSupportActionBar().hide();

        // Transparent ActionBar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        // 1.2 assign id to variables/attributes
        imageView=findViewById(R.id.image);
        textView=findViewById(R.id.txt);

        // 2.0 animation effect to image // 2.1 animation.xml first
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imageView.startAnimation(animation);

        // 3.0 delay splash screen
        // 3.1 class variable(instance) = new object
        Thread thread=new Thread() {
            @Override
            // 3.2 method
            public void run() {
                try {
                    // 3.3 delay splash screen for 9sec
                    sleep(9000);
                } catch (InterruptedException e) {
                    // 3.4 show error message
                    e.printStackTrace();
                }
                finally{
                    // 3.5 intent: go to another activity
                    Intent intent=new Intent(SplashScreen_Activity.this,Login_Activity.class);
                    startActivity(intent);
                }

            }
        };
        // 3.6 start the thread // 3.7 AndroidManifest.xml
        thread.start();

        // 4.0 creating handler: exit app when back button is clicked
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 4.1 exit app
                System.exit(1);
            }
        }, 9000); // 4.1 set time

    }
}