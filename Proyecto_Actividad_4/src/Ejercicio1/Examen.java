package Ejercicio1;

public class Examen {
    // Atributos privados para proteger la información del examen
    private int id;
    private String fecha;
    private String tipo;
    private String resultado;

    // Constructor: Inicializa un nuevo objeto Examen con sus datos básicos
    public Examen(int id, String fecha, String tipo, String resultado) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.resultado = resultado;
    }

    // Método toString: Devuelve una cadena de texto formateada con los datos del examen
    public String toString() {
        return "ID: " + id +
               ", Fecha: " + fecha +
               ", Tipo: " + tipo +
               ", Resultado: " + resultado;
    }
}
