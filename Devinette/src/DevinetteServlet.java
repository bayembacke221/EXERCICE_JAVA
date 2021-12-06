

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DevinetteServlet
 */
@WebServlet("/devinette")
public class DevinetteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println ("<html>");
		out.println ("<head>");
		out.println ("<title>Nombre à deviner</title>");
		out.println ("</head>");
		out.println ("<body>");
		int number =22;
		String tatonne = request.getParameter ("choix");
		int saisie = new Integer (tatonne).intValue ( );
		if (saisie > number)
		out.println ("<H2>NOMBRE TROP ELEVE</H2>");
		if (saisie < number)
		out.println ("<H2>NOMBRE TROP BAS</H2>");
		if (saisie == number)
		out.println ("<H2>NOMBRE CORRECT</H2>");
		out.println ("</body>"); out.println ("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
