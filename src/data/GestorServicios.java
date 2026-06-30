package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * Clase GestorServicios que crea instancias de prueba de los servicios turísticos
 */
public class GestorServicios {

    /**
     * Crea y muestra dos objetos de cada subclase de ServicioTuristico
     */
    public void mostrarServicios() {

        /* Crear instancias de RutaGastronomica */
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores del Lago", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta Chilota", 6, 8);

        /* Crear instancias de PaseoLacustre */
        PaseoLacustre paseo1 = new PaseoLacustre("Cruce Lago Llanquihue", 3, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Paseo Lago Todos los Santos", 5, "Lancha");

        /* Crear instancias de ExcursionCultural */
        ExcursionCultural excursion1 = new ExcursionCultural("Historia de Puerto Montt", 4, "Casa del Arte");
        ExcursionCultural excursion2 = new ExcursionCultural("Chiloé Patrimonial", 8, "Iglesia de Castro");

        /* Mostrar rutas gastronómicas */
        System.out.println("=== RUTAS GASTRONOMICAS ===");
        System.out.println("- " + ruta1.toString());
        System.out.println("- " + ruta2.toString());

        /* Mostrar paseos lacustres */
        System.out.println("\n=== PASEOS LACUSTRES ===");
        System.out.println("- " + paseo1.toString());
        System.out.println("- " + paseo2.toString());

        /* Mostrar excursiones culturales */
        System.out.println("\n=== EXCURSIONES CULTURALES ===");
        System.out.println("- " + excursion1.toString());
        System.out.println("- " + excursion2.toString());
    }
}
