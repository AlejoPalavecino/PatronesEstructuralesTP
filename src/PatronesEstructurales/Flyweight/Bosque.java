package PatronesEstructurales.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
    private List<Arbol> arboles = new ArrayList<>();

    public void plantar(int x, int y, String nombretipo, String textura, String color){
        ArbolTipo tipo = FabricaDeArboles.obtenerTipo(nombretipo,textura,color);
        arboles.add(new Arbol(x,y,tipo));
    }

    public void dibujar(){
        for(Arbol a : arboles){
            a.dibujar();
        }
    }

    public int cantidadArboles(){
        return arboles.size();
    }

}
