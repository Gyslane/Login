package com.example.gyslane.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by lucas on 01/09/2017.
 */

public class MainActivity extends AppCompatActivity {
    Button brEdition, brRegister;
    Button brDelete, brExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        brEdition = (Button) findViewById(R.id.brEdition);
        brRegister = (Button) findViewById(R.id.brRegister);
        brDelete = (Button) findViewById(R.id.brDelete);
        brExit = (Button) findViewById(R.id.brExit);

        //criando evento para o brEdition
        //chamando a TelaAltera
        brEdition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaAltera = new Intent(MainActivity.this, TelaAltera.class);
                startActivity(abreTelaAltera);
            }
        });
        //criando evento para o brRegister
        //chamando a TelaVeiculo
        brRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaVeiculo = new Intent(MainActivity.this, TelaVeiculo.class);
                startActivity(abreTelaVeiculo);
            }
        });
        //criando evento para o brDelete
        //chamando a TelaApagar
        brDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaApagar = new Intent(MainActivity.this, TelaApagar.class);
                startActivity(abreTelaApagar);
            }
        });
        //brExit.setOnClickListener(new View.OnClickListener(){
        //@Override
        //public void onClick(View v){
        //  Intent abreTelaLogin = new Intent(MainActivity.this,TelaLogin.class);
        //startActivity(abreTelaLogin);
        //}
        //});
    }
}
