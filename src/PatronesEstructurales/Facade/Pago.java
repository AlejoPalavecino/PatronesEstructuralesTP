package PatronesEstructurales.Facade;

public class Pago {

    public boolean procesar(String metodo, int monto) {
        if (monto <= 0) {
            System.out.println("Pago: monto inválido");
            return false;
        }
        System.out.println("Pago: procesado con " + metodo + " por $" + monto);
        return true;
    }
}
