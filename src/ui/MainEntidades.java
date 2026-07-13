package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;
import model.ColaboradorExterno;
import javax.swing.JOptionPane;

/**
 * Clase principal con una interfaz gráfica básica (JOptionPane) que permite
 * registrar guías, vehículos y colaboradores externos, y mostrar su resumen
 */
public class MainEntidades {

    public static void main(String[] args) {

        /* Crear instancia del gestor de entidades */
        GestorEntidades gestor = new GestorEntidades();
        String opcion = "";

        /* Repetir el menú hasta que el usuario elija salir o cierre el cuadro */
        while (!opcion.equals("5")) {

            opcion = JOptionPane.showInputDialog(null,
                    "=== GESTION DE ENTIDADES - LLANQUIHUE TOUR ===\n\n"
                    + "1. Registrar Guía Turístico\n"
                    + "2. Registrar Vehículo\n"
                    + "3. Registrar Colaborador Externo\n"
                    + "4. Mostrar todas las entidades\n"
                    + "5. Salir\n\n"
                    + "Ingrese una opción:");

            /* Si el usuario cierra el cuadro de diálogo, terminar el programa */
            if (opcion == null) {
                break;
            }

            switch (opcion) {
                case "1":
                    registrarGuia(gestor);
                    break;
                case "2":
                    registrarVehiculo(gestor);
                    break;
                case "3":
                    registrarColaborador(gestor);
                    break;
                case "4":
                    mostrarResumenGeneral(gestor);
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    /**
     * Solicita los datos de un guía turístico y lo agrega al gestor
     */
    private static void registrarGuia(GestorEntidades gestor) {
        String nombre = JOptionPane.showInputDialog("Nombre del guía:");
        String rut = JOptionPane.showInputDialog("RUT del guía:");
        String especialidad = JOptionPane.showInputDialog("Especialidad:");

        GuiaTuristico guia = new GuiaTuristico(nombre, rut, especialidad);
        gestor.agregarEntidad(guia); /* Agregar el nuevo guía a la colección */

        JOptionPane.showMessageDialog(null, "Guía turístico registrado correctamente.");
    }

    /**
     * Solicita los datos de un vehículo y lo agrega al gestor
     */
    private static void registrarVehiculo(GestorEntidades gestor) {
        String nombre = JOptionPane.showInputDialog("Nombre o modelo del vehículo:");
        String patente = JOptionPane.showInputDialog("Patente:");
        int capacidad = 0;

        try {
            capacidad = Integer.parseInt(JOptionPane.showInputDialog("Capacidad de pasajeros:"));
        } catch (NumberFormatException e) {
            /* Si el valor ingresado no es numérico, se deja la capacidad en 0 */
            JOptionPane.showMessageDialog(null, "Capacidad inválida, se registrará como 0.");
        }

        Vehiculo vehiculo = new Vehiculo(nombre, patente, capacidad);
        gestor.agregarEntidad(vehiculo); /* Agregar el nuevo vehículo a la colección */

        JOptionPane.showMessageDialog(null, "Vehículo registrado correctamente.");
    }

    /**
     * Solicita los datos de un colaborador externo y lo agrega al gestor
     */
    private static void registrarColaborador(GestorEntidades gestor) {
        String nombre = JOptionPane.showInputDialog("Nombre del colaborador:");
        String rut = JOptionPane.showInputDialog("RUT del colaborador:");
        String empresa = JOptionPane.showInputDialog("Empresa que representa:");

        ColaboradorExterno colaborador = new ColaboradorExterno(nombre, rut, empresa);
        gestor.agregarEntidad(colaborador); /* Agregar el nuevo colaborador a la colección */

        JOptionPane.showMessageDialog(null, "Colaborador externo registrado correctamente.");
    }

    /**
     * Muestra por consola el resumen de todas las entidades registradas
     */
    private static void mostrarResumenGeneral(GestorEntidades gestor) {
        System.out.println("\n=== RESUMEN DE ENTIDADES REGISTRADAS ===");
        gestor.mostrarEntidades();

        JOptionPane.showMessageDialog(null,
                "Se mostró el resumen de las entidades en la consola.");
    }
}
