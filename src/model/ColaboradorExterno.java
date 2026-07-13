package model;

/**
 * Subclase que representa un colaborador externo de la agencia,
 * extiende RecursoAgencia e implementa Registrable
 */
public class ColaboradorExterno extends RecursoAgencia implements Registrable {

    private String empresa; /* Empresa a la que representa el colaborador */

    /**
     * Constructor con parametros de la clase ColaboradorExterno
     */
    public ColaboradorExterno(String nombre, String rut, String empresa) {
        super(nombre, rut);       /* Llamar al constructor de la superclase */
        this.empresa = empresa;   /* Definir empresa */
    }

    /**
     * Metodo get para devolver la empresa del colaborador
     */
    public String getEmpresa() {
        return empresa; /* Devolver empresa */
    }

    /**
     * Metodo set para modificar la empresa del colaborador
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa; /* Definir nueva empresa */
    }

    /**
     * Implementación del metodo mostrarResumen de la interfaz Registrable
     */
    @Override
    public void mostrarResumen() {
        System.out.println("[Colaborador Externo] " + getNombre() + ", RUT: " + getCodigo()
                + ", empresa: " + empresa);
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return "[Colaborador Externo] " + super.toString() + ", empresa: " + empresa;
    }
}
