
package Controlador;

import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class ControladorEstudiante {
    
    private Estudiante modelo;
    private VistaEstudiante Vista;

    public ControladorEstudiante(Estudiante modelo, VistaEstudiante Vista) {
        this.modelo = modelo;
        this.Vista = Vista;
    }
    
    
    public void setNombreEstudiante(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombreEstudiante() {
        return modelo.getNombre();
    }

    public void setEdadEstudiante(int edad) {
        modelo.setEdad(edad);
    }

    public int getEdadEstudiante() {
        return modelo.getEdad();
    }

    public void actualizarVista() {
     Vista.mostrarDetalleEstudiante(modelo.getNombre(), modelo.getEdad());
    }
}
