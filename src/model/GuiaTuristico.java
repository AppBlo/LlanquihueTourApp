package model;

/**
 * Subclase que representa un guía turístico, extiende RecursoAgencia
 * e implementa Registrable
 */
public class GuiaTuristico extends RecursoAgencia implements Registrable {

    private String especialidad; /* Especialidad del guía turístico */

    /**
     * Constructor con parametros de la clase GuiaTuristico
     */
    public GuiaTuristico(String nombre, String rut, String especialidad) {
        super(nombre, rut);                 /* Llamar al constructor de la superclase */
        this.especialidad = especialidad;   /* Definir especialidad */
    }

    /**
     * Metodo get para devolver la especialidad del guía
     */
    public String getEspecialidad() {
        return especialidad; /* Devolver especialidad */
    }

    /**
     * Metodo set para modificar la especialidad del guía
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad; /* Definir nueva especialidad */
    }

    /**
     * Implementación del metodo mostrarResumen de la interfaz Registrable
     */
    @Override
    public void mostrarResumen() {
        System.out.println("[Guía Turístico] " + getNombre() + ", RUT: " + getCodigo()
                + ", especialidad: " + especialidad);
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return "[Guía Turístico] " + super.toString() + ", especialidad: " + especialidad;
    }
}
