package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class TelaVeiculo1 extends AppCompatActivity {
    ImageButton imagemAdicionar, imagemDeletar;
    Button btCadastrar, btCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_veiculo1);

        imagemAdicionar = (ImageButton)findViewById(R.id.imagemAdicionar);
        imagemDeletar = (ImageButton)findViewById(R.id.imagemDeletar);
        btCadastrar = (Button)findViewById(R.id.btCadastrar);
        btCancelar = (Button)findViewById(R.id.btCancelar);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TelaVeiculo1.this, "Veículo cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                Intent abreTelaAlteraDados = new Intent(TelaVeiculo1.this, TelaConfiguracao.class);
                startActivity(abreTelaAlteraDados);
            }
        });

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaVeiculo = new Intent(TelaVeiculo1.this, TelaConfiguracao.class);
                startActivity(abreTelaVeiculo);
            }
        });




        // Os buttons inserir e delete vão ter que chamar o banco direto.
        //brExit.setOnClickListener(new View.OnClickListener(){
        //@Override
        //public void onClick(View v){
        //  Intent abreTelaLogin = new Intent(TelaConfig.this,TelaLogin.class);
        //startActivity(abreTelaLogin);
        //}
        //});
    }
}
