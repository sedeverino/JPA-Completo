package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example-unit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("en marcha Alberto");
        try{
            Cliente c1 = Cliente.builder().id_cliente(1).dni(34900300).build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        entityManager.close();
        entityManagerFactory.close();
    }
}
