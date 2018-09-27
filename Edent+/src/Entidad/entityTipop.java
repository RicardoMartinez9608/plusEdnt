/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DELL
 */
public class entityTipop {
    private static final EntityManagerFactory tipo=Persistence.createEntityManagerFactory("Edent_PU");
    
    public entityTipop(){}
    
    public static EntityManagerFactory getInstance(){
     return tipo;
    }
}
