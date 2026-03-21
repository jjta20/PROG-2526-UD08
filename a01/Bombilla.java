package a01;

class Bombilla implements DispositivoConectado {
    @Override
    public void encender() {
        System.out.println("Bombilla: Luz encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("Bombilla: Luz apagada.");
    }
    // No sobrescribe conectar(), usa el default de la interfaz.
}