package com.example.gyslane.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by lucas on 01/09/2017.
 */

public class TelaAltera extends AppCompatActivity {
    EditText nmalt, emailalt, passwordalt, confirmdalt, phonealt;
    Button alterar, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar);

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
        //  Intent abreTelaLogin = new Intent(MainActivity.this,TelaLogin.class);
        //startActivity(abreTelaLogin);
        //}
        //});

    }
}
