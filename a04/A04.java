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
        
        //Polimorfismo en impresoras - imprimiendo en todas
        ImpresoraBasica impB1 = new ImpresoraBasica();
        ImpresoraBasica impB2 = new ImpresoraBasica();
        ImpresoraBasica impB3 = new ImpresoraBasica();
        ImpresoraAvanzada impA1 = new ImpresoraAvanzada();
        ImpresoraAvanzada impA2 = new ImpresoraAvanzada();
        
        Imprimible[] impresora = {impB1, impB2, impB3, impA1, impA2};
        
        for (Imprimible imp : impresora){
            imp.imprimir("Factura.pdf");
        }
        
        //Da error ya que en la superinterfaz Imprimible, no esta el método para imprimir en doble cara.
        //Imprimible impB4 = new ImpresoraBasica();
        //impB4.imprimirDobleCara("Examen.pdf");
    }
}