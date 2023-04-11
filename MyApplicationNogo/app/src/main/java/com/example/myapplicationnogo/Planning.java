package com.example.myapplicationnogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Planning extends AppCompatActivity {

    private ImageView imageplanning;
    private ImageView imageflechedroiteplanning;
    private ImageView imageflechegaucheplanning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning);

        this.imageplanning=(ImageView) findViewById(R.id.imageplanning);
        this.imageflechedroiteplanning=(ImageView) findViewById(R.id.imageflechedroiteplanning);
        this.imageflechegaucheplanning=(ImageView) findViewById(R.id.imageflechegaucheplanning);


        imageplanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Liste_Planning.class);
                //changer
                startActivity(otherActivity);
                finish();
            }
        });


        imageflechegaucheplanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Courses.class);
                //changer
                startActivity(otherActivity);
                finish();
            }
        });

        imageflechedroiteplanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Recettes.class);
                //changer
                startActivity(otherActivity);
                finish();
            }
        });


    }

}