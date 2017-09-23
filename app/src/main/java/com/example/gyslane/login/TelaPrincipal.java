package com.example.gyslane.login;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TelaPrincipal extends AppCompatActivity {

    private TextView mTextMessage;
    private  TextView infoTextView;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        TextView inserirImagem, inserirTexto;
        ImageButton img, imagemDigitar;

        //btConfig = (Button)findViewById(R.id.btConfig);

        /*inserirImagem = (TextView)findViewById(R.id.inserirImagem);
        inserirTexto = (TextView)findViewById(R.id.inserirTexto);*/

        imagemDigitar = (ImageButton)findViewById(R.id.imagemDigitar);

        imagemDigitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaDigitar = new Intent(TelaPrincipal.this,TelaPlaca.class);
                startActivity(abreTelaDigitar);
            }
        });

        BottomNavigationView bottomNavigationView =(BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_configuracao:
                        Intent abreTelaConfiguracao = new Intent(TelaPrincipal.this,TelaConfiguracao.class);
                        startActivity(abreTelaConfiguracao);
                        break;
                    case R.id.action_home:
                        Toast.makeText(TelaPrincipal.this, "Página principal", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_notification:
                        Toast.makeText(TelaPrincipal.this, "Mensagens", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;

            }

               /* btConfig.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent abreTelaPrincipal = new Intent(TelaCadastro.this,TelaPrincipal.class);
                        startActivity(abreTelaPrincipal);
                    }*/
                });

        img = (ImageButton) findViewById(R.id.imagemCamera);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCamera();
            }
        });}

        public void abrirCamera(){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 0);
        }
        protected void onActivityResul(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            InputStream stream = null;
            if (requestCode == 0 && resultCode == RESULT_OK) {
                try {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    stream = getContentResolver().openInputStream(data.getData());
                    bitmap = BitmapFactory.decodeStream(stream);
                    ImageButton img = null;
                    img.setImageBitmap(resizeImage(this, bitmap, 700, 600));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    if (stream != null) {
                        try {
                            stream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
            private static Bitmap resizeImage (Context context, Bitmap bmpOriginal, float newWidth, float newHeight){
                Bitmap novoBmp = null;

                int w = bmpOriginal.getWidth();
                int h = bmpOriginal.getHeight();

                float densityFactor = context.getResources().getDisplayMetrics().density;
                float novoW = newWidth * densityFactor;
                float novoH = newHeight * densityFactor;

                //Calcula escala em percentual do tamanho original para o novo tamanho
                float scalaW = novoW / w;
                float scalaH = novoH / h;

                //Criando uma matrix para manipulação da imagem Bitmap
                Matrix matrix = new Matrix();

                //Definindo a proporção da escala para o matriz
                matrix.postScale(scalaW, scalaH);

                //Criando o novo Bitmap com o novo tamanho
                novoBmp = Bitmap.createBitmap(bmpOriginal, 0, 0, w, h, matrix, true);

                return novoBmp;
            }
            public void clickMyButton(View view){

            }


        }


