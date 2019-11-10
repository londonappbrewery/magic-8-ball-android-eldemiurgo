package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnPregunta = findViewById(R.id.preguntabtn);
        final ImageView imagenbola = findViewById(R.id.imageball);

        final int[] images = {R.drawable.ball1, R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

    btnPregunta.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Random numeroram = new Random();
           int numero = numeroram.nextInt(5);
           imagenbola.setImageResource(images[numero]);


        }
    });
    }






}
