package Ejercicio1;

//Clase que representa un tratamiento médico
public class Tratamiento {

 // Atributos del tratamiento
 private int id;
 private String nombre;
 private int duracionDias;
 private String efectosSecundarios;

 // Constructor: inicializa los datos del tratamiento
 public Tratamiento(int id, String nombre, int duracionDias, String efectosSecundarios) {
     this.id = id;
     this.nombre = nombre;
     this.duracionDias = duracionDias;
     this.efectosSecundarios = efectosSecundarios;
 }

 // Método para mostrar la información del tratamiento
 @Override
 public String toString() {
     return "Tratamiento ID: " + id +
            ", Nombre: " + nombre +
            ", Duracion: " + duracionDias + " dias" +
            ", Efectos secundarios: " + efectosSecundarios;
 }
}
