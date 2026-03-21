package a01;

// 1. Definición de la interfaz
interface DispositivoConectado {
    
    // 2. Atributo (es public static final por defecto)
    String ESTANDAR_WIFI = "Wi-Fi 7";
    
    // 3. Métodos abstractos
    void encender();
    void apagar();
    
    // 4. Método default
    default void conectar() {
        System.out.println("Conectando el dispositivo a la red mediante " + ESTANDAR_WIFI);
    }
    
    // 5. Método estático
    static void mostrarInfoGeneral() {
        System.out.println("Los dispositivos inteligentes hacen tu vida más fácil.");
    }
}