package a03;

// Implementación para SMS
class NotificacionSMS implements CanalComunicacion {
    
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
    
}