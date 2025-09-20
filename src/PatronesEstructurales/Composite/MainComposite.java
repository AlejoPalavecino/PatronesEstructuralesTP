package PatronesEstructurales.Composite;

public class MainComposite {
    public static void main(String[] args) {
        // Platos sueltos
        Plato milanesa = new Plato("Milanesa con papas", 3500);
        Plato pasta = new Plato("Pasta al pesto", 3200);
        Plato sopa = new Plato("Sopa de calabaza", 1800);
        Plato flan = new Plato("Flan casero", 1200);
        Plato cafe = new Plato("Café", 800);

        // Menú del día (compuesto): entrada + principal + postre
        Menu menuDelDia = new Menu("Menú del Día");
        menuDelDia.agregar(sopa); // entrada
        menuDelDia.agregar(milanesa); // principal
        menuDelDia.agregar(flan); // postre

        // Submenú de cafetería (otro compuesto)
        Menu cafeteria = new Menu("Cafetería");
        cafeteria.agregar(cafe);
        cafeteria.agregar(new Plato("Cortado", 900));

        // Menú principal del restaurante: puede mezclar platos y submenús
        Menu menuPrincipal = new Menu("Carta Principal");
        menuPrincipal.agregar(pasta); // plato suelto
        menuPrincipal.agregar(menuDelDia); // submenú
        menuPrincipal.agregar(cafeteria); // otro submenú

        // Mostramos TODO de forma uniforme llamando a mostrar(...) sobre la raíz
        // El cliente NO necesita saber si es un plato o un menú: ambos son ElementoMenu
        System.out.println("=== MENÚ COMPLETO ===");
        menuPrincipal.mostrar(0);
    }
}
