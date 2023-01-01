package jm.task.core.jdbc.util;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

//   private static final long id;
//   private static final String name;
//   private static final String lastName;
   private static final String DB_DRIVER = "org.h2.Driver";
   private static final String DB_URL = "jbc:h2:~/test";
   private static final String DB_USERNAME = "root";
   private static final String DB_PASSWORD = "root";

   public static Connection getConnect() {
//      Connection connection = null;
      try {
         Class.forName(DB_DRIVER);
         try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            System.out.println("Connection succesfull");
            return connection;
         }
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
      return null;
   }
}
