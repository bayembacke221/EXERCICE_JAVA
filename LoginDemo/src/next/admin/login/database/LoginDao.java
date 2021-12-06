package next.admin.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import next.admin.login.bean.LoginBean;


public class LoginDao {
	private String dbUrl="jdbc:mysql://localhost:3306/userdb";
	private String dbUname="root";
	private String dbPassword="";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return (Connection) con;
	}
	public boolean validate(LoginBean loginBean) throws SQLException {
		loadDriver(dbDriver);
		Connection con=getConnection();
		boolean status=false;
		String sql="select * from login where username =? and password =?";
		
		PreparedStatement ps;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, loginBean.getUsername());
			ps.setString(2, loginBean.getPassword());
			
			ResultSet rs = ps.executeQuery();
			status =rs.next();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return status;
		
	}

}
