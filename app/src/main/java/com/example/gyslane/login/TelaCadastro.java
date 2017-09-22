package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {

    EditText cadastroNome, cadastroEmail, cadastroCelular, cadastroSenha, cadastroConfirmarSenha, cadastroPlaca, cadastroModelo;
    TextView cadastroVeiculo;
    RadioButton cadastroCarro, cadastroMoto;
    Button btCadastrar, btCancelar;
    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        cadastroNome = (EditText) findViewById(R.id.cadastroNome);
        cadastroEmail = (EditText) findViewById(R.id.cadastroEmail);
        cadastroCelular = (EditText) findViewById(R.id.cadastroCelular);
        cadastroSenha = (EditText) findViewById(R.id.cadastroSenha);
        cadastroConfirmarSenha = (EditText) findViewById(R.id.cadastroConfirmarSenha);
        cadastroPlaca = (EditText) findViewById(R.id.cadastroPlaca);
        cadastroModelo = (EditText) findViewById(R.id.cadastroModelo);
        cadastroVeiculo = (TextView) findViewById(R.id.cadastroVeiculo);
        cadastroCarro = (RadioButton) findViewById(R.id.cadastroCarro);
        cadastroMoto = (RadioButton) findViewById(R.id.cadastroMoto);
        btCadastrar = (Button) findViewById(R.id.btCadastrar);
        btCancelar = (Button) findViewById(R.id.btCancelar);
        group = (RadioGroup)findViewById(R.id.group);



        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaPrincipal = new Intent(TelaCadastro.this, TelaPrincipal.class);
                startActivity(abreTelaPrincipal);
            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaLogin = new Intent(TelaCadastro.this, TelaLogin.class);
                startActivity(abreTelaLogin);
            }
        });


    }
//Sempre que for determinar uma ação do RadioButton é necessário ter incluído no layout o RadioGroup
    public void rbclick(View v) {
        int radioButtonId = group.getCheckedRadioButtonId();
        cadastroMoto = (RadioButton)findViewById(radioButtonId);
        cadastroCarro = (RadioButton)findViewById(radioButtonId);

    }
}
