package a04;

// Clases concreta
class ImpresoraBasica implements Imprimible {
    
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo en blanco y negro: " + documento);
    }
    
}