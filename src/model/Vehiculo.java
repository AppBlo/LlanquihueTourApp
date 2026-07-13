package model;

/**
 * Subclase que representa un vehículo de la agencia, extiende RecursoAgencia
 * e implementa Registrable
 */
public class Vehiculo extends RecursoAgencia implements Registrable {

    private int capacidad; /* Capacidad de pasajeros del vehículo */

    /**
     * Constructor con parametros de la clase Vehiculo
     */
    public Vehiculo(String nombre, String patente, int capacidad) {
        super(nombre, patente);       /* Llamar al constructor de la superclase */
        this.capacidad = capacidad;   /* Definir capacidad de pasajeros */
    }

    /**
     * Metodo get para devolver la capacidad del vehículo
     */
    public int getCapacidad() {
        return capacidad; /* Devolver capacidad de pasajeros */
    }

    /**
     * Metodo set para modificar la capacidad del vehículo
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad; /* Definir nueva capacidad */
    }

    /**
     * Implementación del metodo mostrarResumen de la interfaz Registrable
     */
    @Override
    public void mostrarResumen() {
        System.out.println("[Vehículo] " + getNombre() + ", patente: " + getCodigo()
                + ", capacidad: " + capacidad + " pasajeros");
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return "[Vehículo] " + super.toString() + ", capacidad: " + capacidad + " pasajeros";
    }
}
