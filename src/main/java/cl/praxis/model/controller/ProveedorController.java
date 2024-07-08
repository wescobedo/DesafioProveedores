package cl.praxis.model.controller;



import cl.praxis.model.dao.ProveedorDAO;

import cl.praxis.model.dto.Proveedor;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProveedorController")
public class ProveedorController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProveedorController() {
        super();
    }
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	ProveedorDAO pDAO = new ProveedorDAO();
		
		List<Proveedor> proveedores = pDAO.obtenerTodosLosProveedores();
		
		
		proveedores.stream().forEach(System.out::println);
		
		request.setAttribute("proveedores", proveedores);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    	    	
    	    	
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Aquí se podría implementar la lógica para guardar un proveedor en la base de datos
        // y luego redirigir o mostrar un mensaje según el resultado
    }
}


