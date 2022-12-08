package com.example.medoss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

public class serge1 extends AppCompatActivity {

    private Button btnSerge1;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serge1);

        db = FirebaseFirestore.getInstance();



        btnSerge1 = findViewById(R.id.btnSerge1);
        clicFrame();

    }

    private void clicFrame() {

        btnSerge1.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {

                //Toast.makeText(serge1.this, "Mes renez vous", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(serge1.this, serge2.class);
                startActivity(intent);

            }
        });
    }
}