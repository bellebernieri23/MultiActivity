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

    private EditText nome;
    private EditText nota1;
    private EditText nota2;
    private EditText frequencia;

    private String wnome;
    private double wnota1;
    private double wnota2;
    private int wfrequencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nome = findViewById(R.id.stname);
        wnome = nome.getText().toString();

        nota1 = findViewById(R.id.stnota1);
        wnota1 = Double.parseDouble(nota1.getText().toString());

        nota2 = findViewById(R.id.stnota2);
        wnota2 = Double.parseDouble(nota2.getText().toString());

        frequencia = findViewById(R.id.stfreq);
        wfrequencia = Integer.parseInt(frequencia.getText().toString());



    }

    public void notascal(View view) {

//    Log.i("my log",nome.getText().toString());
    Intent intent = new Intent(MainActivity.this, Activity2.class);
    intent.putExtra("wnome", wnome);
    startActivity(intent);

    }
}
