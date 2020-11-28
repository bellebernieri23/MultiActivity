package br.com.alura.app_multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    private EditText nome;
    private String wnome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        wnome = getIntent().getStringExtra("wnome");

        nome = findViewById(R.id.stname);
        nome.setText(wnome);
        Log.i("entrada", wnome);
        System.out.println(wnome);
    }
}
