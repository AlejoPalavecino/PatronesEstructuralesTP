package PatronesEstructurales.Bridge;

abstract class Notificacion {
    protected CanalEnvioMensaje canal;

    public Notificacion(CanalEnvioMensaje canal){
        this.canal = canal;
    }

    public abstract void enviarMensaje(String destino);
}
