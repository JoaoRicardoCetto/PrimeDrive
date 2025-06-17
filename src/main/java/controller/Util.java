/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import domain.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import org.json.JSONObject;

/**
 *
 * @author joaom
 */
public class Util {
    
    private Util() {
        throw new UnsupportedOperationException("Classe utilitária não pode ser instanciada");
    }

    public static double calcularDiferencaEmDias(Date data1, Date data2) {
        long diffMillis = data2.getTime() - data1.getTime();
        long diffDias = diffMillis / (1000L * 60 * 60 * 24);
        return Math.abs(diffDias);
    }
    
    public static Endereco consultarCEP(String cep) throws MalformedURLException, IOException  {

        Endereco ender = null;
        
        // Definir a URL do serviço ViaCEP
        URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");

        // Definir a URL do serviço GOV.BR
        //URL url = new URL("https://h-apigateway.conectagov.estaleiro.serpro.gov.br/api-cep/v1/consulta/cep/" + cep);

        // Abrir conexão HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Ler a resposta
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        // Converter a resposta JSON em um objeto JSONObject
        JSONObject jsonObject = new JSONObject(response.toString());

        // Exibir as informações do endereço
        if (!jsonObject.has("erro")) {                            
            
            ender = new Endereco(
                                cep,
                                jsonObject.getString("uf"),
                                jsonObject.getString("localidade"),
                                jsonObject.getString("bairro"),
                                "",
                                jsonObject.getString("logradouro"),
                                ""
            );

        } else {
            System.out.println("CEP não encontrado.");
               
        }

        // Fechar conexão
        connection.disconnect();
        return ender;

    }
}
