package model;

/**
 * Superclase que representa un servicio turístico genérico de la agencia
 */
public class ServicioTuristico {

    private String nombre;       /* Nombre del servicio turístico */
    private int duracionHoras;   /* Duración del servicio en horas */

    /**
     * Constructor con parametros de la clase ServicioTuristico
     */
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre        = nombre;        /* Definir nombre del servicio */
        this.duracionHoras = duracionHoras; /* Definir duración en horas */
    }

    /**
     * Metodo get para devolver nombre y duración del servicio
     */
    public String getNombre() {
        return nombre; /* Devolver nombre del servicio */
    }

    public int getDuracionHoras() {
        return duracionHoras; /* Devolver duración en horas */
    }

    /**
     * Metodo set para modificar nombre y duración del servicio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; /* Definir nuevo nombre */
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras; /* Definir nueva duración */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return nombre + ", duración: " + duracionHoras + " horas";
    }
}
