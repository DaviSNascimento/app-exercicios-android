package com.example.ac1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade, editTextUF, editTextCidade, editTextTelefone, editTextEmail;
    private RadioGroup radioGroupTamanho;
    private CheckBox checkBoxPreto, checkBoxBranco, checkBoxAzul, checkBoxVermelho;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Vincular os componentes da interface
        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        editTextUF = findViewById(R.id.editTextUF);
        editTextCidade = findViewById(R.id.editTextCidade);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextEmail = findViewById(R.id.editTextEmail);
        radioGroupTamanho = findViewById(R.id.radioGroupTamanho);
        checkBoxPreto = findViewById(R.id.checkBoxPreto);
        checkBoxBranco = findViewById(R.id.checkBoxBranco);
        checkBoxAzul = findViewById(R.id.checkBoxAzul);
        checkBoxVermelho = findViewById(R.id.checkBoxVermelho);
        Button buttonSalvar = findViewById(R.id.buttonSalvar);
        textViewResultado = findViewById(R.id.textViewResultado);

        // Configurar o clique do botão "Salvar"
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Capturar os dados
                String nome = editTextNome.getText().toString();
                String idade = editTextIdade.getText().toString();
                String uf = editTextUF.getText().toString();
                String cidade = editTextCidade.getText().toString();
                String telefone = editTextTelefone.getText().toString();
                String email = editTextEmail.getText().toString();

                // Capturar o tamanho selecionado
                int selectedTamanhoId = radioGroupTamanho.getCheckedRadioButtonId();
                RadioButton radioButtonTamanho = findViewById(selectedTamanhoId);
                String tamanho = radioButtonTamanho.getText().toString();

                // Capturar as cores selecionadas
                StringBuilder cores = new StringBuilder();
                if (checkBoxPreto.isChecked()) cores.append("Preto, ");
                if (checkBoxBranco.isChecked()) cores.append("Branco, ");
                if (checkBoxAzul.isChecked()) cores.append("Azul, ");
                if (checkBoxVermelho.isChecked()) cores.append("Vermelho, ");
                if (cores.length() > 0) cores.setLength(cores.length() - 2); // Remover a última vírgula

                // Exibir os dados
                String resultado = "Nome: " + nome + "\n"
                        + "Idade: " + idade + "\n"
                        + "UF: " + uf + "\n"
                        + "Cidade: " + cidade + "\n"
                        + "Telefone: " + telefone + "\n"
                        + "Email: " + email + "\n"
                        + "Tamanho: " + tamanho + "\n"
                        + "Cores: " + cores;

                textViewResultado.setText(resultado);
            }
        });
    }
}