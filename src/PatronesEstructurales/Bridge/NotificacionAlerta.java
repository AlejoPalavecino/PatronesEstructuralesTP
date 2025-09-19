package PatronesEstructurales.Bridge;

class NotificacionAlerta extends Notificacion {
    public NotificacionAlerta(CanalEnvioMensaje canal){
        super(canal);
    }

    @Override
    public void enviarMensaje(String destino) {
        String asunto = "Alerta para " + destino;
        String cuerpo = "Problema a resolver";
        canal.enviar(asunto,cuerpo);
    }
}
