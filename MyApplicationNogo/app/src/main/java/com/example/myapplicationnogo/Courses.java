package com.example.myapplicationnogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Courses extends AppCompatActivity {

    private ImageView imagecourse;
    private ImageView imageflechegauchecourse;
    private ImageView imageflechedroitecourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        this.imagecourse=(ImageView) findViewById(R.id.imagecourse);
        this.imageflechegauchecourse=(ImageView) findViewById(R.id.imageflechegauchecourse);
        this.imageflechedroitecourse=(ImageView) findViewById(R.id.imageflechedroitecourse);


        imagecourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Liste_Courses.class);
                startActivity(otherActivity);
                finish();
            }
        });

        imageflechegauchecourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        imageflechedroitecourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Planning.class);
                startActivity(otherActivity);
                finish();
            }
        });



    }

}