package model;

/**
 * Clase Tour para definir el nombre, duración y valor de un tour
 */
public class Tour {

    private String tour;     /* Nombre del tipo de tour */
    private String duracion; /* Duración del tour en horas */
    private double valor;    /* Valor del tour expresado en pesos */

    /**
     * Constructor con parametros de la clase Tour
     */
    public Tour(String tour, String duracion, double valor) {
        this.tour    = tour;    /* Definir nombre del tour */
        this.duracion = duracion; /* Definir duración del tour */
        this.valor   = valor;   /* Definir valor del tour */
    }

    /**
     * Metodo get para devolver nombre, duración y valor del tour
     */
    public String getTour() {
        return tour; /* Devolver nombre del tour */
    }

    public String getDuracion() {
        return duracion; /* Devolver duración del tour */
    }

    public double getValor() {
        return valor; /* Devolver el valor del tour */
    }

    /**
     * Metodo set para modificar nombre, duración y valor del tour
     */
    public void setTour(String nuevoTour) {
        this.tour = nuevoTour; /* Definir nuevo nombre del tour */
    }

    public void setDuracion(String nuevaDuracion) {
        this.duracion = nuevaDuracion; /* Definir nueva duración del tour */
    }

    public void setValor(double nuevoValor) {
        if (nuevoValor <= 0) { /* Validar que el valor sea mayor a 0 */
            throw new IllegalArgumentException("El valor del tour debe ser mayor a 0.");
        }
        this.valor = nuevoValor; /* Definir nuevo valor del tour */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return tour + ", con una duración de " + duracion + " y un valor de $" + valor + " pesos.";
    }
}
