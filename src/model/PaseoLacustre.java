package model;

/**
 * Subclase que representa un paseo lacustre, extiende ServicioTuristico
 */
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion; /* Tipo de embarcación utilizada en el paseo */

    /**
     * Constructor con parametros de la clase PaseoLacustre
     */
    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);            /* Llamar al constructor de la superclase */
        this.tipoEmbarcacion = tipoEmbarcacion; /* Definir tipo de embarcación */
    }

    /**
     * Metodo get para devolver el tipo de embarcación
     */
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion; /* Devolver tipo de embarcación */
    }

    /**
     * Metodo set para modificar el tipo de embarcación
     */
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion; /* Definir nuevo tipo de embarcación */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return "[Paseo Lacustre] " + super.toString() + ", embarcación: " + tipoEmbarcacion;
    }
}
