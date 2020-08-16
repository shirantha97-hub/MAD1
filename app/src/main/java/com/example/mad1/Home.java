 package com.example.mad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

 public class Home extends AppCompatActivity {
     private ImageButton button1;
     private ImageButton sign_btn;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_home);

         button1 = (ImageButton) findViewById(R.id.teacher);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
//                startActivity(new Intent(Home.this,
//                        Teacher.class));
                 Intent i = new Intent(Home.this, teacherN.class);
                 startActivity(i);

             }


         });

         sign_btn = (ImageButton) findViewById(R.id.signs);
         sign_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
//                startActivity(new Intent(Home.this,
//                        Teacher.class));
                 Intent i = new Intent(Home.this, signs_mand.class);
                 startActivity(i);

             }
         });
     }
 }