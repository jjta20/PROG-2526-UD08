# 🔌 Unidad 8: Interfaces (POO) - Soluciones

¡Hola de nuevo, estudiante! 👋 

Bienvenidos al repositorio con las **soluciones a las actividades de la Unidad 8**. 

En este tema damos un paso gigante en el diseño de software. Vamos a dejar de centrarnos en "qué *son*" los objetos (herencia de clases) para centrarnos en "**qué *saben hacer***". Las **Interfaces** son los "contratos" de nuestro código: obligan a las clases a cumplir unas normas, permitiéndonos crear sistemas súper flexibles y escalables.

---

## 🎯 ¿Qué conceptos ponemos en práctica aquí?

En estos ejercicios abandonamos las clases tradicionales por un momento para exprimir al máximo el potencial de las interfaces en Java:

*   🤝 **Definición de Contratos (`interface`)**: Separar el *qué hacer* (diseño) del *cómo hacerlo* (implementación).
*   ✍️ **Firma del Contrato (`implements`)**: Obligar a nuestras clases a programar los métodos abstractos.
*   🆕 **Métodos Avanzados (Java 8 y 9)**: Uso de métodos `default` (con código por defecto), `static` y `private` dentro de las interfaces.
*   🧬 **Herencia de Interfaces (`extends`)**: ¡Y aquí sí existe la herencia múltiple!
*   🎭 **Polimorfismo en Estado Puro**: Tratar objetos de clases totalmente distintas (ej. un SMS y un Email) de forma idéntica porque comparten la misma interfaz.
*   🥷 **Clases Anónimas**: Implementar interfaces "al vuelo" para usos de usar y tirar.

---

## 🚀 Índice de Actividades

Aquí tenéis el resumen de los ejercicios resueltos, estructurados para simular casos del mundo real:

| Ejercicio | Temática | Conceptos Clave Trabajados |
| :---: | :--- | :--- |
| **1** | 🏠 **Internet de las Cosas (IoT)** | Creación de la interfaz `DispositivoConectado`. Implementación en `Bombilla` y `Televisor`. Uso de atributos constantes (tipo de red). |
| **2** | 💳 **Pasarela de Pagos** | Creación de la interfaz `MetodoPago` con la constante del IVA. Implementación en diferentes sistemas como `PagoBizum` y `PagoTarjeta`. |
| **3** | 🔔 **Centralita de Notificaciones** | Creación de la interfaz `Notificable` (Email, SMS, Push). **Uso intensivo del Polimorfismo**: agrupar clases que no son familia en un bucle común para enviar un aviso masivo. |
| **4** | 🖨️ **Dispositivos de Oficina** | **Herencia múltiple de interfaces**. Agrupación de `Imprimible` y `Escaneable` en `Multifuncion`. Comprobación de errores de compilación al forzar contratos. |
| **5** | 🕊️ **La Paloma Mensajera del CEO** | Implementación de la interfaz `Notificable` mediante una **Clase Anónima** instanciada al vuelo directamente en el `main` (la antesala a las expresiones Lambda). |

---

## 🛠️ ¿Cómo usar este repositorio?

1. **Lee el contrato:** Antes de ver cómo he resuelto una clase, abre el archivo de la `interface`. Piensa: *"Si yo firmara este contrato, ¿qué estaría obligado a programar?"*.
2. **Entiende el Polimorfismo (Actividad 3):** Es vital que miréis el código del `main` en la centralita de notificaciones. Fijaos cómo una misma variable/lista de tipo `Notificable` es capaz de ejecutar código distinto dependiendo de si el objeto real es un SMS o un Email.
3. **Provoca errores:** Descarga el proyecto e intenta hacer trampas. Haz que `ImpresoraBasica` intente usar el método de escanear. Intenta cambiar el valor de un atributo de una interfaz en el main. ¡Ver cómo el compilador te frena es la mejor forma de entender las reglas!

> **💡 Consejo del profe:** 
> *Las interfaces son la base del código moderno y de las APIs. Dominar este tema os separa de los programadores novatos y os acerca a los arquitectos de software.*

---
*Profe: Javier Torre Antúnez | IES Newton-Salas* 🏫
