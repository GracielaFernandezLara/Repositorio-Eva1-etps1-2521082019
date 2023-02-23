package sv.edu.utec.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IMCActivity extends AppCompatActivity {

    private EditText etPeso, etAltura;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcactivity);

        etPeso = findViewById(R.id.etPeso);
        etAltura= findViewById(R.id.etAltura);
        tvResultado = findViewById(R.id.tvResultado);

        Button  btnCalcular= findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso = Double.parseDouble(etPeso.getText().toString());
                double altura = Double.parseDouble(etAltura.getText().toString()) / 100;
                double imc = peso / (altura * altura);
                String imcEstado;
                if (imc < 10.5) {
                    imcEstado = "Críticamente Bajo de Peso";
                } else if (imc < 15.9) {
                    imcEstado = "Severamente Bajo de Peso";
                } else if (imc < 18.5) {
                    imcEstado = "Bajo de Peso";
                } else if (imc < 25) {
                    imcEstado = "Normal (Peso saludable)";
                } else if (imc < 30) {
                    imcEstado = "Sobrepeso";
                } else if (imc < 35) {
                    imcEstado = "Obesidad Clase 1 - Moderadamente Obeso";
                } else if (imc < 40) {
                    imcEstado = "Obesidad Clase 2 - Severamente Obeso";
                } else {
                    imcEstado = "Obesidad Clase 3 - Críticamente Obeso";
                }
                tvResultado.setText("IMC: " + String.format("%.2f", imc) + "\nEstado: " + imcEstado);
            }
        });
    }
}