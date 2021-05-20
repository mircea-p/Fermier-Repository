package com.sda.repository;

import com.sda.model.Arendator;
import com.sda.model.Fermier;
import com.sda.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ArendatoriRepository {

    public void save(Arendator arendator){

        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(arendator);
        transaction.commit();
        session.close();
    }
}
