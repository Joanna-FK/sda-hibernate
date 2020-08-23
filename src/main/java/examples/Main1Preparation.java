package examples;

import org.hibernate.SessionFactory;


public class Main1Preparation {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    }

}
