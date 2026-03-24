package a03;

// Main -> Probando el polimorfismo.
public class A03 {
    
    public static void main(String[] args) {
        
        // Array del tipo de la INTERFAZ
        CanalComunicacion[] centralita = {
            new NotificacionEmail(),
            new NotificacionSMS(),
            new NotificacionPush()
        };
        
        String alerta = "Mantenimiento urgente del servidor a las 00:00h.";
        System.out.println("--- INICIANDO PROTOCOLO DE ALERTA MASIVA ---");
        
        // Recorremos el array polimórfico
        for (CanalComunicacion canal : centralita) {
            canal.enviarNotificacion(alerta); // Cada objeto sabe cómo enviarlo a su manera
        }
    }
    
}