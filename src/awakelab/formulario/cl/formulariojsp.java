package awakelab.formulario.cl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class formulariojsp
 */
@WebServlet("/formulariojsp")
public class formulariojsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formulariojsp() {
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
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Datos de usuario</h1>");
		out.println("<br>");
		out.println("<h2> Nombre: " + request.getParameter("nombre"));
		out.println("<h2> Fecha Accidente: " + request.getParameter("fecha"));
		out.println("<h2> Id Empresa: " + request.getParameter("id"));
		out.println("<h2> Tipo De Accidente: " + request.getParameter("tAccidente"));
		out.println("</html></body>");
		
		

	}
}