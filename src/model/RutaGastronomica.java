package model;

/**
 * Subclase que representa una ruta gastronómica, extiende ServicioTuristico
 */
public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas; /* Número de paradas en la ruta gastronómica */

    /**
     * Constructor con parametros de la clase RutaGastronomica
     */
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);          /* Llamar al constructor de la superclase */
        this.numeroDeParadas = numeroDeParadas; /* Definir número de paradas */
    }

    /**
     * Metodo get para devolver el número de paradas
     */
    public int getNumeroDeParadas() {
        return numeroDeParadas; /* Devolver número de paradas */
    }

    /**
     * Metodo set para modificar el número de paradas
     */
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas; /* Definir nuevo número de paradas */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return "[Ruta Gastronómica] " + super.toString() + ", paradas: " + numeroDeParadas;
    }
}
