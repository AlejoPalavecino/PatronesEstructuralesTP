package PatronesEstructurales.Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu{
    private String nombre;
    private List<ElementoMenu> items = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ElementoMenu elem){
        items.add(elem);
    }

    public void quitar(ElementoMenu elem){
        items.remove(elem);
    }

    @Override
    public void mostrar(int nivel){
        String indent = " ".repeat(nivel * 2);
        System.out.println(indent + " Menu: " + nombre);
        for (ElementoMenu e : items){
            e.mostrar(nivel + 1);
        }
    }

}
