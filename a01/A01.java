package a01;

class A01 {
    public static void main(String[] args) {
        
        // Llamada al método estático de la interfaz (sin instanciar nada)
        DispositivoConectado.mostrarInfoGeneral();
        System.out.println("-------------------------------------------------");
        
        // Polimorfismo con variables de tipo Interfaz
        DispositivoConectado miLuz = new Bombilla();
        miLuz.encender();
        miLuz.conectar(); // Llama al default genérico
        miLuz.apagar();
        
        System.out.println("-------------------------------------------------");
        
        DispositivoConectado miTele = new Televisor();
        miTele.encender();
        miTele.conectar(); // Llama al sobrescrito
        miTele.apagar();
    }
}