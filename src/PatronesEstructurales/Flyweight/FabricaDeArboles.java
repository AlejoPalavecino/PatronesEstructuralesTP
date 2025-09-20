package PatronesEstructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {

    public static final Map<String, ArbolTipo> CACHE = new HashMap<>();

    public static ArbolTipo obtenerTipo (String nombreTipo, String textura, String color){

        String clave = nombreTipo + "|" + textura + "|"  + color;

        if(!CACHE.containsKey(clave)){
            System.out.println("Creando nuevo arbol tipo: " + clave);
            CACHE.put(clave, new ArbolTipo(nombreTipo,textura, color));
        }
        return CACHE.get(clave);

    }

    public static int cantidadTipos(){
        return CACHE.size();
    }
}
