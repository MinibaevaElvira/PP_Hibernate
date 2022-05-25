package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();

        userDao.saveUser("Антон", "Чехов", (byte) 44);
        userDao.saveUser("Альбер", "Камю", (byte) 46);
        userDao.saveUser("Франц", "Кафка", (byte) 41);
        userDao.saveUser("Уильям", "Моэм", (byte) 91);

        userDao.getAllUsers();
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
