package com.example.mad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class teacherN extends AppCompatActivity {
    private ImageButton view;
    private ImageButton add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_n);

        view = (ImageButton) findViewById(R.id.view2);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(Home.this,
//                        Teacher.class));
                Intent i = new Intent(teacherN.this, addTeacher.class);
                startActivity(i);
            }
        });


        add = (ImageButton) findViewById(R.id.addTeacher);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(teacherN.this, teacherAdd.class);
                startActivity(i);
            }
        });
    }
}
