package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		//Date - java.util.Date
		//Date - java.sql.Date
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr="2020/03/22 10:25:45";
		try {
			Date fecha=sdf.parse(fechaStr);
			System.out.println(fecha);
			//Transformar al milisegundoa
			long fechaMilis=fecha.getTime();
			System.out.println(fechaMilis);
			//convertir a java.sql desde un java,util.Date
			//para saver cual import esta usando se especifica
			java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
			System.out.println(fechaSQL);
			//convercion de tiemo
			Time tiempoSQL=new Time(fechaMilis);
			System.out.println(tiempoSQL);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
