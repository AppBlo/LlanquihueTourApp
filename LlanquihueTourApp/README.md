![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 LlanquihueTourApp

## 👤 Autor del proyecto
- **Nombre completo:** Pablo Ibacache
- **Carrera:** Analista Programador
- **Sede:** Campus Virtual

---

## 📘 Descripción general del sistema
Aplicación Java que gestiona tours, guías turísticos y servicios turísticos de la agencia Llanquihue Tour, ubicada en la Región de Los Lagos. Lee datos desde archivos externos `.txt`, los instancia como objetos Java organizados en paquetes funcionales, e implementa una jerarquía de clases con herencia simple para representar los distintos tipos de servicios.

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
│   │   └── ExcursionCultural.java  # Subclase con atributo lugarHistorico
│   ├── data/
│   │   ├── GestorDatos.java        # Lee los archivos y crea objetos Tour y Guia
│   │   └── GestorServicios.java    # Crea instancias de prueba de los servicios
│   └── ui/
│       ├── Main.java               # Clase principal: tours y guías desde archivo
│       └── MainServicios.java      # Clase principal: jerarquía de servicios turísticos
├── resources/
│   ├── tours.txt                   # Archivo con los datos de los tours
│   └── guias.txt                   # Archivo con los datos de los guías
└── README.md
```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/App-blo/Actividad-Sumativa-1.git
```
2. Abre el proyecto en **IntelliJ IDEA**.
3. Asegúrate de que la carpeta `resources/` esté marcada como **Resources Root**.

**Para ejecutar el sistema de tours y guías (Semanas 3–5):**
4. Ejecuta la clase `Main` ubicada en `src/ui/Main.java`.
5. La salida mostrará: catálogo de tours, filtros por valor, búsqueda por nombre, lista de guías, asignación de tours y filtrado por especialidad.

**Para ejecutar la jerarquía de servicios (Semana 6):**
4. Ejecuta la clase `MainServicios` ubicada en `src/ui/MainServicios.java`.
5. La salida mostrará dos instancias de cada subclase: RutaGastronomica, PaseoLacustre y ExcursionCultural.

---

**Repositorio GitHub:** https://github.com/App-blo/Actividad-Sumativa-1.git  
**Fecha de entrega:** 29/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Semana 6
