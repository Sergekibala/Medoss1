package com.example.medoss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class serge2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serge2);
    }

    private void clicFrame(){
        btnSerge1.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_serge2.this, activity_serge3.class);
                startActivity(intent);
            }
        });
}