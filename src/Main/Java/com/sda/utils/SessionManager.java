package com.sda.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionManager extends AbstractSessionManager
{

    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager()
    {
    }

    public static void shutDown()
    {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory()
    {
        return INSTANCE.getSessionFactory("FermaDB");
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration)
    {

        configuration.addAnnotatedClass(Fermier.class);
//        configuration.addAnnotatedClass(Reservation.class);
//        configuration.addAnnotatedClass(Seat.class);
//        configuration.addAnnotatedClass(Account.class);


    }


}
