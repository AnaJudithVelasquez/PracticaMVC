
package mvc;

import Modelo.Estudiante; 
import Vista.VistaEstudiante;
import Controlador.ControladorEstudiante;

public class MVC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inicializamos el modelo creando un nuevo estudiante
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Pepito");
        estudiante1.setEdad(17);
        
        //Inicializamos 
        VistaEstudiante vista = new VistaEstudiante();
        ControladorEstudiante controlador = new ControladorEstudiante(estudiante1, vista );
        
        controlador.actualizarVista();
        
    }
    
}
