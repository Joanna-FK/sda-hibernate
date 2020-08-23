package examples;

import examples.entity.Address;
import examples.entity.Employee;
import examples.entity.Gender;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class Main6Annotations {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee("Jan","password123", "123456787", 25L, new Date(), Gender.MALE, "description");
        employee.setAddress(new Address("Gdansk", "Grunwaldzka"));
        session.persist(employee);

        transaction.commit();
        session.close();
    }
}
