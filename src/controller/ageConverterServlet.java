package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AgeConverter;

/**
 * Servlet implementation class ageConverterServlet
 */
@WebServlet("/ageConverterServlet")
public class ageConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ageConverterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int humanAge = Integer.parseInt(request.getParameter("age"));
		String animal = request.getParameter("animals");
		
		AgeConverter ageConverter = new AgeConverter(humanAge, animal);
		
		request.setAttribute("ageConverter", ageConverter);
		getServletContext().getRequestDispatcher("/ageConverterResult.jsp").forward(request, response);
	}

}
