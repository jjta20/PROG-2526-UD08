package a02;

public class A02 {
    public static void main(String[] args) {
        
        System.out.println("=== PRUEBA 1: PAGO CON BIZUM ===");
        // Instanciamos un PagoBizum pero lo guardamos en una variable de tipo Interfaz
        MetodoPago miPago1 = new PagoBizum("655112233");
        
        // Ejecuta la implementación específica de PagoBizum
        miPago1.procesarPago(50.0);
        // Ejecuta el método default de la interfaz (que a su vez llama al método private)
        miPago1.generarFactura(50.0); 

        
        System.out.println("=== PRUEBA 2: PAGO CON TARJETA ===");
        // Instanciamos un PagoTarjeta en otra variable del mismo tipo de Interfaz
        MetodoPago miPago2 = new PagoTarjeta("1234-5678-9012-3456");
        
        miPago2.procesarPago(150.75);
        miPago2.generarFactura(150.75);
        
        
        // EXTRA: Demostración del poder del Polimorfismo con Arrays
        System.out.println("=== PRUEBA 3: PROCESAMIENTO EN LOTE ===");
        MetodoPago[] listaPagos = {
            new PagoBizum("611998877"),
            new PagoTarjeta("9876-0000-1111-2222")
        };
        
        for (MetodoPago pago : listaPagos) {
            pago.procesarPago(30.0); // Sabe perfectamente cuál llamar en cada iteración
            pago.generarFactura(30.0);
        }
    }
}