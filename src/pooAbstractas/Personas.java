package bronsito.pooAbstractas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public abstract class Personas {

    private String nombre;

    public Personas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion();

}

class Empleados extends Personas implements Comparable, ParaTrabajadores{

    private double sueldo;
    private LocalDate fechaAlta;

    public Empleados(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.fechaAlta = LocalDate.now();
    }

    @Override
    public String getDescripcion() {
        return "El empleado " + this.getNombre() + " tiene un sueldo de " + sueldo +" €" + " y entro a trabajar en " +
                fechaAlta.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    @Override
    public int compareTo(Object o) {

        Empleados otroEmpleado = (Empleados) o;
        if (this.sueldo < otroEmpleado.sueldo) return -1;
        else if (this.sueldo == otroEmpleado.sueldo) return 0;
        else return 1;
    }

    @Override
    public double setBonus(double gratificacion) {
        return ParaTrabajadores.bonus + gratificacion;
    }
}

class Jefes extends Empleados implements ParaJefes {

    private double incentivo;
    private String cargo;

    public Jefes(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return "\n Tiene el cargo de "+ cargo;
    }

    @Override
    public double setBonus(double gratificacion) {
        double prima = 2000;
        return prima + gratificacion + ParaTrabajadores.bonus;
    }
}

class Alumnos extends Personas {

    private String aOptativa;
    private String aula;


    public Alumnos(String nombre, String aOptativa, String aula) {
        super(nombre);
        this.aOptativa = aOptativa;
        this.aula = aula;
    }


    @Override
    public String getDescripcion() {
        return "El alumno " + this.getNombre() + " tiene las asignaturas optativas: " + aOptativa + " y esta en el aula " +aula ;
    }
}
