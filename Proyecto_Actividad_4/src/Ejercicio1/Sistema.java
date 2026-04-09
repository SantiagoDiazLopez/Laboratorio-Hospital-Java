package Ejercicio1;

public class Sistema {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        // Pacientes
        Paciente p1 = new Paciente(1, "Julian", 45, "Masculino", "Leucemia", "II", "En tratamiento");
        Paciente p2 = new Paciente(2, "Antonieta", 50, "Femenino", "Linfoma", "III", "Remision");
        Paciente p3 = new Paciente(3, "Karl", 60, "Masculino", "Sarcoma", "IV", "Fallecido");
        Paciente p4 = new Paciente(4, "Dominic", 39, "Femenino", "Leucemia", "I", "En tratamiento");
        Paciente p5 = new Paciente(5, "Louie", 55, "Masculino", "Linfoma", "II", "Remision");
        Paciente p6 = new Paciente(6, "Sara", 47, "Femenino", "Sarcoma", "III", "En tratamiento");

        hospital.agregarPaciente(p1);
        hospital.agregarPaciente(p2);
        hospital.agregarPaciente(p3);
        hospital.agregarPaciente(p4);
        hospital.agregarPaciente(p5);
        hospital.agregarPaciente(p6);

        // Examenes
        p1.agregarExamen(new Examen(1, "01/01/2026", "Biopsia", "Positivo"));
        p2.agregarExamen(new Examen(2, "05/01/2026", "Resonancia", "Estable"));

        p3.agregarExamen(new Examen(3, "02/01/2026", "Tomografia", "Mejora"));
        p4.agregarExamen(new Examen(4, "06/01/2026", "Biopsia", "Negativo"));

        p5.agregarExamen(new Examen(5, "03/01/2026", "Resonancia", "Grave"));
        p6.agregarExamen(new Examen(6, "07/01/2026", "Tomografia", "Critico"));

        // Tratamiento
        p1.agregarTratamiento(new Tratamiento(1, "Quimioterapia", 30, "Nauseas"));
        p2.agregarTratamiento(new Tratamiento(2, "Radioterapia", 20, "Fatiga"));

        p3.agregarTratamiento(new Tratamiento(3, "Cirugia", 10, "Dolor"));
        p4.agregarTratamiento(new Tratamiento(4, "Inmunoterapia", 25, "Fiebre"));

        p5.agregarTratamiento(new Tratamiento(5, "Quimioterapia", 40, "Debilidad"));
        p6.agregarTratamiento(new Tratamiento(6, "Radioterapia", 15, "Irritacion"));

        // Estadisticas
        int leucemia = 0, linfoma = 0, sarcoma = 0;
        int remision = 0, tratamiento = 0, fallecido = 0;

        for (Paciente p : hospital.getPacientes()) {

            switch (p.getTipoCancer().toLowerCase()) {
                case "leucemia": leucemia++; break;
                case "linfoma": linfoma++; break;
                case "sarcoma": sarcoma++; break;
            }

            switch (p.getEstado().toLowerCase()) {
                case "remision": remision++; break;
                case "en tratamiento": tratamiento++; break;
                case "fallecido": fallecido++; break;
            }
        }
        
        System.out.println("Lista de pacientes:");

        for (Paciente p : hospital.getPacientes()) {
            System.out.println(p);
        }
        
        System.out.println("Examenes:");

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
