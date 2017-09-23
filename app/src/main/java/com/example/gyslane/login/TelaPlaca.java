package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaPlaca extends AppCompatActivity {

    EditText letra, numero;
    Button btOK, btCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_placa);

        letra = (EditText)findViewById(R.id.letra);
        numero = (EditText)findViewById(R.id.numero);
        btOK = (Button)findViewById(R.id.btOK);
        btCancelar = (Button)findViewById(R.id.btCancelar);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaDados = new Intent(TelaPlaca.this, TelaDados.class);
                startActivity(abreTelaDados);
            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaDados = new Intent(TelaPlaca.this, TelaPrincipal.class);
                startActivity(abreTelaDados);
            }
        });
    }
}
