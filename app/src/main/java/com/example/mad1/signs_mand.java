package com.example.mad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class signs_mand extends AppCompatActivity {
    private ImageButton info;
    private ImageButton view;
    private ImageButton add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signs_mand);

        info = (ImageButton) findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(signs_mand.this, sign_info.class);
                startActivity(i);

            }


        });
        view = (ImageButton) findViewById(R.id.smallview1);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(signs_mand.this, editSign.class);
                startActivity(i);

            }


        });

        add = (ImageButton) findViewById(R.id.addsign);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(signs_mand.this, addSign.class);
                startActivity(i);

            }


        });


    }
}