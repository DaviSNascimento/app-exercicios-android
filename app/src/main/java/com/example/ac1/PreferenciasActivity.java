package com.example.ac1;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PreferenciasActivity extends AppCompatActivity {

    private CheckBox checkBoxNotificacoes, checkBoxModoEscuro, checkBoxLembrarLogin;
    private Button buttonSalvarPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        // Vincular os componentes da interface
        checkBoxNotificacoes = findViewById(R.id.checkBoxNotificacoes);
        checkBoxModoEscuro = findViewById(R.id.checkBoxModoEscuro);
        checkBoxLembrarLogin = findViewById(R.id.checkBoxLembrarLogin);
        buttonSalvarPreferencias = findViewById(R.id.buttonSalvarPreferencias);

        // Configurar o clique do botão: Salvar Preferências
        buttonSalvarPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verificar quais CheckBoxes estão marcados
                StringBuilder preferencias = new StringBuilder();

                if (checkBoxNotificacoes.isChecked()) {
                    preferencias.append("Receber notificações, ");
                }
                if (checkBoxModoEscuro.isChecked()) {
                    preferencias.append("Modo escuro, ");
                }
                if (checkBoxLembrarLogin.isChecked()) {
                    preferencias.append("Lembrar login, ");
                }

                // Verificar se alguma preferência foi escolhida
                if (preferencias.length() > 0) {
                    preferencias.setLength(preferencias.length() - 2);

                    Toast.makeText(PreferenciasActivity.this, "Preferências: " + preferencias.toString(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PreferenciasActivity.this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}