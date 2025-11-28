package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> nota;
	
	public Estudiante() {
		this.nota=new ArrayList<Nota>();
	}
	public Estudiante(String cedula, String nombre, String apellido) {
		this.nota=new ArrayList<Nota>();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void agregarNota(Nota nuevaNota) {
		String codigoNuevo=nuevaNota.getMateria().getCodigo();
		double calificacion=nuevaNota.getCalificacion();
		if(calificacion<=0 && calificacion>10) {
			System.out.println("Error: la calificacion ("+calificacion+") debeser entre 0 y 10.");
			return;
		}
	   for(Nota notaExistente : this.nota) {
			String codigoExiste=notaExistente.getMateria().getCodigo();
			if(codigoExiste.equalsIgnoreCase(codigoNuevo)) {
				System.out.println("Error: la materia "+codigoNuevo+" ya tiene una nota registrada.");
				return;
			}
		
		}
	   nota.add(nuevaNota);
	}
	public void modificarNota(String codigo, double nuevaNota) {
		    for(int i=0;i<nota.size();i++) {
			Nota arreglo=nota.get(i);
			String cod=arreglo.getMateria().getCodigo();
			if(cod.equalsIgnoreCase(codigo)) {
				arreglo.setCalificacion(nuevaNota);
			}
		}
	}
	public double calcularPromedioNotasEstudiante() {
		double promedio=0;
		for(int i=0;i<nota.size();i++) {
			Nota not=nota.get(i);
			double calificacion=not.getCalificacion();
			promedio+=calificacion;
			promedio=promedio/nota.size();
		}
		return promedio;
	}
	public void mostrar() {
		Nota estud;
		for(int i=0;i<nota.size();i++) {
			estud=nota.get(i);
			if(estud.getMateria()!=null) {
			System.out.println("*****************Estudiante*************");	
			System.out.println(cedula+" "+nombre+" "+apellido);
			System.out.println("Nota*************");
			System.out.println("Materia: "+" Codigo: "+estud.getMateria().getCodigo()+" Nombre: "+estud.getMateria().getNombre());
			System.out.println(" Calificacion: "+estud.getCalificacion());
			}else {
				System.out.println("*****************Estudiante*************");	
				System.out.println(cedula+" "+nombre+" "+apellido);
				System.out.println("Nota*************");
				System.out.println("Materia: "+"Materia no encontrada");
				System.out.println(" Calificacion: "+estud.getCalificacion());
			}
		}
		System.out.println();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNota() {
		return nota;
	}
	public void setNota(ArrayList<Nota> nota) {
		this.nota = nota;
	}
	

}
