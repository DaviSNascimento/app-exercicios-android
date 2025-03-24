package com.example.ac1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private Button buttonExercicio1, buttonExercicio2, buttonExercicio3, buttonExercicio4, buttonExercicio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Vincular os componentes da interface
        buttonExercicio1 = findViewById(R.id.buttonExercicio1);
        buttonExercicio2 = findViewById(R.id.buttonExercicio2);
        buttonExercicio3 = findViewById(R.id.buttonExercicio3);
        buttonExercicio4 = findViewById(R.id.buttonExercicio4);
        buttonExercicio5 = findViewById(R.id.buttonExercicio5);
        // Configurar o clique do botão para o Exercício 1
        buttonExercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Configurar o clique do botão para o Exercício 2
        buttonExercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CalculadoraActivity.class);
                startActivity(intent);
            }
        });

        buttonExercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });
        buttonExercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, LetrasActivity.class);
                startActivity(intent);
            }
        });
        buttonExercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PreferenciasActivity.class);
                startActivity(intent);
            }
        });
    }
}