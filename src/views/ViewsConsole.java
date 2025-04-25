package views;
import models.Persona;  
import controllers.PersonaController;
import models.Direccion;

public class ViewsConsole {
    public void printArray(Persona[] personas){
        for (Persona p: personas) {
            System.out.println(p.toString());
        }   
        System.out.println();
    }
    
}
