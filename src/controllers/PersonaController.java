package controllers;
import models.Persona;
import views.ViewsConsole;
import models.Direccion;
import java.util.Arrays;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int indexMayor = i + 1;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].compareCodigoDireccion(personas[i])) {
                    indexMayor = j;
                }
            }
            if (indexMayor != i) {
                Persona temp = personas[i];
                personas[i] = personas[indexMayor];
                personas[indexMayor] = temp;
            }
            
        }

    }

    public Persona findByCodigo(Persona[] personas, int codigo){
        int low = 0;
        int high = personas.length - 1;
        while (high >= low) {
            int centro = (low + high) / 2;
            if (personas[centro].equalsByCodigoDireccion(codigo)) return personas[centro];
            if ( personas[centro].compareCodigoDireccion(codigo)) {
                high = centro - 1;
            } else {
                low = centro + 1;

            }

            
        }
        return null;
        
    }
    
}
