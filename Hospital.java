package codigo_Hospital;

import java.time.LocalDate;

public class Hospital {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        // ===================== PACIENTE 1 =====================
        Paciente paciente1 = new Paciente(
                1001,
                "Carlos Andrés Gómez",
                45,
                "Masculino",
                "Cáncer de pulmón",
                "Etapa II",
                "En tratamiento"
        );
        Tratamiento t1 = new Tratamiento(
                1001,
                "Quimioterapia",
                120,
                "Náuseas, caída del cabello"
        );
        Examenes e1 = new Examenes(
                1001,
                LocalDate.of(2024, 5, 20),
                "Radiografía",
                "Reducción del tumor"
        );
        sistema.registrarPaciente(paciente1);
        sistema.agregarTratamiento(t1);
        sistema.agregarExamen(e1);

        // ===================== PACIENTE 2 =====================
        Paciente paciente2 = new Paciente(
                1002,
                "María López",
                38,
                "Femenino",
                "Cáncer de mama",
                "Etapa III",
                "En tratamiento"
        );
        Tratamiento t2 = new Tratamiento(
                1002,
                "Quimioterapia intensiva",
                150,
                "Fatiga, náuseas"
        );
        Examenes e2 = new Examenes(
                1002,
                LocalDate.of(2024, 6, 10),
                "Mamografía",
                "Disminución parcial del tumor"
        );
        sistema.registrarPaciente(paciente2);
        sistema.agregarTratamiento(t2);
        sistema.agregarExamen(e2);

        // ===================== PACIENTE 3 =====================
        Paciente paciente3 = new Paciente(
                1003,
                "Luis Fernández",
                60,
                "Masculino",
                "Leucemia",
                "Etapa IV",
                "Crítico"
        );
        Tratamiento t3 = new Tratamiento(
                1003,
                "Inmunoterapia",
                180,
                "Fiebre, dolores articulares, diarrea"
        );
        Examenes e3 = new Examenes(
                1003,
                LocalDate.of(2024, 7, 5),
                "Biopsia de médula ósea",
                "Alta presencia de blastos"
        );
        sistema.registrarPaciente(paciente3);
        sistema.agregarTratamiento(t3);
        sistema.agregarExamen(e3);

        // ===================== PACIENTE 4 =====================
        Paciente paciente4 = new Paciente(
                1004,
                "Laura Sofía Martínez",
                29,
                "Femenino",
                "Cáncer de tiroides",
                "Etapa I",
                "En tratamiento"
        );
        Tratamiento t4 = new Tratamiento(
                1004,
                "Cirugía y terapia hormonal",
                90,
                "Dolor leve"
        );
        Examenes e4 = new Examenes(
                1004,
                LocalDate.of(2024, 6, 15),
                "Ecografía tiroidea",
                "Nódulo reducido"
        );
        sistema.registrarPaciente(paciente4);
        sistema.agregarTratamiento(t4);
        sistema.agregarExamen(e4);

        // ===================== PACIENTE 5 =====================
        Paciente paciente5 = new Paciente(
                1005,
                "Andrés Felipe Torres",
                55,
                "Masculino",
                "Cáncer de próstata",
                "Etapa II",
                "En tratamiento"
        );
        Tratamiento t5 = new Tratamiento(
                1005,
                "Radioterapia",
                100,
                "Fatiga"
        );
        Examenes e5 = new Examenes(
                1005,
                LocalDate.of(2024, 8, 10),
                "PSA",
                "Mejorando"
        );
        sistema.registrarPaciente(paciente5);
        sistema.agregarTratamiento(t5);
        sistema.agregarExamen(e5);

        // ===================== PACIENTE 6 =====================
        Paciente paciente6 = new Paciente(
                1006,
                "Camila Rodríguez",
                41,
                "Femenino",
                "Cáncer de piel",
                "Etapa I",
                "En remisión"
        );
        Tratamiento t6 = new Tratamiento(
                1006,
                "Cirugía láser",
                30,
                "Enrojecimiento leve"
        );
        Examenes e6 = new Examenes(
                1006,
                LocalDate.of(2024, 9, 2),
                "Dermatoscopia",
                "Sin células malignas"
        );
        sistema.registrarPaciente(paciente6);
        sistema.agregarTratamiento(t6);
        sistema.agregarExamen(e6);

        // ===================== RESULTADOS =====================
        sistema.contarPacientes();
        sistema.calcularPorcentajePorEstado("En tratamiento");

        System.out.println("\n=== CONSULTA ===\n");
        // Mostrar todos los pacientes (uso de array de ids)
        int[] ids = {1001, 1002, 1003, 1004, 1005, 1006};
        for (int id : ids) {
            sistema.mostrarPaciente(id);
        }
    }
}