package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class TelaCadastro extends AppCompatActivity {

    EditText cadastroNome, cadastroEmail, cadastroCelular, cadastroSenha, cadastroConfirmarSenha, cadastroPlaca, cadastroModelo;
    TextView cadastroVeiculo;
    RadioButton cadastroCarro, cadastroMoto;
    Button btCadastrar, btCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        cadastroNome = (EditText)findViewById(R.id.cadastroNome);
        cadastroEmail = (EditText)findViewById(R.id.cadastroEmail);
        cadastroCelular = (EditText)findViewById(R.id.cadastroCelular);
        cadastroSenha = (EditText)findViewById(R.id.cadastroSenha);
        cadastroConfirmarSenha = (EditText)findViewById(R.id.cadastroConfirmarSenha);
        cadastroPlaca = (EditText)findViewById(R.id.cadastroPlaca);
        cadastroModelo = (EditText)findViewById(R.id.cadastroModelo);
        cadastroVeiculo = (TextView)findViewById(R.id.cadastroVeiculo);
        cadastroCarro = (RadioButton)findViewById(R.id.cadastroCarro);
        cadastroMoto = (RadioButton)findViewById(R.id.cadastroMoto);
        btCadastrar = (Button)findViewById(R.id.btCadastrar);
        btCancelar = (Button)findViewById(R.id.btCancelar);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaPrincipal = new Intent(TelaCadastro.this,TelaPrincipal.class);
                startActivity(abreTelaPrincipal);
            }
        });

        /*Tentei alterar o nome da barra de título
        final boolean customTitleSupported = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        setContentView(R.layout.main);


        if ( customTitleSupported ) {
            getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
        }

        final TextView myTitleText = (TextView) findViewById(R.id.myTitle);
        if ( myTitleText != null ) {
            myTitleText.setText("NEW TITLE");
        }
        */
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaLogin = new Intent(TelaCadastro.this, TelaLogin.class);
                startActivity(abreTelaLogin);
            }
        });
    }
}
