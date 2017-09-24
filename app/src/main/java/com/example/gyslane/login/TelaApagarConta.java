package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaApagarConta extends AppCompatActivity {

    Button btExit, btExcluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_apagar_conta);

        btExit = (Button)findViewById(R.id.exit);
        btExcluir = (Button)findViewById(R.id.excluir);

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaConfiguracao = new Intent(TelaApagarConta.this, TelaConfiguracao.class);
                startActivity(abreTelaConfiguracao);
            }
        });

        btExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaConfiguracao = new Intent(TelaApagarConta.this, TelaConfiguracao.class);
                startActivity(abreTelaConfiguracao);
                Toast.makeText(TelaApagarConta.this, "Conta apagada com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
