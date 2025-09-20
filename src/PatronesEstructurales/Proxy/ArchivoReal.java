package PatronesEstructurales.Proxy;

public class ArchivoReal implements Archivo{
    private String nombre;
    private String contenido;

    public ArchivoReal(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    @Override
    public String leer (Usuario usario){
        System.out.println("Abriendo Archivo: " + nombre);
        return contenido;
    }

}
