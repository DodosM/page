package jdbc_connection;

public class start {

	public static void main(String[] args) {
		//mariaConn에는 진입함수가 없어 java application실행이 안된다. (클래스를 나눈 이유는 나중에 확인하는 메소드를 사용하고 싶을 때, start라는 인스턴스로 사용할 수 있기 때문이다)
		//mariaConn을 실행한다 
		mariaConn con = new mariaConn();
	}

}
