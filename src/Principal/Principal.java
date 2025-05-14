package Principal;

import Modelo.ConexionApi;
import Modelo.MonedaCambio;

public class Principal {

    public static void main(String[] args) {
      MonedaCambio moneda =  ConexionApi.obtenerCambio("COP");
        System.out.println(moneda);
    }
}
