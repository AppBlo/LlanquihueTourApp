package model;

/**
 * Subclase que representa una excursión cultural, extiende ServicioTuristico
 */
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico; /* Lugar histórico que se visita en la excursión */

    /**
     * Constructor con parametros de la clase ExcursionCultural
     */
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);          /* Llamar al constructor de la superclase */
        this.lugarHistorico = lugarHistorico; /* Definir lugar histórico */
    }

    /**
     * Metodo get para devolver el lugar histórico
     */
    public String getLugarHistorico() {
        return lugarHistorico; /* Devolver lugar histórico */
    }

    /**
     * Metodo set para modificar el lugar histórico
     */
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico; /* Definir nuevo lugar histórico */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return "[Excursión Cultural] " + super.toString() + ", lugar histórico: " + lugarHistorico;
    }
}
