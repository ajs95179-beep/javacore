package javacore.builjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javacoreutil.DBConnection;

public class BuildingJdbc {

    public static void main(String[] args) {

        try {
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM student";

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Danh sach sinh vien:");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " - " + name + " - " + email);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
