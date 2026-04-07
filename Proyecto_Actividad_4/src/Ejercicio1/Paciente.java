package Ejercicio1;

import java.util.ArrayList;

//Clase que representa a un paciente del hospital
public class Paciente {

 // Los atributos del paciente
 private int identificacion;
 private String nombre;
 private int edad;
 private String genero;
 private String tipoCancer;
 private String etapa;
 private String estado;

 /* Crea listas para guardar exámenes y tratamientos del paciente, el chiste de usar ArrayList aca en vez de un simple array es permitirnos hacer listas mas largas y flexibles */
 private ArrayList<Examen> examenes = new ArrayList<>();
 private ArrayList<Tratamiento> tratamientos = new ArrayList<>();

 // Constructor: inicializa los datos del paciente
 public Paciente(int identificacion, String nombre, int edad, String genero, String tipoCancer, String etapa, String estado) {
	 
     this.identificacion = identificacion;
     this.nombre = nombre;
     this.edad = edad;
     this.genero = genero;
     this.tipoCancer = tipoCancer;
     this.etapa = etapa;
     this.estado = estado;
 }

 // Getter para obtener el tipo de cáncer
 public String getTipoCancer() {
     return tipoCancer;
 }

 // Getter para obtener el estado del paciente
 public String getEstado() {
     return estado;
 }

 // Método para agregar un examen a la lista
 public void agregarExamen(Examen e) {
     examenes.add(e);
 }

 // Método para agregar un tratamiento a la lista
 public void agregarTratamiento(Tratamiento t) {
     tratamientos.add(t);
 }

 // Método para mostrar la información del paciente en consola
 @Override
 public String toString() {
     return "ID: " + identificacion +
            ", Nombre: " + nombre +
            ", Edad: " + edad +
            ", Genero: " + genero +
            ", Cancer: " + tipoCancer +
            ", Etapa: " + etapa +
            ", Estado: " + estado;
 }
	//Mostrar todos los examenes del paciente
	public void mostrarExamenes() {
	  if (examenes.isEmpty()) {
	      System.out.println("No hay examenes registrados.");
	  } else {
	      for (Examen e : examenes) {
	          System.out.println(e);
	      }
	  }
	}
	
	//Mostrar todos los tratamientos del paciente
	public void mostrarTratamientos() {
	  if (tratamientos.isEmpty()) {
	      System.out.println("No hay tratamientos registrados.");
	  } else {
	      for (Tratamiento t : tratamientos) {
	          System.out.println(t);
	      	}
	  	}
	}
}

