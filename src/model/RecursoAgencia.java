package model;

/**
 * Superclase que representa un recurso genérico administrado por la agencia
 * (por ejemplo: guías, vehículos o colaboradores externos)
 */
public class RecursoAgencia {

    private String nombre; /* Nombre del recurso */
    private String codigo; /* Código identificador del recurso (RUT, patente, etc.) */

    /**
     * Constructor con parametros de la clase RecursoAgencia
     */
    public RecursoAgencia(String nombre, String codigo) {
        this.nombre = nombre; /* Definir nombre del recurso */
        this.codigo = codigo; /* Definir código identificador */
    }

    /**
     * Metodo get para devolver nombre y código del recurso
     */
    public String getNombre() {
        return nombre; /* Devolver nombre del recurso */
    }

    public String getCodigo() {
        return codigo; /* Devolver código identificador */
    }

    /**
     * Metodo set para modificar nombre y código del recurso
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; /* Definir nuevo nombre */
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo; /* Definir nuevo código identificador */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return nombre + " (código: " + codigo + ")";
    }
}
