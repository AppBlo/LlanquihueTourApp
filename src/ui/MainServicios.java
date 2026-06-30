package ui;

import data.GestorServicios;

/**
 * Clase principal que ejecuta la jerarquía de servicios turísticos
 */
public class MainServicios {

    public static void main(String[] args) {

        /* Crear instancia del gestor de servicios */
        GestorServicios gestor = new GestorServicios();

        /* Mostrar todos los servicios turísticos por consola */
        gestor.mostrarServicios();
    }
}
