package demojava.buildingjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import demojava.connectionutils.ConnectionUtil;

public class BuildingJdbc{
	public static void main(String[] args) {
	    System.out.println("dang ket noi...");
	    try (Connection connection = ConnectionUtil.getConnection()) { 
	        if (connection != null) {
	            System.out.println("ket noi thanh cong");
	            
	            // 2. Thử thực thi một truy vấn đơn giản để xác nhận [4]
	            Statement statement = connection.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT 1");
	            
	            if (resultSet.next()) {
	                System.out.println("co so du lieu san sang phan hoi.");
	            }
	        } else {
	            System.out.println("Kết nối thất bại. Vui lòng kiểm tra lại Username/Password hoặc MySQL Service.");
	        }
	    } catch (SQLException e) {
	        // Xử lý lỗi ngoại lệ để tránh dừng ứng dụng đột ngột [5, 6]
	        e.printStackTrace();
	    }
	}
	
}

