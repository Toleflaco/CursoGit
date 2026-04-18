package bronsito.pooAbstractas;

import java.time.LocalDate;

public abstract class Empleado {
    private String nombre;
    private String dni;
    protected int fechaAlta;
    //protected double salarioFijo;

    public Empleado() {
        nombre= "NULL";
        dni = "NULL";
        fechaAlta = 2010;
    }
    public Empleado (String nombre, String dni, int fechaAlta) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlta = fechaAlta;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(int fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getSalario();
    public void imprimir() {
        System.out.println("El empleado " + nombre + " tiene el DNI " + dni + ", con alta el año " + fechaAlta);
    }
}
