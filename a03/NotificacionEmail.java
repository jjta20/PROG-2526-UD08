package a03;

// Implementación para correo electrónico
class NotificacionEmail implements CanalComunicacion {
    
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
    
}