package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDAO;
import dao.IFormationDAO;
import fr.adaming.model.Formation;

/**
 * Servlet implementation class AjoutServlet
 */
@WebServlet("/AjoutServlet")
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/VueAjout.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Formation formation = new Formation();
		formation.setTheme(request.getParameter("Theme"));
		
		
		IFormationDAO dao = new FormationDAO();
		dao.addFormation(formation);
		this.getServletContext().getRequestDispatcher("/FormationHibernate/ListeServlet").forward(request, response);
	}

}