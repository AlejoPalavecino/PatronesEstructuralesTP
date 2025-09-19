package PatronesEstructurales.Adapter;

public class MainAdapter {
    public static void main(String[] args){

        //Creamos los objetos pero son incompatibles entre si
        ImpresoraPDF impresoraPDF = new ImpresoraPDF();
        ImpresoraTexto impresoraTexto = new ImpresoraTexto();

        //Hacemos la correspondiente adaptacion
        Impresora impPDF = new ImpresoraPDFAdapter(impresoraPDF);
        Impresora impTexto = new ImpresoraTextoAdapter(impresoraTexto);

        impPDF.imprimir("---Conteniodo PDF de prueba-----" + "HOLA MUNDO");
        impTexto.imprimir("---Conteniodo TEXTO de prueba-----" + "HOLA MUNDO");

    }
}
