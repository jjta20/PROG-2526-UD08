package a01;

class Televisor implements DispositivoConectado {
    @Override
    public void encender() {
        System.out.println("Televisor: Iniciando pantalla y cargando canales...");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor: Apagando pantalla.");
    }

    // Sobrescribe el método default para darle un comportamiento específico
    @Override
    public void conectar() {
        System.out.println("Televisor: Conectando a " + ESTANDAR_WIFI + " y buscando actualizaciones de firmware...");
    }
}