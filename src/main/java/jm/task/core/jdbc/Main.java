package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        UserDao userDao1 = new UserDaoHibernateImpl();
        userDao1.createUsersTable();
        userDao1.saveUser("Антон", "Чехов", (byte) 44);
        userDao1.saveUser("Альбер", "Камю", (byte) 46);
        userDao1.saveUser("Франц", "Кафка", (byte) 41);
        userDao1.saveUser("Уильям", "Моэм", (byte) 91);

        for (User user : userDao1.getAllUsers()) {
            System.out.println(user);
        }
        userDao1.removeUserById(1);
        userDao1.cleanUsersTable();
        userDao1.dropUsersTable();

//        Util.getConnection();
//        UserDao userDao = new UserDaoJDBCImpl();
//        userDao.createUsersTable();
//        userDao.saveUser("Антон", "Чехов", (byte) 44);
//        userDao.saveUser("Альбер", "Камю", (byte) 46);
//        userDao.saveUser("Франц", "Кафка", (byte) 41);
//        userDao.saveUser("Уильям", "Моэм", (byte) 91);
//        System.out.println(userDao.getAllUsers());
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();

    }
}
