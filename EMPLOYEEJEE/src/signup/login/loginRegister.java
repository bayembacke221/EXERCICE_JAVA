package signup.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginRegister
 */
@WebServlet("/loginRegister")
public class loginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UtilisateurDataBaseImpl user = new UtilisateurDataBaseImpl();
            String username = request.getParameter("username");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		Utilisateur utilisateur = user.getUser(username, password);
		if(submitType.equals("Connexion")&& utilisateur!=null && utilisateur.getUsername()!=null) {
			request.setAttribute("message", utilisateur.getUsername());
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
		}else if(submitType.equals("Inscription") ){
                    utilisateur.setUsername(username);
                    utilisateur.setPassword(password);
                    user.insertUtilisateur(utilisateur);
                    request.setAttribute("SuccesMessage", "Inscription reussit");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }else{
                    request.setAttribute("message", "Donnee saisie incorrect");
                    request.getRequestDispatcher("erreur.jsp").forward(request, response);
                }
	}

}
