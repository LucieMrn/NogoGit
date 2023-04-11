package com.example.myapplicationnogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Recettes extends AppCompatActivity {

    private ImageView imagerecettes;
    private ImageView imageflechedroiterecette;
    private ImageView imageflechegaucherecette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recettes);

        this.imagerecettes=(ImageView) findViewById(R.id.imagerecettes);
        this.imageflechedroiterecette=(ImageView) findViewById(R.id.imageflechedroiterecette);
        this.imageflechegaucherecette=(ImageView) findViewById(R.id.imageflechegaucherecette);


        imagerecettes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Liste_Recettes.class);
                //changer
                startActivity(otherActivity);
                finish();
            }
        });


        imageflechegaucherecette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Planning.class);
                //changer
                startActivity(otherActivity);
                finish();
            }
        });

        imageflechedroiterecette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),MainActivity.class);
                //changer
                startActivity(otherActivity);
                finish();
            }
        });


    }

}