package signup.login;

public class Utilisateur {
private String username;
private String password;
public Utilisateur(String username, String password) {
	this.username = username;
	this.password = password;
}
public Utilisateur() {}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
