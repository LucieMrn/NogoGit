package com.example.myapplicationnogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagefrigo;
    private ImageView imageflechedroitefrigo;
    private ImageView imageflechegauchefrigo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imagefrigo=(ImageView) findViewById(R.id.imagefrigo);
        this.imageflechedroitefrigo=(ImageView) findViewById(R.id.imageflechedroitefrigo);
        this.imageflechegauchefrigo=(ImageView) findViewById(R.id.imageflechegauchefrigo);

        imagefrigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Liste_Frigo.class);
                startActivity(otherActivity);
                finish();
            }
        });

        imageflechedroitefrigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Courses.class);
                startActivity(otherActivity);
                finish();
            }
        });

        imageflechegauchefrigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity= new Intent(getApplicationContext(),Recettes.class);
                startActivity(otherActivity);
                finish();
            }
        });




    }
}