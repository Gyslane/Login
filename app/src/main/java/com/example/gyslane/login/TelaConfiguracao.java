package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TelaConfiguracao extends AppCompatActivity {

    Button brEdition, brRegister;
    Button brDelete, brExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_configuracao);

        brEdition = (Button) findViewById(R.id.brEdition);
        brRegister = (Button) findViewById(R.id.brRegister);
        brDelete = (Button) findViewById(R.id.brDelete);
        brExit = (Button) findViewById(R.id.brExit);

        //criando evento para o brEdition
        //chamando a TelaAltera
        brEdition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaAlteraDados = new Intent(TelaConfiguracao.this, TelaAlteraDados.class);
                startActivity(abreTelaAlteraDados);
            }
        });
        //criando evento para o brRegister
        //chamando a TelaVeiculo
        brRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaVeiculo = new Intent(TelaConfiguracao.this, TelaVeiculo.class);
                startActivity(abreTelaVeiculo);
            }
        });
        //criando evento para o brDelete
        //chamando a TelaApagar
        brDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaApagarConta = new Intent(TelaConfiguracao.this, TelaApagarConta.class);
                startActivity(abreTelaApagarConta);
            }
        });
        brExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TelaConfiguracao.this, "Página principal", Toast.LENGTH_SHORT).show();
                Intent abreTelaPrincipal = new Intent(TelaConfiguracao.this, TelaPrincipal.class);
                startActivity(abreTelaPrincipal);
            }
        });
        //brExit.setOnClickListener(new View.OnClickListener(){
        //@Override
        //public void onClick(View v){
        //  Intent abreTelaLogin = new Intent(TelaConfig.this,TelaLogin.class);
        //startActivity(abreTelaLogin);
        //}
        //});


    }
}
