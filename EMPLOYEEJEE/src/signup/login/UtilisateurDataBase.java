package signup.login;

public interface UtilisateurDataBase {
	public int insertUtilisateur(Utilisateur user);
	public Utilisateur getUser(String username,String password);
}
