package service;

import model.Guia;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase TourService con la lógica de búsqueda, filtrado y asignación de tours
 */
public class TourService {

    /**
     * Filtra los tours con valor menor al tope indicado
     * @param tours Lista de tours a filtrar
     * @param tope  Precio máximo
     * @return Lista de tours que cumplen el criterio
     */
    public ArrayList<Tour> filtrarPorValor(ArrayList<Tour> tours, double tope) {

        /* Lista donde se almacenarán los tours filtrados */
        ArrayList<Tour> resultado = new ArrayList<>();

        for (Tour tour : tours) {
            /* Agregar el tour si su valor es menor al tope */
            if (tour.getValor() < tope) {
                resultado.add(tour);
            }
        }

        return resultado;
    }

    /**
     * Busca un tour por nombre ignorando mayúsculas y minúsculas
     * @param tours  Lista de tours donde buscar
     * @param nombre Nombre del tour buscado
     * @return El objeto Tour encontrado, o null si no existe
     */
    public Tour buscarPorNombre(ArrayList<Tour> tours, String nombre) {

        for (Tour tour : tours) {
            /* Comparar nombre ignorando mayúsculas y minúsculas */
            if (tour.getTour().equalsIgnoreCase(nombre)) {
                return tour;
            }
        }

        return null;
    }

    /**
     * Asigna un tour a un guía buscándolo por nombre
     * @param guia       Guía al que se asignará el tour
     * @param tours      Lista de tours disponibles
     * @param nombreTour Nombre del tour a asignar
     */
    public void asignarTourAGuia(Guia guia, ArrayList<Tour> tours, String nombreTour) {

        /* Buscar el tour en la lista */
        Tour tour = buscarPorNombre(tours, nombreTour);

        if (tour != null) {
            guia.asignarTour(tour); /* Asignar el tour al guía */
        } else {
            System.out.println("No se encontró el tour '" + nombreTour + "' para asignar.");
        }
    }

    /**
     * Filtra los guías según su especialidad
     * @param guias        Lista de guías a filtrar
     * @param especialidad Especialidad a buscar
     * @return Lista de guías con esa especialidad
     */
    public ArrayList<Guia> filtrarGuiasPorEspecialidad(ArrayList<Guia> guias, String especialidad) {

        /* Lista donde se almacenarán los guías filtrados */
        ArrayList<Guia> resultado = new ArrayList<>();

        for (Guia guia : guias) {
            /* Agregar el guía si su especialidad coincide */
            if (guia.getEspecialidad().equalsIgnoreCase(especialidad)) {
                resultado.add(guia);
            }
        }

        return resultado;
    }
}
