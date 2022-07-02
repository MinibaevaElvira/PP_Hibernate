package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Антон", "Чехов", (byte) 44);
        userService.saveUser("Альбер", "Камю", (byte) 46);
        userService.saveUser("Франц", "Кафка", (byte) 41);
        userService.saveUser("Уильям", "Моэм", (byte) 91);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }
        userService.removeUserById(1);
        userService.cleanUsersTable();
        userService.dropUsersTable();

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
