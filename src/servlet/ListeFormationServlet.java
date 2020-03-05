package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FormationDAO;
import dao.IFormationDAO;
import fr.adaming.model.Formation;

/**
 * Servlet implementation class ListeServlet
 */
@WebServlet("/ListeServlet")
public class ListeFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeFormationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Formation> list = new ArrayList<Formation>();
		IFormationDAO dao = new FormationDAO();
		list=dao.getFormation();
		request.setAttribute("formation", list);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ListeFormation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/VueListe.jsp").forward(request, response);
		
		
	}

}
