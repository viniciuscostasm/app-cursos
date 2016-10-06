/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.cimatec.acad.util;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author 31311286
 */
public class HibernateUtil {

   private static SessionFactory sessionFactory = buildSessionFactory();

   private static SessionFactory buildSessionFactory() {
        try {
             
            AnnotationConfiguration conf = new AnnotationConfiguration();
            conf.configure("hibernate.cfg.xml");
            SessionFactory obj = conf.buildSessionFactory();
            
            return obj;
            } catch (Throwable ex) {
            System.err.println("Falha ao Iniciar Sessão." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    
    
}
