package com.example.medoss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class serge2 extends AppCompatActivity {


    Button btnSerge21;
  //Button btnSerge22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serge2);
    }

    private void clicFrame(){

        btnSerge21.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(serge2.this, serge3.class);
                startActivity(intent);
            }
        });
}}