package Ejercicio1;

//Clase que representa un examen médico
public class Examen {

 // Atributos del examen
 private int id;
 private String fecha;
 private String tipo;
 private String resultado;

 // Constructor: crea un examen con todos sus datos
 public Examen(int id, String fecha, String tipo, String resultado) {
     this.id = id;
     this.fecha = fecha;
     this.tipo = tipo;
     this.resultado = resultado;
 }

 // Método para mostrar la información del examen
 @Override
 public String toString() {
     return "Examen ID: " + id +
            ", Fecha: " + fecha +
            ", Tipo: " + tipo +
            ", Resultado: " + resultado;
 }
}
