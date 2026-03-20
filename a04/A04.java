package a04;

// El Main
public class A04 {
    
    public static void main(String[] args) {
        
        ImpresoraBasica basica = new ImpresoraBasica();
        ImpresoraAvanzada laser = new ImpresoraAvanzada();
        
        basica.imprimir("Contrato.pdf");
        // basica.escanear(); // ERROR DE COMPILACIÓN: El método no existe en Imprimible ni en ImpresoraBasica.
        
        laser.imprimir("Nomina.pdf");
        laser.escanear(); // Funciona perfectamente porque firma el contrato Multifuncion
    }
}