package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mariaConn {

	private Connection conn; //DB커넥션 연결 객체
	private static final String USERNAME = "root"; 
	private static final String PASSWORD = "apmsetup";
	private static final String URL = "jdbc:mysql://localhost:3306/govtest";
	
	public mariaConn() {
		try {
            System.out.println("생성자");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("드라이버 로딩 실패 ");
            try {
                conn.close();
            } catch (SQLException e1) {    }
        }
	}
	
}
//start.java에서 실행한다.
//위 클래스는 구현만 해놓은 상태
