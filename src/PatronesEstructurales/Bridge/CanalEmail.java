package PatronesEstructurales.Bridge;

public class CanalEmail implements CanalEnvioMensaje {
    @Override
    public void enviar (String asunto, String cuerpo){

        System.out.println("Asunto Email: " + asunto);
        System.out.println("Cuerpo Email: " + cuerpo);

    }
}
