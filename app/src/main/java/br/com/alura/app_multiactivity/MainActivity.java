package br.com.alura.app_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Aluno aluno;

    private EditText stname;
    private EditText stnota1;
    private EditText stnota2;
    private EditText stfreq;

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

    public void notascal(View view) {


    stname = findViewById(R.id.stname);
    stnota1 = findViewById(R.id.stnota1);
    stnota2 = findViewById(R.id.stnota2);
    stfreq = findViewById(R.id.stfreq);



    nome = stname.getText().toString();
    nota1 = Double.parseDouble(stnota1.getText().toString());
    nota2 = Double.parseDouble(stnota2.getText().toString());
    frequencia = Integer.parseInt(stfreq.getText().toString());

    media = (nota1 + nota2)/2;

    if (frequencia < 75)
    {
        situacao = "reprovado por falta";
    } else
    {
        if (media < 4)
        {
            situacao = "reprovado por nota";
        } else
            {
                if (media >= 4 && media <= 6.9)
                {
                    situacao = "final";
                } else
                    {
                        situacao = "aprovado";
                    }
            }

    }



    Intent intent = new Intent(MainActivity.this, Activity2.class);
    intent.putExtra("nome", nome);
    intent.putExtra("media", media);
    intent.putExtra("situacao", situacao);

    startActivity(intent);

    }
}
