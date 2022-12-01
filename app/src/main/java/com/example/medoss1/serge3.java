package com.example.medoss1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class serge3 extends AppCompatActivity {
Button btnSerge3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serge3);

    }
    private void clicFrame(){
        btnSerge3.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(serge3.this, serge4.class);
                startActivity(intent);
            }
        });


}
}