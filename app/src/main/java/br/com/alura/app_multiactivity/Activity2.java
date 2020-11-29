package br.com.alura.app_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private EditText stname;
    private EditText stmedia;
    private EditText stsitu;

    private String nome;
    private double media;
    private String situacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        nome = getIntent().getStringExtra("nome");
        media = getIntent().getDoubleExtra("media", media);
        situacao = getIntent().getStringExtra("situacao");

        stname = findViewById(R.id.stname);
        stmedia = findViewById(R.id.stmedia);
        stsitu = findViewById(R.id.stsitu);


        stname.setText(nome);
        stmedia.setText(String.valueOf(media));
        stsitu.setText(situacao);







    }
}
