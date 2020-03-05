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
import dao.ILieuDAO;
import dao.LieuDAO;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;


/**
 * Servlet implementation class AjoutServlet
 */
@WebServlet("/AjoutLieuServlet")
public class AjoutLieuxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutLieuxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Lieu> list = new ArrayList<Lieu>();
		ILieuDAO dao = new LieuDAO();
		list = dao.getLieu();
		request.setAttribute("lieu", list);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Formation formation = new Formation();
		formation.setTheme(request.getParameter("theme"));
		
		Lieu lx = new Lieu();
		lx.setIdLieu(Integer.parseInt(request.getParameter("idLieu")));	
		formation.setLieu(lx);
		IFormationDAO dao = new FormationDAO();
		dao.addFormation(formation);
		this.getServletContext().getRequestDispatcher("/LissLieuxServlet").forward(request, response);
	}

}
