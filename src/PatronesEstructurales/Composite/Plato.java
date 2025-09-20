package PatronesEstructurales.Composite;

public class Plato implements ElementoMenu{
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    @Override
    public void mostrar(int nivel){
        String indent = " ".repeat(nivel*2);
        System.out.println(indent + " Plato "+ nombre + " $" + precio);
    }
}
