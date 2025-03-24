package com.example.ac1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class LetrasActivity extends AppCompatActivity {

    private EditText editTextNome;
    private Button buttonGerarCheckBoxes;
    private LinearLayout linearLayoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letras);

        // Vincular os componentes da interface
        editTextNome = findViewById(R.id.editTextNome);
        buttonGerarCheckBoxes = findViewById(R.id.buttonGerarCheckBoxes);
        linearLayoutContainer = findViewById(R.id.linearLayoutContainer);

        // Configurar o clique do botão "Gerar CheckBoxes"
        buttonGerarCheckBoxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Limpar CheckBoxes anteriores
                linearLayoutContainer.removeAllViews();

                // Capturar o nome digitado
                String nome = editTextNome.getText().toString();

                // Gerar um CheckBox para cada letra do nome
                for (char letra : nome.toCharArray()) {
                    // Criar um novo CheckBox
                    CheckBox checkBox = new CheckBox(LetrasActivity.this);
                    checkBox.setText(String.valueOf(letra)); // Define o texto do CheckBox como a letra
                    checkBox.setLayoutParams(new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT
                    ));

                    // Adicionar o CheckBox ao LinearLayout
                    linearLayoutContainer.addView(checkBox);
                }
            }
        });
    }
}