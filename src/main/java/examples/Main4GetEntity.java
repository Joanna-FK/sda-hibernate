package examples;

import examples.entity.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main4GetEntity {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Dog dogOne = session.get(Dog.class, 100L);
        if (dogOne != null) {
            System.out.println(dogOne.getName());
        }

        Dog dogTwo = session.find(Dog.class, 100L);
        if(dogTwo != null) {
            System.out.println(dogTwo.getName());
        }

        Dog dogThree = session.load(Dog.class, 1L);
        if(dogThree != null){
            System.out.println(dogThree.getName());
        }

        transaction.commit();
        session.close();
    }
}

