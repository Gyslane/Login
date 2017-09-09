package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TelaDigitar extends AppCompatActivity {
    EditText informarPlaca;
    Button btIncluir, btCancelar;

    public static final int CONSTANTE_TELA_DADOS = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_digitar);

        informarPlaca = (EditText)findViewById(R.id.informarPlaca);
        btIncluir = (Button)findViewById(R.id.btIncluir);
        btCancelar = (Button)findViewById(R.id.btCancelar);

        btIncluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaDados = new Intent(TelaDigitar.this,TelaDados.class);
                startActivity(abreTelaDados);
            }
        });
        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaDados = new Intent(TelaDigitar.this,TelaPrincipal.class);
                startActivity(abreTelaDados);
            }
        });
    }
    public void enviarDadosTelaDados(View view){
        EditText informarPlaca = (EditText)findViewById(R.id.informarPlaca);

        Bundle params = new Bundle();
        params.putString("informarPlaca", informarPlaca.getText().toString());

        Intent intent = new Intent(this, TelaDados.class);
        intent.putExtras(params);

        startActivityForResult(intent, CONSTANTE_TELA_DADOS);
    }

    protected void onActivityResult(int codigoTela, int resultado, Intent intent){
        if(codigoTela == CONSTANTE_TELA_DADOS){
            Bundle params = intent.getExtras();
            if(params != null){
                String msg = params.getString("msg");
                Toast.makeText(this, "Tela Dados -> Resultado: "+resultado+" | Msg: "+msg, Toast.LENGTH_LONG).show();
            }
        }
    }
}
