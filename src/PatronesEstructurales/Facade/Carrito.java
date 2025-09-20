package PatronesEstructurales.Facade;

public class Carrito {
    private int total = 0;

    public void agregarProductos(Producto p){
        System.out.println("Carrito agregado: " + p.nombre + " -- $" + p.precio);
        total += p.precio;
    }
    public int calcularTotal(){
        System.out.println("Carrito total: " + total);
        return total;
    }
}
