package a04;

// Clase concreta
class ImpresoraBasica implements Imprimible {
    
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo en blanco y negro: " + documento);
    }
    
    public void imprimirDobleCara(String documento) {
        System.out.println("Imprimiendo en doble cara: " + documento);
    }
}