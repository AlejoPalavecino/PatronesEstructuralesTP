package PatronesEstructurales.Bridge;

class NotificacionPromocion extends Notificacion{
    public NotificacionPromocion (CanalEnvioMensaje canal){
        super(canal);
    }

    @Override
    public void enviarMensaje(String destino) {
        String asunto = "Promocion para " + destino;
        String cuerpo = "Tienes un 20% de descuento en tu proxima compra";
        canal.enviar(asunto,cuerpo);
    }
}
