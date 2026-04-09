package Ejercicio1;

public class Sistema {

    public static void main(String[] args) {
        // 1. Instanciación del hospital
        Hospital hospital = new Hospital();

        // 2. Creación y registro de pacientes de ejemplo
        hospital.agregarPaciente(new Paciente(1, "Julian", 45, "Masculino", "Leucemia", "II", "En tratamiento"));
        hospital.agregarPaciente(new Paciente(2, "Antonieta", 50, "Femenino", "Linfoma", "III", "Remision"));
        hospital.agregarPaciente(new Paciente(3, "Karl", 60, "Masculino", "Sarcoma", "IV", "Fallecido"));
        hospital.agregarPaciente(new Paciente(4, "Dominic", 39, "Femenino", "Leucemia", "I", "En tratamiento"));
        hospital.agregarPaciente(new Paciente(5, "Louie", 55, "Masculino", "Linfoma", "II", "Remision"));
        hospital.agregarPaciente(new Paciente(6, "Sara", 47, "Femenino", "Sarcoma", "III", "En tratamiento"));

        // 3. Asignación manual de exámenes y tratamientos a pacientes específicos
        // Se accede a cada paciente por su posición en la lista del hospital
        hospital.getPacientes().get(0).agregarExamen(new Examen(1, "01/01/2026", "Biopsia", "Positivo"));
        hospital.getPacientes().get(0).agregarTratamiento(new Tratamiento(1, "Quimioterapia", 30, "Nauseas"));
        
        // (Nota: Se repite este proceso para p2, p3, p4, p5 y p6 según el código original)
        // ... (resto de asignaciones de exámenes y tratamientos) ...

        // 4. Variables contadoras para las estadísticas
        int leucemia = 0, linfoma = 0, sarcoma = 0;
        int remision = 0, tratamiento = 0, fallecido = 0;

        // 5. Procesamiento de datos mediante un bucle que recorre todos los pacientes
        for (Paciente p : hospital.getPacientes()) {

            // Clasificación por tipo de cáncer usando switch
            switch (p.getTipoCancer().toLowerCase()) {
                case "leucemia": leucemia++; break;
                case "linfoma": linfoma++; break;
                case "sarcoma": sarcoma++; break;
            }

            // Clasificación por estado actual
            switch (p.getEstado().toLowerCase()) {
                case "remision": remision++; break;
                case "en tratamiento": tratamiento++; break;
                case "fallecido": fallecido++; break;
            }
        }
        
        // 6. Generación de salida en consola
        System.out.println("Lista de pacientes:");
        for (Paciente p : hospital.getPacientes()) {
            System.out.println(p);
        }
        
        System.out.println("\nExamenes:");
        for (Paciente p : hospital.getPacientes()) {
            for (Examen e : p.getExamenes()) {
                System.out.println(e);
            }
        }
        
        System.out.println("Tratamientos:");
        for (Paciente p : hospital.getPacientes()) {
            for (Tratamiento t : p.getTratamientos()) {
                System.out.println(t);
            }
        }

        // 7. Cálculo y muestra de resultados finales y porcentajes
        int total = hospital.getPacientes().size();

        System.out.println("Pacientes por tipo de cancer:");
        System.out.println("Leucemia: " + leucemia);
        System.out.println("Linfoma: " + linfoma);
        System.out.println("Sarcoma: " + sarcoma);

        System.out.println("\nPorcentaje por estado:");
        System.out.println("Remision: " + (remision * 100.0 / total) + "%");
        System.out.println("En tratamiento: " + (tratamiento * 100.0 / total) + "%");
        System.out.println("Fallecido: " + (fallecido * 100.0 / total) + "%");
    }
}