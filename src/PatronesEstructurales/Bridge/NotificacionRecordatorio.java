package PatronesEstructurales.Bridge;

class NotificacionRecordatorio extends Notificacion{
    public NotificacionRecordatorio (CanalEnvioMensaje canal){
        super(canal);
    }

    @Override
    public void enviarMensaje(String destino) {
        String asunto = "Recordatorio para " + destino;
        String cuerpo = "Tienes una reunion mañana a las 10:00 AM";
        canal.enviar(asunto,cuerpo);
    }
}
