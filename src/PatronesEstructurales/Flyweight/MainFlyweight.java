package PatronesEstructurales.Flyweight;

import java.util.Random;

public class MainFlyweight {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();
        Random rnd = new Random(123); // semilla fija para repetir


        // Tipos disponibles (POCOS). Estos serán los flyweights.
        String[][] tipos = {
                {"Pino", "textura-rugosa", "verde-oscuro"},
                {"Roble", "textura-lisa", "verde"},
                {"Abedul", "textura-clara", "verde-claro"}
        };


        // A) Plantamos algunos pocos árboles reales (almacenados) para ver el dibujo
        for (int i = 0; i < 10; i++) {
            String[] t = tipos[i % tipos.length];
            int x = rnd.nextInt(100);
            int y = rnd.nextInt(100);
            bosque.plantar(x, y, t[0], t[1], t[2]);
        }


        System.out.println("\n— Dibujo de muestra (10 árboles) —");
        bosque.dibujar();


        // B) Simulación masiva (1.000.000). No guardamos cada Arbol en memoria
        // para no reventar la RAM en este ejemplo. Solo mostramos el concepto.
        int totalSimulado = 1_000_000;
        for (int i = 0; i < totalSimulado; i++) {
            String[] t = tipos[i % tipos.length];
            // Reusamos los mismos flyweights; sola la posición cambia
            FabricaDeArboles.obtenerTipo(t[0], t[1], t[2]);
            // posiciones aleatorias "fingidas" (no se guardan):
            int x = rnd.nextInt(10_000);
            int y = rnd.nextInt(10_000);
            // En un juego real acá crearías/actualizarías entidades visuales con (x,y)
        }

        // C) Resumen
        System.out.println("\n— Resumen —");
        System.out.println("Árboles almacenados en la lista: " + bosque.cantidadArboles());
        System.out.println("Tipos de árbol (flyweights) creados en fábrica: " + FabricaDeArboles.cantidadTipos());
        System.out.println("Árboles simulados: " + totalSimulado);
    }
}
