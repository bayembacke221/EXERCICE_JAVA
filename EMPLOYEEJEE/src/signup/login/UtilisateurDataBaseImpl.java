package signup.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UtilisateurDataBaseImpl implements UtilisateurDataBase {
	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertUtilisateur(Utilisateur user) {
		int status = 0;
		try {
			con = ConnexionDb.getConnection();
			ps = con.prepareStatement("Insert into personnel values(?,?)");
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			status = ps.executeUpdate();
			con.close();
		}catch(Exception ex) {
			System.out.println("Pas d'isertion"+ex);
		}
		return status;
	}

	@Override
	public Utilisateur getUser(String username, String password) {
		Utilisateur user= new Utilisateur();
		
		try {
			con = ConnexionDb.getConnection();
			ps = con.prepareStatement("select * from personnel where login=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
			}
		}catch(Exception ex) {
			System.out.println("Pas d'acces a la base"+ex);
		}
		return null;
	}

}
