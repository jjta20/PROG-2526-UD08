package a04;

// Clase concreta
class ImpresoraAvanzada implements Multifuncion {
    
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo a todo color y alta calidad: " + documento);
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando documento...");
    }
    
}
