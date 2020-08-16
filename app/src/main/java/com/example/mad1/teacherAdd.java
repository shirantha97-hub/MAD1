package com.example.mad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class teacherAdd extends AppCompatActivity {
    private ImageButton add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_add);

        add = (ImageButton) findViewById(R.id.t_add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(teacherAdd.this, teacherN.class);
                startActivity(i);
            }
        });
    }
}