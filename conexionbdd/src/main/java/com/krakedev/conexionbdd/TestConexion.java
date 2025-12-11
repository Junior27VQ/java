package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Junior0207VQ");
			System.out.println("Coneccion exitoso");
			ps=connection.prepareStatement("insert into personas(cedula,nombre,apellido,estatura,cantidad_ahorrada,numero_fijo,estado_civil_codigo,fecha_nacimiento,hora_nacimiento)"
					+" values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "0982300477");
			ps.setString(2, "Ramon");
			ps.setString(3, "Ruiz");
			ps.setDouble(4, 1.68);
			ps.setBigDecimal(5, new BigDecimal(1236.25));
			ps.setInt(6, 1);
			ps.setString(7, "S");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2001/05/25 13:29:54";
			try {
				Date fecha=sdf.parse(fechaStr);
				System.out.println(fecha);
				
				long fechaMilis=fecha.getTime();
				System.out.println(fechaMilis);
				
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				Time tiempoSQL=new Time(fechaMilis);
				System.out.println(tiempoSQL);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, tiempoSQL);
				ps.executeUpdate();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println("Insert personas");
			ps2=connection.prepareStatement("insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
					+" values(?,?,?,?,?,?)");
			ps2.setInt(1, 6);
			ps2.setString(2, "32147");
			ps2.setBigDecimal(3, new BigDecimal(1478.36));
			ps2.setString(4, "C");
			
			SimpleDateFormat sdf2=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr2="2023/08/25 18:34:26";
			try {
				Date fecha2=sdf2.parse(fechaStr2);
				System.out.println(fecha2);
				
				long fechaMilis2=fecha2.getTime();
				System.out.println(fechaMilis2);
				
				java.sql.Date fechaSQL2=new java.sql.Date(fechaMilis2);
				System.out.println(fechaSQL2);
				
				Time tiempoSQL2=new Time(fechaMilis2);
				System.out.println(tiempoSQL2);
				
				ps2.setDate(5, fechaSQL2);
				ps2.setTime(6, tiempoSQL2);
				ps2.executeUpdate();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println("Insert transacciones");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
