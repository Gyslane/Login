package com.example.gyslane.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class TelaPrincipal extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        TextView inserirImagem, inserirTexto;

        inserirImagem = (TextView)findViewById(R.id.inserirImagem);
        inserirTexto = (TextView)findViewById(R.id.inserirTexto);



        /*
        BottomNavigationView home;

        home = (BottomNavigationView) findViewById(R.id.navigation_home);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.home);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        */
    }

}
