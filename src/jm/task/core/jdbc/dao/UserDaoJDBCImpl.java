package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl extends Util implements UserDao {

    Connection connection = getConnect();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        PreparedStatement preparedStatement = null;

        String sql = "CREATE TABLE IF NOT EXISTS user (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(20), lastName VARCHAR(20), age INT)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.executeUpdate();

            System.out.println("DataBase has created");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO USER (NAME, LASTNAME, AGE) VALUES (?, ?, ?)";
        User.getId();
//        static {
            try {
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setLong(1, User.getId());

                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
//        }
    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        List<User> allUser= new ArrayList<>();

        String sql = "SELECT (NAME, LASTNAME, AGE)";

        Statement statement = null;

//        try {
//
//        }
        return null;
    }

    public void cleanUsersTable() {

    }
}
