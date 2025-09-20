package PatronesEstructurales.Proxy;

public class MainProxy {
    public static void main(String[] args) {
    // Creamos un proxy para un archivo restringido
        Archivo archivoSecreto = new ArchivoProxy(
                "plan_maestro.txt",
                "Contenido ultra secreto...",
                "LEER_SECRETO" // permiso requerido
        );


    // Usuarios
        Usuario ana = new Usuario("Ana", "LEER_SECRETO"); // tiene permiso
        Usuario bob = new Usuario("Bob", null); // no tiene permission

    // Prueba 1: usuario con permiso
        System.out.println("\n-- Ana intenta leer --");
        String r1 = archivoSecreto.leer(ana);
        System.out.println("Resultado: " + r1);

    // Prueba 2: usuario SIN permiso
        System.out.println("\n-- Bob intenta leer --");
        String r2 = archivoSecreto.leer(bob);
        System.out.println("Resultado: " + r2);

    // Prueba 3: usuario null (por seguridad también se bloquea)
        System.out.println("\n-- Usuario null intenta leer --");
        String r3 = archivoSecreto.leer(null);
        System.out.println("Resultado: " + r3);
    }



}
