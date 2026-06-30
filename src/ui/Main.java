package ui;

import data.GestorDatos;
import model.Guia;
import model.Tour;
import service.TourService;
import java.util.ArrayList;

/**
 * Clase principal que carga los datos desde archivos,
 * recorre las colecciones y aplica filtros de búsqueda
 */
public class Main {

    public static void main(String[] args) {

        /* Crear instancias del gestor de datos y del servicio */
        GestorDatos gestor  = new GestorDatos();
        TourService service = new TourService();

        /* Cargar tours y guías desde los archivos .txt */
        ArrayList<Tour> listaTours = gestor.cargarTours("resources/tours.txt");
        ArrayList<Guia> listaGuias = gestor.cargarGuias("resources/guias.txt");

        /* ── 1. RECORRIDO: mostrar todos los tours disponibles ── */
        System.out.println("=== CATALOGO DE TOURS - LLANQUIHUE TOUR ===");
        for (Tour tour : listaTours) {
            System.out.println("- " + tour.toString());
        }

        /* ── 2. FILTRADO: mostrar tours con valor menor a $30.000 ── */
        System.out.println("\n=== TOURS CON VALOR MENOR A $30.000 ===");
        ArrayList<Tour> toursFiltrados = service.filtrarPorValor(listaTours, 30000);

        if (toursFiltrados.isEmpty()) {
            System.out.println("No se encontraron tours que cumplan el criterio.");
        } else {
            for (Tour tour : toursFiltrados) {
                System.out.println("- " + tour.toString());
            }
        }

        /* ── 3. BÚSQUEDA: encontrar un tour específico por nombre ── */
        System.out.println("\n=== BUSQUEDA DE TOUR: 'Premium' ===");
        String nombreBuscado = "Premium";
        Tour encontrado = service.buscarPorNombre(listaTours, nombreBuscado);

        if (encontrado != null) {
            System.out.println("Tour encontrado: " + encontrado.toString());
        } else {
            System.out.println("No se encontró el tour '" + nombreBuscado + "'.");
        }

        /* ── 4. RECORRIDO: mostrar todos los guías registrados ── */
        System.out.println("\n=== GUIAS REGISTRADOS - LLANQUIHUE TOUR ===");
        for (Guia guia : listaGuias) {
            System.out.println("- " + guia.toString());
        }

        /* ── 5. ASIGNACION: asignar tours al primer guía de la lista ── */
        System.out.println("\n=== ASIGNACION DE TOURS ===");
        if (!listaGuias.isEmpty()) {
            Guia primerGuia = listaGuias.get(0);
            service.asignarTourAGuia(primerGuia, listaTours, "Deluxe");
            service.asignarTourAGuia(primerGuia, listaTours, "Premium");

            /* Mostrar los tours asignados al guía */
            System.out.println("Tours asignados a " + primerGuia.getPersona().getNombre() + ":");
            for (Tour tour : primerGuia.getToursAsignados()) {
                System.out.println("- " + tour.toString());
            }
        }

        /* ── 6. FILTRADO: mostrar guías con especialidad en Gastronomía ── */
        System.out.println("\n=== GUIAS ESPECIALIZADOS EN GASTRONOMIA ===");
        ArrayList<Guia> guiasFiltrados = service.filtrarGuiasPorEspecialidad(listaGuias, "Gastronomía");

        if (guiasFiltrados.isEmpty()) {
            System.out.println("No se encontraron guías con esa especialidad.");
        } else {
            for (Guia guia : guiasFiltrados) {
                System.out.println("- " + guia.toString());
            }
        }
    }
}
