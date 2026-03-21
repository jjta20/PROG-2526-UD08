package a02;

// Implementación PagoBizum

class PagoBizum implements MetodoPago {
    private String telefono;

    public PagoBizum(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Solicitando Bizum de " + importe + "€ al número " + telefono + "...");
        System.out.println("Bizum aceptado.");
    }
}