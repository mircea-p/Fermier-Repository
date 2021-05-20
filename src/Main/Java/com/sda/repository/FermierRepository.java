package com.sda.repository;

import com.sda.model.Fermier;
import com.sda.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
