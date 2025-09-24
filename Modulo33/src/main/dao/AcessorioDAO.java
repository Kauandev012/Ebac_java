package main.dao;

import main.domain.Acessorio;

import javax.persistence.*;
import static javax.persistence.Persistence.createEntityManagerFactory;

public class AcessorioDAO implements IAcessorioDAO {
    @Override
    public Acessorio cadastrar(Acessorio acessorio) {

        EntityManagerFactory entityManagerFactory =
                createEntityManagerFactory("ExemplarJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return acessorio;
    }
}
