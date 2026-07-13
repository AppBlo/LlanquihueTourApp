package data;

import model.Registrable;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;
import java.util.ArrayList;

/**
 * Clase GestorEntidades que administra una colección polimórfica
 * de entidades Registrable (guías, vehículos y colaboradores externos)
 */
public class GestorEntidades {

    private ArrayList<Registrable> entidades; /* Colección genérica de entidades registrables */

    /**
     * Constructor de la clase GestorEntidades
     */
    public GestorEntidades() {
        this.entidades = new ArrayList<>(); /* Inicializar colección vacía */
    }

    /**
     * Agrega una entidad a la colección
     * @param entidad Entidad a registrar
     */
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad); /* Agregar entidad a la colección */
    }

    /**
     * Metodo get para devolver la colección de entidades
     */
    public ArrayList<Registrable> getEntidades() {
        return entidades; /* Devolver colección de entidades */
    }

    /**
     * Recorre la colección y muestra el resumen de cada entidad,
     * diferenciando el tipo específico mediante instanceof
     */
    public void mostrarEntidades() {

        if (entidades.isEmpty()) {
            System.out.println("No hay entidades registradas.");
            return;
        }

        for (Registrable entidad : entidades) {

            /* Diferenciar el tipo de entidad para aplicar una lógica particular */
            if (entidad instanceof GuiaTuristico) {
                System.out.println("\n-- Entidad de tipo Guía Turístico --");
            } else if (entidad instanceof Vehiculo) {
                System.out.println("\n-- Entidad de tipo Vehículo --");
            } else if (entidad instanceof ColaboradorExterno) {
                System.out.println("\n-- Entidad de tipo Colaborador Externo --");
            }

            entidad.mostrarResumen(); /* Llamar al metodo polimórfico de la interfaz */
        }
    }
}
