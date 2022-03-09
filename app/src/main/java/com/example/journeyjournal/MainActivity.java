package com.example.journeyjournal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
//import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    // 1.1 initial variable
    NavigationView navigationView;
    BottomNavigationView bottomNavigationView;
    ImageView img_Edit, img_Delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_Edit=findViewById(R.id.imgEdit);
        img_Delete=findViewById(R.id.imgDelete);

        img_Edit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, DetailsPage_Activity.class);
                startActivity(intent);
            }});

        img_Delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Clicked Delete Icon", Toast.LENGTH_SHORT).show();
            }});



        //Bottom Navigation Start
        bottomNavigationView=findViewById(R.id.bottom_nav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int items=item.getItemId();
                switch (items){
                    case R.id.bottom_home:
                        Toast.makeText(MainActivity.this, "Clicked Home in Bottom", Toast.LENGTH_SHORT).show();
                        Intent intent_home=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent_home);
                        break;
                    case R.id.bottom_share:
                        Intent share_intent=new Intent(Intent.ACTION_SEND);
                        share_intent.setType("text/plain");
                        share_intent.putExtra(Intent.EXTRA_SUBJECT ,"Your Application Link ");
                        share_intent.putExtra(Intent.EXTRA_TEXT,"Check your cool Application ");
                        startActivity(Intent.createChooser(share_intent,"Share via"));
                        break;
                    case R.id.bottom_setting:
                        Toast.makeText(MainActivity.this, "Clicked Setting in Bottom", Toast.LENGTH_SHORT).show();
                        Intent intent_setting=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent_setting);
                        break;
                    case R.id.bottom_facebook:
                        Toast.makeText(MainActivity.this, "Clicked Facebook in Bottom", Toast.LENGTH_SHORT).show();
                        Intent intent_facebook=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent_facebook);
                        break;
                    case R.id.bottom_messenger:
                        Toast.makeText(MainActivity.this, "Clicked Messenger in Bottom", Toast.LENGTH_SHORT).show();
                        Intent intent_messenger=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent_messenger);
                        break;

                }
                return false;
            }
        });
        //Bottom Navigation End

        // fab start
        // show this when plus button is clicked
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(MainActivity.this, NewPage_Activity.class);
                startActivity(intent);
            }
        });
        // fab end

        //Top Navigation start
        navigationView=findViewById(R.id.navigation);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.home_menu:
                        Toast.makeText(MainActivity.this, "Clicked Home Page ", Toast.LENGTH_SHORT).show();
                        Intent home_intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(home_intent);
                        break;

                    case R.id.about_menu:
                        Toast.makeText(MainActivity.this, "Clicked About Page ", Toast.LENGTH_SHORT).show();
                        Intent about_intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(about_intent);
                        break;

                    case R.id.contact_menu:
                        Toast.makeText(MainActivity.this, "Clicked contact  Page ", Toast.LENGTH_SHORT).show();
                        Intent con_intent=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(con_intent);
                        break;

                    case R.id.share_menu:
                        Intent share_intent=new Intent(Intent.ACTION_SEND);
                        share_intent.setType("text/plain");
                        share_intent.putExtra(Intent.EXTRA_TEXT,"https://www.facebook.com/");
                        share_intent.putExtra(Intent.EXTRA_SUBJECT,"Your Application link hare ");
                        startActivity(Intent.createChooser(share_intent,"share Via"));
                        break;
                }
                return false;
            }
        });
        //Top Navigation End

        // menu icon expand start
        // show top navbar when clicked on menu icon
        final DrawerLayout drawerLayout=findViewById(R.id.drawer_layout);
        findViewById(R.id.imagemenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        // menu icon expand end



    }
}