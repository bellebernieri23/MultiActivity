package br.com.alura.app_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
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

        TextView stname = findViewById(R.id.stname);
        TextView stmedia = findViewById(R.id.stmedia);
        TextView stsitu = findViewById(R.id.stsitu);

        stname.setText(nome);
        stmedia.setText(String.valueOf(media));
        stsitu.setText(situacao);
    }
}
