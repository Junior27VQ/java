package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);
	
	public static void insertar(Persona persona) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		LOGGER.trace("Persona a insertar>>>> "+persona);
		try {
			//abrimos la coneccion
			con=ConexionBDD.conectar();
			//System.out.println("Insertar");	
			
			ps=con.prepareStatement("insert into personas(cedula,nombre,apellido,estatura,cantidad_ahorrada,numero_fijo,estado_civil_codigo,fecha_nacimiento,hora_nacimiento)"
					+" values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDouble(4, persona.getEstatura());
			ps.setBigDecimal(5, persona.getCantidadAhorrada());
			ps.setInt(6, persona.getNumeroHijo());
			ps.setString(7, persona.getEstadoCivil().getCodigo());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
			
			ps.executeUpdate();
		}catch(Exception e) {
			//logear el error
			LOGGER.error("Error al insertar", e);
			//mostrar el error al usuario
			throw new Exception("Error al insertar");
			//no usar el System.out.println(e.getMessage());	
		}finally {
			//cerramos la coneccion
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la infraestructura");
				//System.out.println("Error de la infraestructura");	
			}
		}
		
	}
	public static void actualizar(Persona persona) throws Exception {
		Connection con=null;
		PreparedStatement act=null;
		LOGGER.trace("Persona a actualizar>>>> "+persona);
		try {
			
			con=ConexionBDD.conectar();
			act=con.prepareStatement("update personas set nombre=?,apellido=? where cedula=?");
			act.setString(1, persona.getNombre());
			act.setString(2, persona.getApellido());
			act.setString(3, persona.getCedula());
			act.executeUpdate();
			
		} catch (SQLException e) {
			LOGGER.error("Error en la base de datos", e);
			throw new Exception("Error en la base de datos");
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error con la infraestructura");
		}
	}
	public static void eliminar(String cedula) throws Exception {
		Connection con=null;
		PreparedStatement eli=null;
		LOGGER.trace("Persona a actualizar>>>> "+cedula);
		try {
			con=ConexionBDD.conectar();
			eli=con.prepareStatement("delete from personas where cedula=?");
			eli.setString(1, cedula);
			eli.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error el eliminar"+cedula);
		}
	}

}
