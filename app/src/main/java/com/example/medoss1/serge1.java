package com.example.medoss1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.UUID;


public class serge1 extends AppCompatActivity {

    private Button btnSerge1;
    private FirebaseFirestore db;

    private EditText editTextNom, editTextPrenom;

    private void  initUI(){
        editTextNom=findViewById(R.id.editTextNom);
        editTextPrenom=findViewById(R.id.editTextPrenom);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serge1);
        initUI();

        db = FirebaseFirestore.getInstance();

        btnSerge1 = findViewById(R.id.btnSerge1);
        clicFrame();
    }

    private void createUserInFirestore() {
        String nom = editTextNom.getText().toString();
        String prenom = editTextPrenom.getText().toString();
        String id = UUID.randomUUID().toString(); // Ici tu remplaceras par le userId de l'utilisateur courant obtneu dans Authenticator

        Donnees myDataToFirestore = new Donnees(id, nom, prenom);

        db.collection("Users").document(id).set(myDataToFirestore)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Intent intent = new Intent(serge1.this, serge2.class);
                        startActivity(intent);
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(serge1.this, "Something get wrong !!!", Toast.LENGTH_SHORT).show();
                    }
                });

    }

    private void clicFrame() {
        btnSerge1.setOnClickListener(new View.OnClickListener() { // Gestion du clic avec le listener
            @Override
            public void onClick(View view) {
                createUserInFirestore();
                //Toast.makeText(serge1.this, "Mes renez vous", Toast.LENGTH_LONG).show();
            }
        });
    }
}