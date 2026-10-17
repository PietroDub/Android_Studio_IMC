package br.edu.fatecjahu.imcapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText campoPeso = findViewById(R.id.campoPeso);
        EditText campoAltura = findViewById(R.id.campoAltura);
        Button botaoCalcular = findViewById(R.id.botaoCalcular);
        TextView textoResultado = findViewById(R.id.textoResultado);

        botaoCalcular.setOnClickListener(view -> {
            String pesoTexto = campoPeso.getText().toString().trim();
            String alturaTexto = campoAltura.getText().toString().trim();

            textoResultado.setText(getString(
                    R.string.valores_informados,
                    pesoTexto,
                    alturaTexto
            ));
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
