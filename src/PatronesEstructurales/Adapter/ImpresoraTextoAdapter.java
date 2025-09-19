package PatronesEstructurales.Adapter;

public class ImpresoraTextoAdapter implements Impresora{

    private ImpresoraTexto texto;

    public  ImpresoraTextoAdapter(ImpresoraTexto texto){
        this.texto = texto;
    }

    @Override
    public void imprimir(String contenido){
        texto.imprimirTexto(contenido);
    }

}
