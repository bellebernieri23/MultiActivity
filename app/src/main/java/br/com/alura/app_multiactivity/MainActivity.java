package br.com.alura.app_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String nome;
    private double nota1;
    private double nota2;
    private int frequencia;
    private double media;
    private String situacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verifyGrade(View view) {
        EditText stname = findViewById(R.id.stname);
        EditText stnota1 = findViewById(R.id.stnota1);
        EditText stnota2 = findViewById(R.id.stnota2);
        EditText stfreq = findViewById(R.id.stfreq);

        nome = stname.getText().toString();
        nota1 = Double.parseDouble(stnota1.getText().toString());
        nota2 = Double.parseDouble(stnota2.getText().toString());
        frequencia = Integer.parseInt(stfreq.getText().toString());

        if (nota1 > 10 || nota2 > 10 || frequencia > 100) {
            Toast msg = Toast.makeText(this, "As notas devem ser de 1 a 10 e a frequência de 1 a 100", Toast.LENGTH_LONG);
            msg.show();
            return;
        }

        media = (nota1 + nota2)/2;
        situacao = calculateResult(frequencia, media);

        Intent intent = new Intent(MainActivity.this, Activity2.class);
        intent.putExtra("nome", nome);
        intent.putExtra("media", media);
        intent.putExtra("situacao", situacao);

        startActivity(intent);
    }

    public String calculateResult(Integer frequencia, Double media) {
        if (frequencia < 75) {
            return "Reprovado por falta";
        }
        if (media < 4) {
            return "Reprovado por nota";
        }
        if (media >= 4 && media <= 6.9) {
            return "Em final";
        }
        return "Aprovado";
    }
}
