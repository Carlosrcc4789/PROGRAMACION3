package Lista;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;
    private Integer numeroCI;

    public Persona(String nombre, String primerApellido, String segundoApellido, LocalDate fechaNacimiento, Integer numeroCI) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCI = numeroCI;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return nombre + " " + primerApellido + " " + segundoApellido + " - Edad: " + getEdad();
    }
}

class ClaseEstudiantes {
    public static void main(String[] args) {
        List<Persona> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos estudiantes desea ingresar?");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Primer Apellido: ");
            String primerApellido = scanner.nextLine();

            System.out.print("Segundo Apellido: ");
            String segundoApellido = scanner.nextLine();

            System.out.print("Año de Nacimiento: ");
            int anio = scanner.nextInt();

            System.out.print("Mes de Nacimiento (1-12): ");
            int mes = scanner.nextInt();

            System.out.print("Día de Nacimiento: ");
            int dia = scanner.nextInt();

            System.out.print("Número de CI: ");
            int numeroCI = scanner.nextInt();
            scanner.nextLine();

            estudiantes.add(new Persona(nombre, primerApellido, segundoApellido, LocalDate.of(anio, mes, dia), numeroCI));
        }


        Collections.sort(estudiantes, (p1, p2) -> p1.getEdad() - p2.getEdad());

        System.out.println("Estudiantes ordenados por edad:");
        for (Persona estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        scanner.close();
    }
}
