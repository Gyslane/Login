package com.example.gyslane.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TelaDados extends AppCompatActivity {

    Button btEnviar, btCancelar;
    private String[] mansagens = new String[]{"* Selecione ", "Farol ligado", "Vidro aberto", "Colidi no seu veículo", "Roubo de carro", "Veículo obstruindo passagem",
    "Colidi na sua moto", "Roubo de moto"};

    private Spinner sp;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_dados);

       /* ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        spinner.setAdapter(adapter);*/

        btCancelar = (Button)findViewById(R.id.btCancelar);

        btCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaDados = new Intent(TelaDados.this,TelaPrincipal.class);
                startActivity(abreTelaDados);
            }
        });

        btEnviar = (Button)findViewById(R.id.btEnviar);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sp.getSelectedItem() == "* Selecione ")
                {
                    Toast.makeText(TelaDados.this, "Selecione uma mensagem!", Toast.LENGTH_SHORT).show();
                    Intent abreTelaDados = new Intent(TelaDados.this,TelaDados.class);
                    startActivity(abreTelaDados);

                }else if(sp.getSelectedItem() != "* Selecione "){
                    Toast.makeText(TelaDados.this, "Mensagem enviada com sucesso!", Toast.LENGTH_SHORT).show();
                    Intent abreTelaDados = new Intent(TelaDados.this,TelaPrincipal.class);
                    startActivity(abreTelaDados);
                }

            }
        });

        Intent intent = getIntent();
        if(intent != null){
            Bundle params = intent.getExtras();
            if(params != null){
                String informarPlaca = params.getString("informarPlaca");

                TextView placa = (TextView)findViewById(R.id.informarPlaca);

                placa.setText("Placa: "+informarPlaca);
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, mansagens);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp = (Spinner)findViewById(R.id.spinner);
        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void showElemento(View view){
        String nome = (String) sp.getSelectedItem();
        long id = sp.getSelectedItemId();
        int posicao = sp.getSelectedItemPosition();
    }

    public void ok(View view){
        Intent intent = new Intent();
        intent.putExtra("msg", "OK");

        setResult(1, intent);
        finish();
    }
}
