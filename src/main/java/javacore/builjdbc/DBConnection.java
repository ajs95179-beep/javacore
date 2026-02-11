package javacore.builjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/demo_jdbc";
            String user = "root";
            String password = "1256";  

            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Ket noi thanh cong!");

        } catch (Exception e) {
            System.out.println("Ket noi that bai!");
            e.printStackTrace();
        }

        return conn;
    }
}

