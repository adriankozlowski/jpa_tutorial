package pl.sda;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
        EntityManager entityManager = emf.createEntityManager();
        ;

        entityManager.close();
        emf.close();
    }
}
