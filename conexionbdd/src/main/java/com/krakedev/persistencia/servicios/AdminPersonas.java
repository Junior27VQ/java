package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;
import com.krakedev.persistencia.utils.Convertidor;

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
	public static ArrayList<Persona> buscarPorNombre(String nombreBuscar) throws Exception {
		ArrayList<Persona> persona=new ArrayList<Persona>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null; 
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from personas where nombre like ? ");
		    ps.setString(1, "%"+nombreBuscar+"%");//el string se lo concatena con los prsentajes
		    
		    rs=ps.executeQuery();//este metodo sirve para traer el resultado de nuestra consulta
		    while(rs.next()) {//la sentencia while funciona como el for pero la diferencia es que miestras tenga datos para mostrar va a barrer el areglo
		    	
		    	String nombre=rs.getString("nombre");//recuperamos valores
		    	String cedula=rs.getString("cedula");
		    	
		    	Persona p=new Persona();//intanciamos un objeto persona
		    	p.setCedula(cedula);//agregamos la informacion
		    	p.setNombre(nombre);
		    	persona.add(p);//guardamos en el arraylist
		    	
		    }
		} catch (Exception e) {
			LOGGER.error("Error al consunltar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la infraestructura");
			}
		}
		
		return persona;
		}
	public static Persona buscarPorCedula(String cedulaBuscar) throws Exception {
		Persona p=null;	
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null; 
		
			try {
				con=ConexionBDD.conectar();
				ps=con.prepareStatement("select * from personas where cedula = ? ");
			    ps.setString(1, cedulaBuscar);
			    
			    rs=ps.executeQuery();
			    
			    if(rs.next()) {
			    	p=new Persona();
			    	String cedula=rs.getString("cedula");
			    	String nombre=rs.getString("nombre");
			    	String apellido=rs.getString("apellido");
			    	double estatura=rs.getDouble("estatura");
			    	java.sql.Date fecha_nacimiento=rs.getDate("fecha_nacimiento");
			    	java.sql.Time hora_nacimiento=rs.getTime("hora_nacimiento");
			    	//BigDecimal cantidad_ahorrada=rs.getBigDecimal("cantidad_ahorrada");
			    	String valor=rs.getString("cantidad_ahorrada");
			    	String monto=valor.replace("$", "").replace(",", "").replace(",", ".");	
			    	p.setCantidadAhorrada(new BigDecimal(monto));
			    	int numero_hijos=rs.getInt("numero_fijo");
			    	String ec=rs.getString("estado_civil_codigo");
			    	EstadoCivil estado_civil=Convertidor.mapear(ec);
			    	
			    	p.setCedula(cedula);
			    	p.setNombre(nombre);
			    	p.setApellido(apellido);
			    	p.setEstatura(estatura);
			    	p.setFechaNacimiento(new java.util.Date(fecha_nacimiento.getTime()));
			    	p.setHoraNacimiento(new java.util.Date(hora_nacimiento.getTime()));
			    	//p.setCantidadAhorrada(rs.getBigDecimal("cantidad_ahorrada"));
			    	p.setNumeroHijo(numero_hijos);
			    	p.setEstadoCivil(estado_civil);
			    	
			    }
			    return p;
			} catch (Exception e) {
				LOGGER.error("Error al consunltar persona por cedula", e);
				throw new Exception("Error al consultar persona por cedula");
			} finally {
				
				try {
					con.close();
				} catch (SQLException e) {
					LOGGER.error("Error con la base de datos", e);
					throw new Exception("Error con la infraestructura");
				}
			}
			
			}
	public static ArrayList<Persona> buscarPersona(String pornombre, String porapellido, String codigo) throws Exception {
		ArrayList<Persona> persona=new ArrayList<Persona>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null; 
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("select * from personas where nombre like ? and apellido like ? and estado_civil_codigo = ? ");
		    ps.setString(1, pornombre);
		    ps.setString(2, porapellido);
		    ps.setString(3, codigo);
		    
		    rs=ps.executeQuery();
		    while(rs.next()) {
		    	Persona p=new Persona();
		    	String cedula=rs.getString("cedula");
		    	String nombre=rs.getString("nombre");
		    	String apellido=rs.getString("apellido");
		    	double estatura=rs.getDouble("estatura");
		    	java.sql.Date fecha_nacimiento=rs.getDate("fecha_nacimiento");
		    	java.sql.Time hora_nacimiento=rs.getTime("hora_nacimiento");
		    	//BigDecimal cantidad_ahorrada=rs.getBigDecimal("cantidad_ahorrada");
		    	String monto=rs.getString("cantidad_ahorrada");
		    	String cantidad_ahorrada=monto.replace("$", "").replace(",", "").replace(",", ".");	
		    	int numero_hijos=rs.getInt("numero_fijo");
		    	String ec=rs.getString("estado_civil_codigo");
		    	EstadoCivil estado_civil=Convertidor.mapear(ec);
		    	
		    	p.setCedula(cedula);
		    	p.setNombre(nombre);
		    	p.setApellido(apellido);
		    	p.setEstatura(estatura);
		    	p.setFechaNacimiento(new java.util.Date(fecha_nacimiento.getTime()));
		    	p.setHoraNacimiento(new java.util.Date(hora_nacimiento.getTime()));
		    	p.setCantidadAhorrada(new BigDecimal(cantidad_ahorrada));
		    	p.setNumeroHijo(numero_hijos);
		    	p.setEstadoCivil(estado_civil);
		    	persona.add(p);
		    	}
		} catch (Exception e) {
			LOGGER.error("Error al consunltar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		} finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la infraestructura");
			}
		}
		
		return persona;
		}

 
}
