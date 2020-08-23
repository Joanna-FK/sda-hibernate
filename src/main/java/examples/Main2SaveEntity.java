package examples;


import examples.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main2SaveEntity {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//tutaj dzieje sie transakcja

        session.persist(new Dog("Ares", "Terier", 10));
        session.persist(new Dog("Reksio", "Buldog", 7));
        session.persist(new Dog("Maksio", "Jamnik", 8));
        session.persist(new Dog("Aza", "Wilczur", 10));
        session.persist(new Dog("Mopy", "Bullterier", 3));

        transaction.commit();
        session.close();
    }
}
