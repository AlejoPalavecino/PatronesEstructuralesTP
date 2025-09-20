package PatronesEstructurales.Decorator;

public class MainDecorator {
    public static void main(String[] args) {
    // Siempre partimos de un Plan Básico
        Plan basico = new PlanBasico();


    // Combinación A: Básico
        mostrar(basico);


    // Combinación B: Básico + HD
        Plan basicoMasHD = new HDDecorator(basico);
        mostrar(basicoMasHD);


    // Combinación C: Básico + UltraHD
        Plan basicoMasUHD = new UltraHDDecorator(basico);
        mostrar(basicoMasUHD);


    // Combinación D: Básico + HD + Offline
        Plan basicoHDOffline = new OfflineDecorator(new HDDecorator(basico));
        mostrar(basicoHDOffline);


    // Combinación E: Básico + UltraHD + Offline
        Plan basicoUHDOffline = new OfflineDecorator(new UltraHDDecorator(basico));
        mostrar(basicoUHDOffline);


    // Nota: Técnicamente podrías apilar HD y UltraHD juntos,
    // pero en la vida real elegirías uno u otro. Aquí lo permitimos
    // para mostrar cómo las "capas" se suman sin romper nada.
        Plan comboRaro = new OfflineDecorator(new UltraHDDecorator(new HDDecorator(basico)));
        mostrar(comboRaro);
    }


    // Función auxiliar muy sencilla para imprimir resultado
    private static void mostrar(Plan plan) {
        System.out.println(plan.getDescripcion() + " → $" + plan.getCosto());
    }
}
