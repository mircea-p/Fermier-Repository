package com.sda.repository;

import com.sda.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FermierRepository {

    public Fermier findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();

        Fermier fermier = session.find(Fermier.class, id);

        session.close();
        return fermier;
    }

    public void save(Fermier fermier){

        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(fermier);
        transaction.commit();
        session.close();
    }
}
