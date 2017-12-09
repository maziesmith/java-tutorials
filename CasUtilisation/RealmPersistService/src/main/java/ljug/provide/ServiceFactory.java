/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ljug.provide;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pfares
 */
public class ServiceFactory {
    Services s;
    
    public static Services ServicesBuilder(EntityManagerFactory emf) {
        return new ServiceControle(emf);
    }
    
    public static Services ServicesBuilder() {
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("RPS_PU");
        return new ServiceControle(emf);
    }
    
}
