package a02;

// Implementación PagoTarjeta

class PagoTarjeta implements MetodoPago {
    private String numTarjeta;

    public PagoTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Conectando con el TPV para la tarjeta " + numTarjeta + "...");
        System.out.println("Pago con tarjeta autorizado.");
    }
}