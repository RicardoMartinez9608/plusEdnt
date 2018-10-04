
package Entidad;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class entityPaciente {
    private static final EntityManagerFactory pac=Persistence.createEntityManagerFactory("Edent_PU"); 
    public entityPaciente(){}
    
    public static EntityManagerFactory getInstance(){
     return pac;
    }
}
