package org.example;

import org.example.entity.Number;
import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Number.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

//        User user = new User("Oleksii", "Kot");
//        user.addNumber(new Number("097-123-4567"));
//        user.addNumber(new Number("050-123-4567"));
//        user.addNumber(new Number("073-123-4567"));
//
//        session.beginTransaction();
//        session.persist(user);
//        session.getTransaction().commit();

//        session.beginTransaction();
//        System.out.println(getUserNumbersByID(session, 10));
//        session.getTransaction().commit();

//        session.beginTransaction();
//        removeNumberByID(session, 17);
//        session.getTransaction().commit();
    }

    public static List<Number> getUserNumbersByID(Session session, int id) {
        User user = session.get(User.class, id);
        return user.getNumbers();
    }

    public static void removeNumberByID(Session session, int id) {
        session.remove(session.get(Number.class, id));
    }
}
