package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


import static jm.task.core.jdbc.util.Util.getSessionFactory;

public class UserDaoHibernateImpl implements UserDao {
    private Session session;
    private Transaction transaction ;

    public UserDaoHibernateImpl() {}

    @Override
    public void createUsersTable() {
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            String sql = "CREATE TABLE IF NOT EXISTS schema.database " +
                    "(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    " name VARCHAR(15)," +
                    " lastName VARCHAR(30)," +
                    " age TINYINT);";
            session.createNativeQuery(sql).addEntity(User.class).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
        } finally {
            session.close();
        }
    }

    @Override
    public void dropUsersTable() {
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            String sql = "DROP TABLE IF EXISTS schema.database";
            session.createNativeQuery(sql).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
        } finally {
            session.close();
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        User user = new User(name, lastName, age);
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            System.out.println("User с именем – " + name + " добавлен в базу данных");
            transaction.commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        } finally {
            session.close();
        }
    }

    @Override
    public void removeUserById(long id) {
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(session.get(User.class, id));
            transaction.commit();
        } catch (HibernateException e) {
        } finally {
            session.close();
        }
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            session = getSessionFactory().openSession();
            String sql = "from User";
            users = session.createQuery(sql).list();
        } catch (Exception e) {
        }  finally {
            session.close();
        }
        return users;
    }

    @Override
    public void cleanUsersTable() {
        try {
            session = getSessionFactory().openSession();
            transaction = session.beginTransaction();
            String sql = "TRUNCATE TABLE schema.database";
            session.createNativeQuery(sql).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }  finally {
            session.close();
        }
    }
}
