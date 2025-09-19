package PatronesEstructurales.Adapter;

public class ImpresoraPDFAdapter implements Impresora {
    private ImpresoraPDF pdf; //Relacion de composición

    public ImpresoraPDFAdapter(ImpresoraPDF pdf){
        this.pdf = pdf; //Guardo la referencia
    }

    @Override
    public void imprimir (String contenido){
        pdf.imprimirPDF(contenido); //Traducimos la llamada generica al metodo especifico
    }

}
