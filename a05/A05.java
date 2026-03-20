package a05;

import a03.CanalComunicacion;

public class A05 {
    public static void main(String[] args) {
        
        // Implementación al vuelo:
        CanalComunicacion palomaMensajera = new CanalComunicacion() {
            @Override
            public void enviar(String mensaje) {
                System.out.println("La paloma ha llegado con el pergamino: " + mensaje);
            }
        };
        
        // Uso del objeto anónimo
        palomaMensajera.enviar("Coo coo: El CEO os saluda");
    }
}