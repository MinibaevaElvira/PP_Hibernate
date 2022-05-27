package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    Util util = new Util();
    private Statement statement;
    private PreparedStatement preparedStatement;

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//        try {
//            statement = util.getConnection().createStatement();
//            String sql = "CREATE TABLE IF NOT EXISTS schema.database " +
//                    "(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
//                    " name VARCHAR(15)," +
//                    " lastName VARCHAR(30)," +
//                    " age TINYINT);";
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void dropUsersTable() {
//        try {
//            statement = util.getConnection().createStatement();
//            String sql = "DROP TABLE IF EXISTS schema.database";
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        try {
//            String sql = "INSERT INTO schema.database ( name, lastname, age) VALUES (?, ?, ?)";
//            preparedStatement = util.getConnection().prepareStatement(sql);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//            System.out.println("User с именем – " + name + " добавлен в базу данных");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void removeUserById(long id) {
//        try {
//         String sql = "DELETE FROM schema.database WHERE id = ?";
//         preparedStatement = util.getConnection().prepareStatement(sql);
//         preparedStatement.setLong(1, id);
//         preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        try {
//            statement = util.getConnection().createStatement();
//            String sql = "SELECT * FROM schema.database";
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()) {
//                User user = new User();
//
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException();
//        }

        return null;
    }

    public void cleanUsersTable() {
//        try {
//            String sql = "DELETE FROM schema.database";
//            preparedStatement = util.getConnection().prepareStatement(sql);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
