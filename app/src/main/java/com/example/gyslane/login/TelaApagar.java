package com.example.gyslane.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lucas on 01/09/2017.
 */

public class TelaApagar extends AppCompatActivity {

    Button btExcluir, btExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        btExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaPrincipal = new Intent(TelaApagar.this,TelaPrincipal.class);
                startActivity(abreTelaPrincipal);
                Toast.makeText(TelaApagar.this, "Conta apagada com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaPrincipal = new Intent(TelaApagar.this,TelaPrincipal.class);
                startActivity(abreTelaPrincipal);
            }
        });
    }
}
