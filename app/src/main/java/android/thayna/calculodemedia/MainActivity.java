package android.thayna.calculodemedia;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText nota1, nota2, nota3, nota4, nomeroFaltas;
    private Button btnCalcular;
    private TextView resultado;
    private String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        initCompotents();

        btn_calcular.setOnClickListener(view->{
            validaCampos();
            calculaMedia();
            resultado.setText("Você no botão calcular");
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void calculaMedia() {
        double n1 = double
    }

    private void validaCampos() {
        if (TextUtils.isEmpty(nota1.getText())){
            nota1.setError("Este campo não pode estar vazio.");
        } else if (TextUtils.isEmpty(nota2.getText())) {
            nota2.setError("Este campo não pode estar vazio");
        } else if (TextUtils.isEmpty(nota3.getText())) {
        nota3.setError("Este campo não pode estar vazio");
        } else if (TextUtils.isEmpty(nota4.getText())) {
        nota4.setError("Este campo não pode estar vazio");
        }
    }

    private void initCompotents() {
        nota1 = findViewById(R.id.nota1);
        nota2 = findViewById(R.id.nota2);
        nota3 = findViewById(R.id.nota3);
        nota4 = findViewById(R.id.nota4);
        numeroFaltas = findViewById(R.id.numero_faltas);
        btnCalcular = findViewById(R.id.btn_calcular);
        resultado = findViewById(R.id.txt_resultado);
    }
}