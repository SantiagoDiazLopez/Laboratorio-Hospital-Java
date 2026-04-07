package Ejercicio1;

import java.util.*;

//Clase principal donde se ejecuta todo el programa
public class Hospital {

 public static void main(String[] args) {

     // Scanner para leer datos del usuario
     Scanner input = new Scanner(System.in);

     // Lista donde se guardan todos los pacientes
     ArrayList<Paciente> pacientes = new ArrayList<>();

     int opcion; // variable del menú

     // Ciclo principal del programa
     do {
         // Mostrar menú
         System.out.println("Bienvenido, ¿Que desea hacer hoy?");
         System.out.println("1. Registrar un paciente");
         System.out.println("2. Agregar examen");
         System.out.println("3. Agregar tratamiento");
         System.out.println("4. Ver estadisticas");
         System.out.println("5. Ver pacientes");
         System.out.println("6. Ver examenes de un paciente");
         System.out.println("7. Ver tratamientos de un paciente");
         System.out.println("0. Salir");

         // Leer opción
         opcion = input.nextInt();
         input.nextLine(); // limpiar buffer

         switch (opcion) {

             // Registrar al paciente
             case 1:
                 System.out.println("Identificacion:");
                 int identificacion = input.nextInt();
                 input.nextLine();

                 System.out.println("Nombre:");
                 String nombre = input.nextLine();

                 System.out.println("Edad:");
                 int edad = input.nextInt();
                 input.nextLine();

                 System.out.println("Genero:");
                 String genero = input.nextLine();

                 System.out.println("Tipo de cancer:");
                 String tipoCancer = input.nextLine();

                 System.out.println("Etapa:");
                 String etapa = input.nextLine();

                 System.out.println("Estado:");
                 String estado = input.nextLine();

                 // Crear paciente y agregarlo a la lista
                 pacientes.add(new Paciente(identificacion, nombre, edad, genero, tipoCancer, etapa, estado));
                 System.out.println("Paciente registrado correctamente.");
                 break;

             // Agregar un examen
             case 2:
                 if (pacientes.isEmpty()) {
                     System.out.println("No hay pacientes registrados.");
                     break;
                 }
                 System.out.println("Lista de pacientes:");
                 // Mostrar pacientes
                 for (int i = 0; i < pacientes.size(); i++) {
                     System.out.println(i + ". " + pacientes.get(i));
                 }

                 System.out.println("Ingrese el indice del paciente:");
                 int iE = input.nextInt();
                 input.nextLine();

                 if (iE >= 0 && iE < pacientes.size()) {

                     System.out.println("ID examen:");
                     int idE = input.nextInt();
                     input.nextLine();

                     System.out.println("Fecha:");
                     String fecha = input.nextLine();

                     System.out.println("Tipo:");
                     String tipoE = input.nextLine();

                     System.out.println("Resultado:");
                     String res = input.nextLine();

                     pacientes.get(iE).agregarExamen(new Examen(idE, fecha, tipoE, res));
                     System.out.println("Examen agregado correctamente.");
                 } else {
                     System.out.println("Indice invalido.");
                 }
                 break;

             // Agregar tratamiento
             case 3:
                 if (pacientes.isEmpty()) {
                     System.out.println("No hay pacientes registrados.");
                     break;
                 }
                 
                 // Mostrar pacientes
                 System.out.println("Lista de pacientes:");
                 for (int i = 0; i < pacientes.size(); i++) {
                     System.out.println(i + ". " + pacientes.get(i));
                 }

                 System.out.println("Indice del paciente:");
                 int iT = input.nextInt();
                 input.nextLine();

                 if (iT >= 0 && iT < pacientes.size()) {

                     System.out.println("ID tratamiento:");
                     int idT = input.nextInt();
                     input.nextLine();

                     System.out.println("Nombre:");
                     String nombreT = input.nextLine();

                     System.out.println("Duracion en dias:");
                     int duracion = input.nextInt();
                     input.nextLine();

                     System.out.println("Efectos secundarios:");
                     String efectos = input.nextLine();

                     pacientes.get(iT).agregarTratamiento(
                             new Tratamiento(idT, nombreT, duracion, efectos)
                     );

                     System.out.println("Tratamiento agregado correctamente.");
                 } else {
                     System.out.println("Indice invalido.");
                 }
                 break;

             // Estadisticas
             case 4:
                 int leucemia = 0, linfoma = 0, sarcoma = 0;
                 int remision = 0, tratamiento = 0, fallecido = 0;

                 for (Paciente p : pacientes) {

                     // Contar tipos de cáncer
                     switch (p.getTipoCancer().toLowerCase().trim()) {
                         case "leucemia": leucemia++; break;
                         case "linfoma": linfoma++; break;
                         case "sarcoma": sarcoma++; break;
                     }

                     // Contar estados
                     switch (p.getEstado().toLowerCase().trim()) {
                         case "remision": remision++; break;
                         case "en tratamiento": tratamiento++; break;
                         case "fallecido": fallecido++; break;
                     }
                 }

                 int total = pacientes.size();

                 System.out.println("Estadisticas");
                 System.out.println("Leucemia: " + leucemia);
                 System.out.println("Linfoma: " + linfoma);
                 System.out.println("Sarcoma: " + sarcoma);

                 if (total > 0) {
                     System.out.println("Remision: " + (remision * 100.0 / total) + "%");
                     System.out.println("En tratamiento: " + (tratamiento * 100.0 / total) + "%");
                     System.out.println("Fallecido: " + (fallecido * 100.0 / total) + "%");
                 } else {
                     System.out.println("No hay pacientes registrados.");
                 }
                 break;

             // Ver pacientes
             case 5:
                 if (pacientes.isEmpty()) {
                     System.out.println("No hay pacientes registrados.");
                 } else {
                     for (int i = 0; i < pacientes.size(); i++) {
                         System.out.println(i + ". " + pacientes.get(i));
                     }
                 }
                 break;
             case 6:
            	    if (pacientes.isEmpty()) {
            	        System.out.println("No hay pacientes registrados.");
            	        break;
            	    }

            	    // Mostrar lista
            	    for (int i = 0; i < pacientes.size(); i++) {
            	        System.out.println(i + ". " + pacientes.get(i));
            	    }

            	    System.out.println("Seleccione el indice del paciente:");
            	    int idxE = input.nextInt();
            	    input.nextLine();

            	    if (idxE >= 0 && idxE < pacientes.size()) {
            	        System.out.println("\nExamenes del paciente:");
            	        pacientes.get(idxE).mostrarExamenes();
            	    } else {
            	        System.out.println("Indice invalido.");
            	    }
            	    break;
             case 7:
            	    if (pacientes.isEmpty()) {
            	        System.out.println("No hay pacientes registrados.");
            	        break;
            	    }

            	    // Mostrar lista
            	    for (int i = 0; i < pacientes.size(); i++) {
            	        System.out.println(i + ". " + pacientes.get(i));
            	    }

            	    System.out.println("Seleccione el indice del paciente:");
            	    int idxT = input.nextInt();
            	    input.nextLine();

            	    if (idxT >= 0 && idxT < pacientes.size()) {
            	        System.out.println("\nTratamientos del paciente:");
            	        pacientes.get(idxT).mostrarTratamientos();
            	    } else {
            	        System.out.println("Indice invalido.");
            	    }
            	    break;
                 

             case 0:
                 System.out.println("Saliendo del sistema...");
                 break;
         }

     } while (opcion != 0); // repetir hasta salir

     input.close(); // cerrar scanner
 }
}
