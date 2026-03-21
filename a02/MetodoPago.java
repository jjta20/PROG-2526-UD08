package a02;

// 1. Definición de la interfaz
interface MetodoPago {
    
    // 2. Constante
    double IMPUESTO = 0.21;
    
    // 3. Método abstracto
    void procesarPago(double importe);
    
    // 4. Método privado (solo se puede usar dentro de esta interfaz)
    private void logTransaccion(double importe) {
        System.out.println("[LOG INTERNO SERVER] -> Registrando transacción de: " + importe + "€");
    }
    
    // 5. Método default que hace uso del método privado
    default void generarFactura(double importe) {
        logTransaccion(importe); // Reutilizamos el código del método privado
        double total = importe + (importe * IMPUESTO);
        System.out.println("FACTURA GENERADA: Total a pagar (IVA incluido): " + total + "€\n");
    }
}