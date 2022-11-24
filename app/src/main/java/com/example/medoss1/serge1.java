package com.example.medoss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class serge1 extends AppCompatActivity {

    private Button btnSerge1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serge1);
    }

    public void initUi() {

        btnSerge1 = findViewById(R.id.btnSerge1);

    }

    private void clicFrame() {

        btnSerge1.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_serge1.this, activity_serge2.class);
                startActivity(intent);


            }
        });
    }
}