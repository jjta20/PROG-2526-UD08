package a03;

// Implementación para Push para App móvil
class NotificacionPush implements CanalComunicacion {
    
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Lanzando PUSH a la App: " + mensaje);
    }
    
}