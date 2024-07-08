package cl.praxis.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.model.conexion.Conexion;
import cl.praxis.model.dto.Proveedor;

public class ProveedorDAO {
    //private Connection conexion;

    //public ProveedorDAO() {
    //    conexion = Conexion.getInstancia().getConexion();
    //}

    public void insertarProveedor(Proveedor p) {
        String sql = "INSERT INTO proveedores (nombre, rut, direccion, correo, telefono, contacto, telefono_contacto) VALUES ('" + p.getNombre() + "', '" + p.getRut() + "','" + p.getDireccion() + "','" + p.getCorreo() + "', '" + p.getTelefono() + "','" + p.getContacto() + "','" + p.getTelefonocontacto() + "')";

        try {
			Connection c = Conexion.getCon();
			Statement s = c.createStatement();
			s.execute(sql);
		}  catch (SQLException e) {
			System.out.println("ERROR en método create()");
			e.printStackTrace();
		}
    }

    public List<Proveedor> obtenerTodosLosProveedores() {
    	
    	
    	List<Proveedor> proveedores = new ArrayList<>();

		try {

			// pido una conección a la BD
			Connection c = Conexion.getCon();

			Statement s = c.createStatement();
			String sql = "SELECT * FROM proveedores ORDER BY nombre ASC";

			ResultSet rs = s.executeQuery(sql);
			
			System.out.print(rs);
			
			System.out.println("conecion");
			while (rs.next()) {
				proveedores.add(new Proveedor(rs.getInt("id"), rs.getString("nombre"), rs.getString("rut"), rs.getString("direccion") , rs.getString("correo"), rs.getString("telefono"), rs.getString("contacto"), rs.getString("telefonocontacto")));
			}

		} catch (SQLException e) {
			System.out.println("ERROR en método read()");
			e.printStackTrace();
		}

		return proveedores;
    	
        
    }
}