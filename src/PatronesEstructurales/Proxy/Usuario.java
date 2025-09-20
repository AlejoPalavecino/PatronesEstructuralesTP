package PatronesEstructurales.Proxy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
    String nombre;
    Set<String> permisos = new HashSet<>();

    public Usuario(String nombre, String permisos) {
        this.nombre = nombre;
        if (permisos != null){
            this.permisos.addAll(Arrays.asList(permisos));
        }
    }

    public boolean tienepermisos(String permiso){
        return permisos.contains(permiso);
    }



}
