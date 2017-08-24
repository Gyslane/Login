package com.example.gyslane.login;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conexao {
    public static String postDados (String urlUsuario, String parametrosUsuario){
        URL url;
        HttpURLConnection connection = null;

        try{
            //transformar a String que o usuario digitou em URL que possa ser identificada pelo JAVA
            url = new URL(urlUsuario);
            connection = (HttpURLConnection) url.openConnection();

            //Passando parametros e metodos confiaveis
            connection.setRequestMethod("POST");

            //Content-Type: especifica para a conexao como que queremos que esses dados sejam codificados durante o envio
            //application/x-www-form-urlencoded: melhor conexao do tipo form. Pega as informacoes baseadas no POST
            // organiza as informaçoes de modo a se parecer como uma paginas web.
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            //Content-Length: tamanho da informação
            //"": numero de bytes da conexao. Transformando para String: + Integer.toString(parametrosUsuarios.getBytes().legth
            connection.setRequestProperty("Content-Lenght", "" + Integer.toString(parametrosUsuario.getBytes().length));

            connection.setRequestProperty("Content-language", "pt-BR");

            //desabilitando o cache. Para não armazenar nada, toda conexao tem que acontecer em tempo real.
            connection.setUseCaches(false);

            //habilitando a entrada e saida de dados da aplicacao.
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //enviando bytes e retornar a informacao
            /*Se der erro acrescentar
            DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
            dataOutputStream.writeBytes(parametrosUsuario);
            dataOutputStream.flush();
            dataOutputStream.close();*/

            //Substituindo as 4 linhas acima, para uma versao do api mais recente do android
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream(),"UTF-8");
            outputStreamWriter.write(parametrosUsuario);
            outputStreamWriter.flush();

            //obter informacao
            InputStream inputStream = connection.getInputStream();

            //colocando os dados no buffer. StringBuffer para juntar as informaçoes
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String linha;
            StringBuffer resposta = new StringBuffer();

            //pegando linha por linha para juntar os dados
            while ((linha = bufferedReader.readLine()) != null){
                resposta.append(linha);
                resposta.append('\r');
            }

            bufferedReader.close();

            return resposta.toString();
        }catch (Exception erro){

            return null;
        }finally {

            if(connection != null){
                connection.disconnect();
            }
        }
    }
}
