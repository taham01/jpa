package com.taha.mohammad;

import com.taha.mohammad.entity.Actor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Actor actor = new Actor();
        actor.setFirst_name("Majd");
        actor.setLast_name("Kontar");
        entityManager.persist(actor);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}