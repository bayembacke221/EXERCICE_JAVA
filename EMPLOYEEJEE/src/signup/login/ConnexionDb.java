package signup.login;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnexionDb implements Myprovider {
	static Connection con = null;
	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(urlConnexion,username,password);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return con;
	}
}
