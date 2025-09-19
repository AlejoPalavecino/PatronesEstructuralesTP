package PatronesEstructurales.Bridge;

public class CanalSMS implements CanalEnvioMensaje{
    @Override
    public void enviar (String asunto, String cuerpo){

        System.out.println("Asunto SMS: " + asunto);
        System.out.println("Cuerpo SMS: " + cuerpo);

    }
}
