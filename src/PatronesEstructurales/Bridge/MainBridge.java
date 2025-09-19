package PatronesEstructurales.Bridge;

public class MainBridge {
    public static void main(String[] args) {

        // Elegimos canales (implementaciones) que podrían cambiar en tiempo de ejecución
        CanalEnvioMensaje canalEmail = new CanalEmail();
        CanalEnvioMensaje canalSMS = new CanalSMS();

        // Creamos notificaciones (abstracciones) independientemente del canal
        Notificacion alertaPorEmail = new NotificacionAlerta(canalEmail);
        Notificacion recordatorioPorSMS = new NotificacionRecordatorio(canalSMS);
        Notificacion promoPorEmail = new NotificacionPromocion(canalEmail);
        Notificacion promoPorSMS = new NotificacionPromocion(canalSMS);

        // Enviamos (mismo tipo puede usar distinto canal, y viceversa)
        alertaPorEmail.enviarMensaje("Juan");
        recordatorioPorSMS.enviarMensaje("Lucía");
        promoPorEmail.enviarMensaje("María");
        promoPorSMS.enviarMensaje("Carlos");


    }
}
