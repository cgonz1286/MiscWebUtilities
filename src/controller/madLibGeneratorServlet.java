package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLibGenerator;

/**
 * Servlet implementation class madLibGeneratorServlet
 */
@WebServlet("/madLibGeneratorServlet")
public class madLibGeneratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public madLibGeneratorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String volume = request.getParameter("volume");
		String person = request.getParameter("person");
		String place = request.getParameter("place");
		String thing = request.getParameter("thing");
		String verb = request.getParameter("verb");
		String adjective = request.getParameter("adjective");
		
		MadLibGenerator madLib = new MadLibGenerator(volume, person, place, thing, verb, adjective);
		
		request.setAttribute("generatedMadLib", madLib);
		getServletContext().getRequestDispatcher("/madLibGeneratorResult.jsp").forward(request, response);
	}

}
