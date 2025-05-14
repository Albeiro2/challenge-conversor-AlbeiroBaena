package Modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {



    public static MonedaCambio obtenerCambio(String moneda){
        //Definimos la direccion de la api en una variable
        String direccion = "https://v6.exchangerate-api.com/v6/e98016384462472accd8bf7e/latest/"+moneda;
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try{
            //Obtenemos todos los cambios de moneda respecto a la moneda principal
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

               //Para evitar algun error en la obtencion del json
            if (response.statusCode() == 200){
                //Retornamos las monedas respecto al tipo de cambio
                String jsonModenas = response.body();

                MonedasApi monedasApi =gson.fromJson(jsonModenas,MonedasApi.class);
                return new MonedaCambio(monedasApi);
            }else {
                return null;
            }



        }catch(Exception e){

            System.out.println(e.getMessage());
            return null;
        }

    }

}
