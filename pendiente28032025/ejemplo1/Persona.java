package ejemplo1;

import java.util.Date;
import java.util.Calendar;

public class Persona {


    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private Integer numeroCI;


    public Persona(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCI = numeroCI;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumeroCI() {
        return numeroCI;
    }

    public void setNumeroCI(Integer numeroCI) {
        this.numeroCI = numeroCI;
    }


    public String getNombreCompleto() {
        return nombre + " " + primerApellido + " " + segundoApellido;
    }


    public int calcularEdad() {
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return edad;
    }


    public String mostrarDetalles() {
        return "Nombre Completo: " + getNombreCompleto() +
                "\nEdad: " + calcularEdad() +
                "\nNúmero de CI: " + numeroCI;
    }


    public static void main(String[] args) {
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.set(1995, Calendar.MARCH, 15); // Fecha de nacimiento: 15 de marzo de 1995
        Persona persona1 = new Persona("Ana", "Pérez", "Gómez", fechaNac.getTime(), 12345678);


        System.out.println(persona1.mostrarDetalles());


        persona1.setNombre("María");
        System.out.println("Nuevo Nombre: " + persona1.getNombre());
    }
}
