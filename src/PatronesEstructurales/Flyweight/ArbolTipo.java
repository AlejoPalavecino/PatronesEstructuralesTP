package PatronesEstructurales.Flyweight;

public class ArbolTipo {
    String nombreTipo;
    String textura;
    String color;

    public ArbolTipo(String nombreTipo, String textura, String color){
        this.nombreTipo = nombreTipo;
        this.textura = textura;
        this.color = color;
    }

    public void dibujar(int x, int y){
        System.out.println("Dibujando " + nombreTipo + " en " + x + "," + y + " con color " + color);
    }
}
