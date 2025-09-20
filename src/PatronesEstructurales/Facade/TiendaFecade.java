package PatronesEstructurales.Facade;

public class TiendaFecade {
    private Carrito carrito;
    private Pago pago;
    private  Envio envio;

    public TiendaFecade(){
        this.carrito=new Carrito();
        this.envio=new Envio();
        this.pago=new Pago();
    }

    public void comprar(Producto producto, String metoodoPago, String direccionEnvio){

        carrito.agregarProductos(producto);

        int total = carrito.calcularTotal();

        boolean ok = pago.procesar(metoodoPago, total);

        if(!ok){
            System.out.println("TiendaFecade: Compra cancelada por error de pago");
            return;
        }

        envio.coordinar(direccionEnvio);

        System.out.println("TiendaFecade: compra finalizada con éxito");
    }

}
