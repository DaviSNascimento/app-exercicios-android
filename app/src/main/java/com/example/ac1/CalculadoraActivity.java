package com.example.ac1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraActivity extends AppCompatActivity {

    private EditText editTextValor1, editTextValor2;
    private Button buttonSomar, buttonSubtrair, buttonMultiplicar, buttonDividir;
    private TextView textViewResultadoCalculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        // Vincular os componentes da interface
        editTextValor1 = findViewById(R.id.editTextValor1);
        editTextValor2 = findViewById(R.id.editTextValor2);
        buttonSomar = findViewById(R.id.buttonSomar);
        buttonSubtrair = findViewById(R.id.buttonSubtrair);
        buttonMultiplicar = findViewById(R.id.buttonMultiplicar);
        buttonDividir = findViewById(R.id.buttonDividir);
        textViewResultadoCalculadora = findViewById(R.id.textViewResultadoCalculadora);

        // Configurar os cliques dos botões da calculadora
        buttonSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularOperacao('+');
            }
        });

        buttonSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularOperacao('-');
            }
        });

        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularOperacao('*');
            }
        });

        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularOperacao('/');
            }
        });
    }

    // Método para realizar as operações da calculadora
    private void calcularOperacao(char operacao) {
        double valor1 = Double.parseDouble(editTextValor1.getText().toString());
        double valor2 = Double.parseDouble(editTextValor2.getText().toString());
        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = valor1 + valor2;
                break;
            case '-':
                resultado = valor1 - valor2;
                break;
            case '*':
                resultado = valor1 * valor2;
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    textViewResultadoCalculadora.setText("Erro: Divisão por zero!");
                    return;
                }
                break;
        }

        textViewResultadoCalculadora.setText("Resultado: " + resultado);
    }
}