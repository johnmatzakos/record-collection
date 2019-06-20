package com.recordcollection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.recordcollection.domains.Record;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by Ioannis Matzakos on 26/03/2019.
 */

@Service
@Profile("jpadao")
public class RecordServiceJpaDaoImpl implements RecordService {

    private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Record> listAll() {
        EntityManager em = emf.createEntityManager();

        return em.createQuery("from Record", Record.class).getResultList();
    }

    @Override
    public Record getById(Integer id) {
        EntityManager em = emf.createEntityManager();

        return em.find(Record.class, id);
    }

    @Override
    public Record saveOrUpdate(Record domainObject) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Record savedRecord = em.merge(domainObject);
        em.getTransaction().commit();

        return savedRecord;
    }

    @Override
    public void delete(Integer id) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.remove(em.find(Record.class, id));
        em.getTransaction().commit();

    }
}
