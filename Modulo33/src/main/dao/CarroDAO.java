package main.dao;

import main.domain.Carro;

import javax.persistence.*;
import static javax.persistence.Persistence.createEntityManagerFactory;

public class CarroDAO implements ICarroDAO {
    @Override
    public Carro cadastrar(Carro carro) {

        EntityManagerFactory entityManagerFactory =
                createEntityManagerFactory("ExemplarJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return carro;
    }
}
