package codigo_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private ArrayList<Paciente> pacientes;
    private ArrayList<Examenes> examenes;
    private ArrayList<Tratamiento> tratamientos;

    public Sistema() {
        pacientes = new ArrayList<>();
        examenes = new ArrayList<>();
        tratamientos = new ArrayList<>();
    }

    // Registrar paciente: uso de variable local para el mensaje
    public void registrarPaciente(Paciente paciente) {
        for (Paciente p : pacientes) {
            if (p.getIdentificacion() == paciente.getIdentificacion()) {
                System.out.println("Error: Ya existe un paciente con ID " + paciente.getIdentificacion());
                return;
            }
        }
        pacientes.add(paciente);
        String mensaje = "Paciente " + paciente.getNombre() + " registrado correctamente.";
        System.out.println(mensaje);
    }

    public void agregarExamen(Examenes examen) {
        Paciente p = buscarPaciente(examen.getIdentifiacion());
        if (p == null) {
            System.out.println("Error: No existe paciente con ID " + examen.getIdentifiacion());
            return;
        }
        examenes.add(examen);
        System.out.println("Examen '" + examen.getTipoExamen() + "' agregado al paciente " + p.getNombre() + ".");
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        Paciente p = buscarPaciente(tratamiento.getIdentificacion());
        if (p == null) {
            System.out.println("Error: No existe paciente con ID " + tratamiento.getIdentificacion());
            return;
        }
        tratamientos.add(tratamiento);
        System.out.println("Tratamiento '" + tratamiento.getnombreTratamiento()
                + "' agregado al paciente " + p.getNombre() + ".");
    }

    // Contar pacientes con variable local para tamaño
    public int contarPacientes() {
        int total = pacientes.size();
        System.out.println("Total de pacientes registrados: " + total);
        return total;
    }

    // Calcular porcentaje usando un bucle for-each y acumulador
    public double calcularPorcentajePorEstado(String estado) {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return 0.0;
        }

        int contador = 0;
        for (Paciente p : pacientes) {
            if (p.getEstadoActual().equalsIgnoreCase(estado)) {
                contador++;
            }
        }

        double porcentaje = (contador * 100.0) / pacientes.size();
        System.out.printf("Pacientes en estado '%s': %d (%.2f%%)%n",
                estado, contador, porcentaje);
        return porcentaje;
    }

    // Buscar paciente: implementación con bucle for normal
    public Paciente buscarPaciente(int id) {
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente p = pacientes.get(i);
            if (p.getIdentificacion() == id) {
                return p;
            }
        }
        return null;
    }

    // Mostrar paciente: lógica igual, solo se cambian algunos prints
    public void mostrarPaciente(int id) {
        Paciente p = buscarPaciente(id);
        if (p == null) {
            System.out.println("Paciente con ID " + id + " no encontrado.");
            return;
        }

        System.out.println("========================================");
        System.out.println("INFORMACIÓN DEL PACIENTE");
        System.out.println("========================================");
        System.out.println(p);

        System.out.println("\n--- Exámenes ---");
        boolean tieneExamen = false;
        for (Examenes e : examenes) {
            if (e.getIdentifiacion() == id) {
                System.out.println(e);
                tieneExamen = true;
            }
        }
        if (!tieneExamen) {
            System.out.println("Sin exámenes registrados.");
        }

        System.out.println("\n--- Tratamientos ---");
        boolean tieneTratamiento = false;
        for (Tratamiento t : tratamientos) {
            if (t.getIdentificacion() == id) {
                System.out.println(t);
                System.out.println("Eficacia: " + t.calcularEficacia(p.getEtapa()));
                tieneTratamiento = true;
            }
        }
        if (!tieneTratamiento) {
            System.out.println("Sin tratamientos registrados.");
        }
        System.out.println("========================================");
    }
}