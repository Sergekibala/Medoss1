package com.example.medoss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class serge2 extends AppCompatActivity {


    private Button btnSerge21;
    private Button btnSerge22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serge2);
        btnSerge22 = findViewById(R.id.btnSerge22);
        btnSerge21 = findViewById(R.id.btnSerge21);

        clicFrame();
        clicFrame3();

    }

    private void clicFrame() {

        btnSerge22.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(serge2.this, serge3.class);
                startActivity(intent);
            }
        });
    }

//}


///   ici jai place le deuxieme Bouton "Mes disponibilites"


    public void clicFrame3() {
        btnSerge21.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(serge2.this, MesDispo.class);
                startActivity(intent);

            }
        });
    }

}









