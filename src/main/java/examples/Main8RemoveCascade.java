package examples;

import examples.entity.Husband;
import examples.entity.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main8RemoveCascade {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Husband husband = session.find(Husband.class, 2L);
        session.remove(husband);


        transaction.commit();
        session.close();
    }
}
