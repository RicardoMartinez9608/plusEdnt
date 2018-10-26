
package Entidad;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class entityTrataOr {
    private static final EntityManagerFactory pac=Persistence.createEntityManagerFactory("Edent_PU");
    
    public entityTrataOr(){}
        
    public static EntityManagerFactory getInstance(){
        return pac;    
    }
}
