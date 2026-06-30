package model;

/**
 * Clase Persona para definir los datos de una persona vinculada a la agencia
 */
public class Persona {

    private String nombre;    /* Nombre completo de la persona */
    private String rut;       /* RUT de la persona */
    private String telefono;  /* Teléfono de contacto */

    /**
     * Constructor con parametros de la clase Persona
     */
    public Persona(String nombre, String rut, String telefono) {
        this.nombre   = nombre;   /* Definir nombre */
        this.rut      = rut;      /* Definir RUT */
        this.telefono = telefono; /* Definir teléfono */
    }

    /**
     * Metodo get para devolver los datos de la persona
     */
    public String getNombre() {
        return nombre; /* Devolver nombre */
    }

    public String getRut() {
        return rut; /* Devolver RUT */
    }

    public String getTelefono() {
        return telefono; /* Devolver teléfono */
    }

    /**
     * Metodo set para modificar los datos de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; /* Definir nuevo nombre */
    }

    public void setRut(String rut) {
        this.rut = rut; /* Definir nuevo RUT */
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono; /* Definir nuevo teléfono */
    }

    /**
     * Sobreescritura del metodo To String
     */
    @Override
    public String toString() {
        return nombre + ", RUT: " + rut + ", Tel: " + telefono;
    }
}
