package PatronesEstructurales.Proxy;

public class ArchivoProxy implements Archivo{
    private ArchivoReal archivoReal;
    private String permisosNecesarios;

    public ArchivoProxy (String nombreArchivo, String contenido, String permisosNecesarios){
        this.archivoReal=new ArchivoReal(nombreArchivo,permisosNecesarios);
        this.permisosNecesarios=permisosNecesarios;
    }

    @Override
    public String leer(Usuario usuario){
        if (usuario == null || !usuario.tienepermisos(permisosNecesarios)){
            System.out.println("Acceso denegado para el usuario: " + (usuario==null? "Desconocido":usuario.nombre));
            return "Error: Acceso denegado";
        }
        System.out.println("Acceso permitido a: " + usuario.nombre);
        return archivoReal.leer(usuario);
    }




}
