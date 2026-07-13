![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 LlanquihueTourApp

## 👤 Autor del proyecto
- **Nombre completo:** Pablo Ibacache
- **Carrera:** Analista Programador
- **Sede:** Campus Virtual

---

## 📘 Descripción general del sistema
Aplicación Java que gestiona tours, guías turísticos, servicios turísticos, y los recursos internos de la agencia Llanquihue Tour (guías, vehículos y colaboradores externos), ubicada en la Región de Los Lagos. Lee datos desde archivos externos `.txt`, los instancia como objetos Java organizados en paquetes funcionales, e implementa jerarquías de clases con herencia, interfaces y polimorfismo mediante `instanceof`. Incluye una interfaz gráfica básica (JOptionPane) para ingresar y visualizar los recursos de la agencia.

---

## 🧱 Estructura general del proyecto

```plaintext
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   ├── Persona.java            # Datos personales reutilizables (composición)
│   │   ├── Tour.java               # Clase que representa un tour
│   │   ├── Guia.java               # Guía turístico; compone Persona y lista de Tour
│   │   ├── ServicioTuristico.java  # Superclase con atributos comunes de los servicios
│   │   ├── RutaGastronomica.java   # Subclase con atributo numeroDeParadas
│   │   ├── PaseoLacustre.java      # Subclase con atributo tipoEmbarcacion
│   │   ├── ExcursionCultural.java  # Subclase con atributo lugarHistorico
│   │   ├── Registrable.java        # Interfaz con el método mostrarResumen()
│   │   ├── RecursoAgencia.java     # Superclase común de los recursos de la agencia
│   │   ├── GuiaTuristico.java      # Subclase Registrable con atributo especialidad
│   │   ├── Vehiculo.java           # Subclase Registrable con atributo capacidad
│   │   └── ColaboradorExterno.java # Subclase Registrable con atributo empresa
│   ├── data/
│   │   ├── GestorDatos.java        # Lee los archivos y crea objetos Tour y Guia
│   │   ├── GestorServicios.java    # Crea instancias de prueba de los servicios
│   │   └── GestorEntidades.java    # Colección ArrayList<Registrable> con recorrido e instanceof
│   └── ui/
│       ├── Main.java               # Clase principal: tours y guías desde archivo
│       ├── MainServicios.java      # Clase principal: jerarquía de servicios turísticos
│       └── MainEntidades.java      # Clase principal: GUI (JOptionPane) para recursos de la agencia
├── resources/
│   ├── tours.txt                   # Archivo con los datos de los tours
│   └── guias.txt                   # Archivo con los datos de los guías
└── README.md
```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/AppBlo/LlanquihueTourApp
```
2. Abre el proyecto en **IntelliJ IDEA**.
3. Asegúrate de que la carpeta `resources/` esté marcada como **Resources Root**.

**Para ejecutar el sistema de tours y guías (Semanas 3–5):**
4. Ejecuta la clase `Main` ubicada en `src/ui/Main.java`.
5. La salida mostrará: catálogo de tours, filtros por valor, búsqueda por nombre, lista de guías, asignación de tours y filtrado por especialidad.

**Para ejecutar la jerarquía de servicios (Semana 6):**
4. Ejecuta la clase `MainServicios` ubicada en `src/ui/MainServicios.java`.
5. La salida mostrará dos instancias de cada subclase: RutaGastronomica, PaseoLacustre y ExcursionCultural.

**Para ejecutar la gestión de entidades con interfaz gráfica (Semana 8):**
4. Ejecuta la clase `MainEntidades` ubicada en `src/ui/MainEntidades.java`.
5. Se abrirá un menú (JOptionPane) para registrar guías turísticos, vehículos y colaboradores externos.
6. Al elegir la opción "Mostrar todas las entidades", la consola mostrará el resumen de cada objeto registrado, diferenciando su tipo mediante `instanceof` y llamando al método `mostrarResumen()` de la interfaz `Registrable`.

---

**Repositorio GitHub:** https://github.com/AppBlo/LlanquihueTourApp
**Fecha de entrega:** 13/07/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Semana 8
