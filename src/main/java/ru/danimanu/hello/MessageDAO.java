package ru.danimanu.hello;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class MessageDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Message> findAllMessages() {
        Query query = entityManager.createQuery("select c from ru.danimanu.hello.Message c");
        return query.getResultList();
    }
}
