package com.example.gyslane.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by lucas on 01/09/2017.
 */

public class TelaVeiculo extends AppCompatActivity {
    CheckBox model, category, vehicle, placas;
    Button inserir, delete, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_veiculo1);

        model = (CheckBox) findViewById(R.id.model);
        category = (CheckBox) findViewById(R.id.category);
        vehicle = (CheckBox) findViewById(R.id.vehicle);
        placas = (CheckBox) findViewById(R.id.placas);
        inserir = (Button) findViewById(R.id.inserir);
        delete = (Button) findViewById(R.id.delete);
        exit = (Button) findViewById(R.id.exit);

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
