# TP Patrones Estructurales

Cada ejercicio muestra cuándo y cómo aplicar un patrón estructural clásico.

> Nota: todos los `main` están en las mismas clases de ejemplo para facilitar la ejecución rápida.

## 1) Adapter — "Unificar interfaces incompatibles"

Archivo: `MainAdapter` (y clases relacionadas)
Problema: había dos impresoras con APIs distintas (`imprimirPDF(...)` y `imprimirTexto(...)`).
Solución (Adapter): definimos una interfaz objetivo `Impresora` y creamos adapters (`ImpresoraPDFAdapter`, `ImpresoraTextoAdapter`) que traducen la llamada `imprimir(...)` a la API real de cada clase.
Clases clave:

Target: `Impresora`
Adaptees: `ImpresoraPDF`, `ImpresoraTexto`
Adapters: `ImpresoraPDFAdapter`, `ImpresoraTextoAdapter`
  Cómo probar: correr `MainAdapter` y ver cómo el cliente usa la misma interfaz sin importar el tipo real de impresora.
  Cuándo usar: cuando hay clases existentes con firmas distintas y no podemos modificarlas, pero necesitamos una interfaz común.

## 2) Bridge — "Separar el *qué* del *cómo*"

Archivo: `MainBridge`
Problema: queríamos combinar libremente tipos de notificación (Alerta, Recordatorio, Promoción) con canales (Email, SMS).
Solución (Bridge): separamos dos jerarquías. La Abstracción `Notificacion` delega en el Implementador `CanalEnvio`. Así ambos pueden variar de forma independiente.
Clases clave:

Implementor: `CanalEnvio` → `CanalEmail`, `CanalSMS`
Abstraction: `Notificacion` → `NotificacionAlerta`, `NotificacionRecordatorio`, `NotificacionPromocion`
  Cómo probar: crear cualquier combinación (p. ej. `NotificacionAlerta` con `CanalEmail` o `CanalSMS`) y ejecutar `MainBridge`.
  Cuándo usar: si una clase tiene dos dimensiones que crecen (p. ej. tipos × canales) y no querés heredar explosivamente.

## 3) Decorator — "Agregar capacidades por capas"

Archivo: `MainDecoratorStreaming`
Enunciado: Plan básico $1000 con extras opcionales HD (+$500), UltraHD (+$1000), Descargas Offline (+$700).
Solución (Decorator): el componente `Plan` se envuelve con decoradores que suman costo y descripción.
Clases clave:
Component: `Plan` → `PlanBasico`
Decorator base: `PlanDecorator`
Decorators: `HDDecorator`, `UltraHDDecorator`, `OfflineDecorator`
  Cómo probar: ejecutar `MainDecoratorStreaming` y revisar combinaciones (Básico, Básico+HD, Básico+UltraHD, Básico+HD+Offline, etc.).
  Cuándo usar: cuando querés agregar funcionalidades a un objeto en tiempo de ejecución sin tocar su código.

## 4) Facade — "Una puerta simple a un sistema complejo"

Archivo: `MainFacade`
Problema: el proceso de compra usa varios subsistemas: `Carrito`, `Pago`, `Envio`.
Solución (Facade): `TiendaFacade` ofrece un único método `comprar(...)` que orquesta los pasos y **esconde la complejidad.
Clases clave: `Producto`, `Carrito`, `Pago`, `Envio`, `TiendaFacade`.
  Cómo probar: correr `MainFacade` y ver el flujo de compra usando solo el Facade.
  Cuándo usar: cuando el cliente no debería conocer/coordinar muchas clases internas.

## 5) Flyweight — "Compartir estado pesado"

Archivo: `MainFlyweight`
Problema: un juego con miles/millones de árboles. Repetir tipo/texture/color en cada objeto derrocha memoria.
Solución (Flyweight): separar intrínseco compartido (`ArbolTipo`: tipo, textura, color) de extrínseco por instancia (`Arbol`: `x`, `y`). La `FabricaDeArboles` cachea los `ArbolTipo`.
Clases clave: `ArbolTipo` (flyweight), `Arbol` (contexto), `FabricaDeArboles`, `Bosque`.
  Cómo probar: el `main` dibuja 10 árboles y simula 1000000 reusando solo 3 `ArbolTipo`. Imprime un resumen.
  Cuándo usar: cuando hay muchísimas instancias con datos repetidos.

## 6) Proxy — "Un sustituto con control"

Archivo: `MainProxy`
Problema: restringir lectura de archivos según permisos.
Solución (Proxy de protección)**: `ArchivoProxy` verifica permisos y solo delega en `ArchivoReal` si el usuario los tiene.
Clases clave: `Archivo` (Subject), `ArchivoReal` (RealSubject), `ArchivoProxy` (Proxy), `Usuario`.
  Cómo probar: en `MainProxy` hay tres casos: permitido, denegado y usuario `null`.
  Cuándo usar: control de acceso, lazy loading, logs, cache, etc. sin modificar la clase real.

## 7) Composite — "Árbol de objetos con operación uniforme"

Archivo: `MainComposite`
Problema: manejar platos y **menús** (que contienen platos y submenús) de la misma forma.
Solución (Composite): `ElementoMenu` es la interfaz. `Plato` es **hoja**, `Menu` es compuesto con `List<ElementoMenu>`. `mostrar()` recorre recursivamente.
Clases clave: `ElementoMenu`, `Plato`, `Menu`.
  Cómo probar: ejecutar `MainComposite` y revisar la salida con identación.
  Cuándo usar: cuando tu estructura es jerárquica y querés operaciones uniformes en hojas y compuestos.
