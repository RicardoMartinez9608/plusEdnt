
package Entidad;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class entityCefalom {
    private static final EntityManagerFactory pac=Persistence.createEntityManagerFactory("Edent_PU"); 
    
    public entityCefalom(){}
    
    public static EntityManagerFactory getInstance(){
     return pac;
    }
}
