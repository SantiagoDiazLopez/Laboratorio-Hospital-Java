package Ejercicio1;

import java.util.ArrayList;

public class Hospital {

	  // Lista global que almacena todos los objetos de tipo Paciente registrados
    private ArrayList<Paciente> pacientes = new ArrayList<>();

    // Método para registrar un nuevo paciente en el hospital
    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    // Método para obtener la lista de todos los pacientes (usado para reportes)
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
}
