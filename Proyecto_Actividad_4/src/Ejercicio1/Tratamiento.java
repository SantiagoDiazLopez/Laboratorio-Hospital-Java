package Ejercicio1;

public class Tratamiento {
    // Atributos que describen el tratamiento médico
    private int id;
    private String nombre;
    private int duracionDias;
    private String efectosSecundarios;

    // Constructor: Asigna los valores iniciales al crear el tratamiento
    public Tratamiento(int id, String nombre, int duracionDias, String efectosSecundarios) {
        this.id = id;
        this.nombre = nombre;
        this.duracionDias = duracionDias;
        this.efectosSecundarios = efectosSecundarios;
    }

    // Método toString: Permite visualizar el tratamiento de forma legible
    public String toString() {
        return "ID: " + id +
               ", Nombre: " + nombre +
               ", Duracion: " + duracionDias +
               ", Efectos: " + efectosSecundarios;
    }
}