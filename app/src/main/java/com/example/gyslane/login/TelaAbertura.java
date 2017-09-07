package com.example.gyslane.login;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;


public class TelaAbertura extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedIntanceState)
    {
        super.onCreate (savedIntanceState);
        setContentView(R.layout.tela_abertura);

        // Usa-se para chamar a tela de abertura por um curto periodo de tempo e logo em seguinda chamar a tela principal
        Thread timerThread = new Thread() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            public void run()
            { try {
                sleep(950);

            } catch(InterruptedException e) {
                e.printStackTrace();
            } finally {
                Intent bloqueio = new Intent(TelaAbertura.this, TelaLogin.class);
                startActivity(bloqueio);
            }

            }
        };
        //Começar a função de abertura
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();

    }
}
