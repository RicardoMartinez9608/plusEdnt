
package Entidad;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class entityTipop {
    private static final EntityManagerFactory tipo=Persistence.createEntityManagerFactory("Edent_PU");
    
    public entityTipop(){}
    
    public static EntityManagerFactory getInstance(){
     return tipo;
    }
}
