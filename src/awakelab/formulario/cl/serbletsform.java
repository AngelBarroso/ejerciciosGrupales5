package awakelab.formulario.cl;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class serbletsform
 */
@WebServlet("/serbletsform")
public class serbletsform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serbletsform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String fecha = request.getParameter("fecha");
		String id = request.getParameter("id");
		String accidente = request.getParameter("tAccidente");
		
		request.setAttribute("nombreE", nombre);
		request.setAttribute("fechaA", fecha);
		request.setAttribute("idC", id);
		request.setAttribute("accidenteT", accidente);
		
		request.getRequestDispatcher("/RecibeDato.jsp").forward(request, response);
	}

}
