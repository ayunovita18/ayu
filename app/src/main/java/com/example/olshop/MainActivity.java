package com.example.olshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imageclothes;
    ImageButton imageShoes;
    ImageButton imageskrit;
    ImageButton imageAccessories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageclothes =(ImageButton) findViewById(R.id.imageclothes);
        imageShoes = (ImageButton) findViewById(R.id.imageShoes);
        imageskrit = (ImageButton) findViewById(R.id.imageskrit);
        imageAccessories = (ImageButton) findViewById(R.id.imageAccessories);

        imageclothes.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, layout2.class);

                startActivity(intent);

            }

        });

        imageShoes.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, shoes.class);

                startActivity(intent);

            }

        });

        imageskrit.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, rokdancelana.class);

                startActivity(intent);

            }

        });
        imageAccessories.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, accesorries.class);

                startActivity(intent);

            }
        });


    }


}

