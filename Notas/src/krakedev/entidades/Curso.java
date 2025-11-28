package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		this.estudiantes = new ArrayList<Estudiante>();
	}
	public Estudiante buscarEstudiante(String cedula) {
		Estudiante estudianteEncontrado=null;
		Estudiante estud;
		for(int i=0;i<estudiantes.size();i++) {
			estud=estudiantes.get(i);
			if(cedula.equals(estud.getCedula())) {
				estudianteEncontrado=estud;
			}
		}
		return estudianteEncontrado;
	}
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		String stud=estudiante.getCedula();
		Estudiante estud;
		for(int i=0;i<estudiantes.size();i++) {
			estud=estudiantes.get(i);
			if(estud.getCedula().equalsIgnoreCase(stud)) {
				System.out.println("El estudiante con cedula "+stud+" ya esta matriculado.");
			}
		}
		return null;
	}
	public void matricularEstudiantes(Estudiante estudiante) {
		Estudiante buscar=buscarEstudiantePorCedula(estudiante);
		if(buscar==null) {
			estudiantes.add(estudiante);
		}else {
			System.out.println("El estudiante ya existe");
		}
	}
	public double calcularPromedioCurso() {
		double promedioCurso=0;
		for(int i=0;i<estudiantes.size();i++) {
			Estudiante lista=estudiantes.get(i);
			double promedioIndividual=lista.calcularPromedioNotasEstudiante();
			promedioCurso+=promedioIndividual;
		}
		return promedioCurso/this.estudiantes.size();
	}
	public void mostrar() {
		Estudiante estud = null;
		for(int i=0;i<estudiantes.size();i++) {
			estud=estudiantes.get(i);	
			estud.mostrar();
			}
		}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	

}
