package es.Daniel_Gil_Ejercicios_POO_IV_arrays;

public class Alumno{
	public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia) {
		this.nombreColegio=nombreColegio;
		this.nombreAlumno=nombreAlumno;
		this.notaMedia=notaMedia;
		nAlumno = numeroAlumno;
		numeroAlumno++;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia=notaMedia;
	}
	
	public String toString() {
		return "nombre alumno: " + nombreAlumno + "\nColegio: " + this.getNombreColegioAlumno()	+ "\nNº Alumno: " + nAlumno + "\nNota media: " + notaMedia;
		}
	public String getNombreColegioAlumno() {
		return this.nombreColegio.getNombreColegio();
	}
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	
	private Colegio nombreColegio;
	private String nombreAlumno;
	private double notaMedia;
	private static int numeroAlumno=1;
	private int nAlumno;
	

}
