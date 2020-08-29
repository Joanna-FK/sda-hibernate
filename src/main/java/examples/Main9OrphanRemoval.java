package examples;

import examples.entity.Husband;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main9OrphanRemoval {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Husband husband = session.find(Husband.class, 3L);
        husband.setWife(null);

        transaction.commit();
        session.close();
    }
}
