package panier.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import panier.metier.Article;
import panier.metier.Panier;

/**
 * Servlet implementation class PanierServlet
 */
@WebServlet("/PanierServlet")
public class PanierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Panier panier = (Panier) session.getAttribute("panier");
		if(panier==null){
			panier = new Panier();
			session.setAttribute("panier", panier);
		}
		String cde = request.getParameter("cde");
		String page = "/index.jsp";
		if(cde!=null){
			switch(cde){
			case "add":
				page = "/index.jsp";
				String choix = request.getParameter("value");
				add(panier,choix);
				break;
			case "show":
				page = "/show.jsp";
				break;
			default:
				break;
			}
		}
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	private void add(Panier panier, String choix) {
		Article article = new Article(choix, 1, 1.2);
		panier.add(article);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
