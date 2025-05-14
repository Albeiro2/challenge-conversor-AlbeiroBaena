package Principal;

import Modelo.ConexionApi;
import Modelo.Conversor;
import Modelo.MonedaCambio;

public class Principal {

    public static void main(String[] args) {
      MonedaCambio moneda =  ConexionApi.obtenerCambio("ARS");
      Conversor.iniciar();
    }
}
