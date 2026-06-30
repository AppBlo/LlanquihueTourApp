package model;

import java.util.ArrayList;

/**
 * Clase Guia para definir los datos de un guía turístico de la agencia
 */
public class Guia {

    private Persona persona;              /* Datos personales del guía */
    private String especialidad;          /* Especialidad del guía */
    private ArrayList<Tour> toursAsignados; /* Lista de tours asignados al guía */

    /**
     * Constructor con parametros de la clase Guia
     */
    public Guia(Persona persona, String especialidad) {
        this.persona         = persona;      /* Definir datos personales */
        this.especialidad    = especialidad; /* Definir especialidad */
        this.toursAsignados  = new ArrayList<>(); /* Inicializar lista de tours */
    }

    /**
     * Metodo get para devolver los datos del guía
     */
    public Persona getPersona() {
        return persona; /* Devolver datos personales */
    }

    public String getEspecialidad() {
        return especialidad; /* Devolver especialidad */
    }

    public ArrayList<Tour> getToursAsignados() {
        return toursAsignados; /* Devolver lista de tours asignados */
    }

    /**
     * Metodo set para modificar los datos del guía
     */
    public void setPersona(Persona persona) {
        this.persona = persona; /* Definir nuevos datos personales */
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad; /* Definir nueva especialidad */
    }

    /**
     * Agrega un tour a la lista de tours asignados al guía
     */
    public void asignarTour(Tour tour) {
        toursAsignados.add(tour); /* Agregar tour a la lista */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return persona.getNombre() + ", especialidad: " + especialidad
                + ", tours asignados: " + toursAsignados.size();
    }
}
