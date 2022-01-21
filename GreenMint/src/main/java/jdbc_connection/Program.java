/**
 * mysql (workbench connection OK)
 */

package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//이클립스 - 마리아 db연결 확인 클래스
		String url = "jdbc:mysql://127.0.0.1:3306/govtest";
		String sql = "SELECT * FROM search_tchnlgy_product";
		
        // 클래스를 객체화, 드라이버를 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
        // 실행 도구 생성
		Connection con = DriverManager.getConnection(url, "root", "apmsetup");
		System.out.println("DB connection OK");
		
        // 연결 객체를 얻음
		Statement st = con.createStatement();
        // 쿼리를 실행하여 결과 집합을 얻어온다.
		ResultSet rs = st.executeQuery(sql);

		if(rs.next()) { // 다음 값을 가져옴 Bof ~ Eof
			String ex1 = rs.getString("idsearch_tchnlgy_product");
			System.out.println("idsearch_tchnlgy_product : " + ex1);
}

		rs.close();
		st.close();
		con.close();

	}

}
