
package Entidad;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class entityConsulta {
    private static final EntityManagerFactory pac=Persistence.createEntityManagerFactory("Edent_PU"); 
    
    public entityConsulta(){}
    
    public static EntityManagerFactory getInstance(){
     return pac;
    }
}
