package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaAlteraDados extends AppCompatActivity {
    EditText nmalt, emailalt, passwordalt, confirmdalt, phonealt;
    Button alterar, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_altera_dados);
        nmalt = (EditText) findViewById(R.id.nmalt);
        emailalt = (EditText) findViewById(R.id.emailalt);
        passwordalt = (EditText) findViewById(R.id.passwordalt);
        confirmdalt = (EditText) findViewById(R.id.confirmdalt);
        phonealt = (EditText) findViewById(R.id.phonealt);
        alterar = (Button) findViewById(R.id.alterar);
        exit = (Button) findViewById(R.id.exit);

        //O button "alterar vai ter que chamar qual tela"?
        // -----------------------------------------------------------------------------
        //brExit.setOnClickListener(new View.OnClickListener(){
        //@Override
        //public void onClick(View v){
        //  Intent abreTelaLogin = new Intent(TelaConfig.this,TelaLogin.class);
        //startActivity(abreTelaLogin);
        //}
        //});
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaConfiguracao = new Intent(TelaAlteraDados.this, TelaConfiguracao.class);
                startActivity(abreTelaConfiguracao);
            }
        });

        alterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaConfiguracao = new Intent(TelaAlteraDados.this, TelaConfiguracao.class);
                startActivity(abreTelaConfiguracao);
                Toast.makeText(TelaAlteraDados.this, "Dados alterados com sucesso!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
