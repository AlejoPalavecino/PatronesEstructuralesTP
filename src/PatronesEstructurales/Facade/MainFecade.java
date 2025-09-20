package PatronesEstructurales.Facade;

public class MainFecade {
    public static void main(String[] args) {
    // Creamos el Facade (una "puerta de entrada" simple)
    TiendaFecade tienda = new TiendaFecade();


    // Creamos un producto de ejemplo
    Producto teclado = new Producto("Teclado básico", 1500);


    // El cliente solo llama a comprar(...) y no se preocupa por los pasos internos
    tienda.comprar(teclado, "Tarjeta de Crédito", "Calle Falsa 123, Springfield");


    // Podríamos comprar otro producto con otro método/dirección
    Producto mouse = new Producto("Mouse óptico", 800);
    tienda.comprar(mouse, "MercadoPago", "Av. Siempreviva 742");
    }
}
