package com.example.gyslane.login;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class TelaLogin extends AppCompatActivity {

    EditText editEmail,editSenha;
    Button btLogar;
    TextView txtCadastro;

    String url = "";
    String parametros = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        editEmail = (EditText)findViewById(R.id.loginEmail);
        editSenha = (EditText)findViewById(R.id.loginSenha);
        btLogar = (Button)findViewById(R.id.btLogar);
        txtCadastro = (TextView)findViewById(R.id.txtCadastro);

        //criando evento para o txtCadastro
        //chamando a tela_cadastro
        txtCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreCadastro = new Intent(TelaLogin.this,TelaCadastro.class);
                startActivity(abreCadastro);
            }
        });

        //criando evento para o botao
        btLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //verificando conexao e o estado da rede
                ConnectivityManager connMgr = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
                if(networkInfo != null && networkInfo.isConnected()){
                    url = "https://192.168.15.5:8090/";
                    //new SolicitaDados().execute(stringUrl);
                    new SolicitaDados().execute(url);
                }else{
                    Toast.makeText(getApplicationContext(), "Nenhuma conexão foi detectada", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
    private class SolicitaDados extends AsyncTask<String, Void, String>{
        protected String doInBackground(String...urls){

            return Conexao.postDados(urls[0], parametros);
        }
        protected void onPostExecute(String result){
            //textView.setText(result);
        }
    }
}
