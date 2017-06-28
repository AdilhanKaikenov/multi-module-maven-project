package com.epam.adk.ejb.dao;

import com.epam.adk.ejb.persistance.Message;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * TODO: Comment
 * <p>
 * Created on 6/27/2017.
 *
 * @author Kaikenov Adilkhan
 */
@Stateless
public class MessageDao {

    @PersistenceContext(name = "h2PU")
    private EntityManager entityManager;

    public Message submit(Message message) {
        entityManager.persist(message);
        return message;
    }
}
