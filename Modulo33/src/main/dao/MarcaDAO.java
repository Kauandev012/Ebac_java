package main.dao;

import main.domain.Marca;

import javax.persistence.*;
import static javax.persistence.Persistence.createEntityManagerFactory;

public class MarcaDAO implements IMarcaDAO {
    @Override
    public Marca cadastrar(Marca marca) {

        EntityManagerFactory entityManagerFactory =
                createEntityManagerFactory("ExemplarJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(marca);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return marca;
    }
}
