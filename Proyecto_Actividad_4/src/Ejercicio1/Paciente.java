package Ejercicio1;

import java.util.ArrayList;

public class Paciente {
	 // Atributos de identificación y condición médica
    private int identificacion;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private String etapa;
    private String estado;
    // Listas dinámicas para manejar múltiples exámenes y tratamientos por cada paciente
    private ArrayList<Examen> examenes = new ArrayList<>();
    private ArrayList<Tratamiento> tratamientos = new ArrayList<>();
 // Constructor: Recibe y asigna toda la información inicial del paciente
    public Paciente(int identificacion, String nombre, int edad,
                    String genero, String tipoCancer, String etapa, String estado) {

        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.estado = estado;
    }
    // Métodos Getter: Necesarios para extraer datos específicos en el cálculo de estadísticas
    public String getTipoCancer() {
        return tipoCancer;
    }
    
    public String getEstado() {
        return estado;
    }
    // Gestión de exámenes: Permite agregar uno nuevo o recuperar la lista completa
    public void agregarExamen(Examen e) {
        examenes.add(e);
    }
    
    public ArrayList<Examen> getExamenes() {
        return examenes;
    }
    public void agregarTratamiento(Tratamiento t) {
        tratamientos.add(t);
    // Gestión de tratamientos: Permite agregar uno nuevo o recuperar la lista completa
    }
    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }
    // Método toString: Resume el perfil del paciente en una sola línea de texto
    public String toString() {
        return "ID: " + identificacion +
               ", Nombre: " + nombre +
               ", Edad: " + edad +
               ", Genero: " + genero +              
               ", Cancer: " + tipoCancer +
               ", Etapa: " + etapa +
               ", Estado: " + estado;
    }
    
}
