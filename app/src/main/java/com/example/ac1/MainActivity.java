package com.example.ac1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade;
    private Button buttonVerificar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Vincular os componentes da interface
        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        buttonVerificar = findViewById(R.id.buttonVerificar);
        textViewResultado = findViewById(R.id.textViewResultado);

        // Configurar o clique do botão
        buttonVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Capturar os dados digitados
                String nome = editTextNome.getText().toString();
                int idade = Integer.parseInt(editTextIdade.getText().toString());

                // Verificar se é maior de idade
                if (idade >= 18) {
                    textViewResultado.setText(nome + ", você é maior de idade!");
                } else {
                    textViewResultado.setText(nome + ", você é menor de idade!");
                }

            }
        });
    }
}