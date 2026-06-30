package data;

import model.Guia;
import model.Persona;
import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase GestorDatos que lee los archivos de datos y crea los objetos correspondientes
 */
public class GestorDatos {

    /**
     * Lee el archivo .txt y retorna un ArrayList con los objetos Tour creados
     * @param rutaArchivo Ruta del archivo a leer
     * @return Lista de objetos Tour
     */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        /* Lista donde se almacenarán los objetos Tour */
        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            /* Abrir el archivo con BufferedReader para leerlo línea por línea */
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            /* Recorrer cada línea del archivo */
            while ((linea = lector.readLine()) != null) {

                /* Ignorar líneas vacías */
                if (linea.trim().isEmpty()) {
                    continue;
                }

                /* Separar los datos usando punto y coma como delimitador */
                String[] datos = linea.split(";");

                /* Verificar que la línea tenga exactamente 3 campos */
                if (datos.length == 3) {
                    String nombreTour = datos[0].trim(); /* Nombre del tour */
                    String duracion   = datos[1].trim(); /* Duración del tour */
                    double valor      = Double.parseDouble(datos[2].trim()); /* Valor del tour */

                    /* Crear objeto Tour y agregarlo a la lista */
                    Tour tour = new Tour(nombreTour, duracion, valor);
                    listaTours.add(tour);
                }
            }

            /* Cerrar el archivo */
            lector.close();

        } catch (IOException e) {
            /* Mostrar mensaje de error si no se puede leer el archivo */
            System.out.println("Error al leer el archivo de tours: " + e.getMessage());
        }

        return listaTours;
    }

    /**
     * Lee el archivo .txt y retorna un ArrayList con los objetos Guia creados
     * @param rutaArchivo Ruta del archivo a leer
     * @return Lista de objetos Guia
     */
    public ArrayList<Guia> cargarGuias(String rutaArchivo) {

        /* Lista donde se almacenarán los objetos Guia */
        ArrayList<Guia> listaGuias = new ArrayList<>();

        try {
            /* Abrir el archivo con BufferedReader para leerlo línea por línea */
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            /* Recorrer cada línea del archivo */
            while ((linea = lector.readLine()) != null) {

                /* Ignorar líneas vacías */
                if (linea.trim().isEmpty()) {
                    continue;
                }

                /* Separar los datos usando punto y coma como delimitador */
                String[] datos = linea.split(";");

                /* Verificar que la línea tenga exactamente 4 campos */
                if (datos.length == 4) {
                    String nombre       = datos[0].trim(); /* Nombre del guía */
                    String rut          = datos[1].trim(); /* RUT del guía */
                    String telefono     = datos[2].trim(); /* Teléfono del guía */
                    String especialidad = datos[3].trim(); /* Especialidad del guía */

                    /* Crear objeto Persona, luego Guia, y agregarlo a la lista */
                    Persona persona = new Persona(nombre, rut, telefono);
                    Guia guia = new Guia(persona, especialidad);
                    listaGuias.add(guia);
                }
            }

            /* Cerrar el archivo */
            lector.close();

        } catch (IOException e) {
            /* Mostrar mensaje de error si no se puede leer el archivo */
            System.out.println("Error al leer el archivo de guías: " + e.getMessage());
        }

        return listaGuias;
    }
}
