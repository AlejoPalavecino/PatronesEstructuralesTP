package PatronesEstructurales.Flyweight;

import java.rmi.MarshalledObject;

public class Arbol {
    int x, y;
    ArbolTipo tipoCompartido;

    public Arbol(int x, int y, ArbolTipo tipoCompartido) {
        this.x = x;
        this.y = y;
        this.tipoCompartido = tipoCompartido;
    }

    public void dibujar(){
        tipoCompartido.dibujar(x, y);
    }
}
