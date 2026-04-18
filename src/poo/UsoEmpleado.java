package bronsito.poo;

import bronsito.openwebinars.cursoRecords.records.asociaciones.Empleado;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {


    public static void main(String[] args) {

//        Empleados empleado1 = new Empleados("Juan SinTierra",1500);
//        Jefe jefe1 = new Jefe("Ana", 2900);
//
//        System.out.println(jefe1.getDatosEmpleado());
//        System.out.println((jefe1.getSueldo()));
//        jefe1.setIncentivo(232);
//        System.out.println(jefe1.getSueldo());
//        System.out.println(empleado1.getDatosEmpleado());
//        Empleados [] losEmpleados = new Empleados[5];
//        Jefe Juan = new Jefe("juan", 5000);
//        Juan.setIncentivo(200);
//        losEmpleados[0] = new Empleados("Antonio,",2100);
//        losEmpleados[1] = new Empleados("Juan,",2220);
//        losEmpleados[2] = new Empleados("Pedro,",1500);
//        losEmpleados[3] = new Empleados("Luis,",1800);
//        losEmpleados[4] = Juan;
        ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();

        listaEmpleados.add(new Empleados("Antonio",2100));
        listaEmpleados.add(new Empleados("Juan",2100));
        listaEmpleados.add(new Empleados("CArnio",2100));
        listaEmpleados.add(new Empleados("Anatoli",2100));
        listaEmpleados.add(new Empleados("Iván",2100));

        //listaEmpleados.trimToSize();
        //System.out.println(listaEmpleados.size());


//        for(Empleados obj: listaEmpleados) {
//
//            System.out.println(obj.getDatosEmpleado() +" y un sueldo de " + obj.getSueldo());
//        }
//
//        Empleados arrayEmpleados[] = new Empleados[listaEmpleados.size()];
//        listaEmpleados.toArray(arrayEmpleados);
//        for (int i= 0; i<arrayEmpleados.length;i++) {
//            System.out.println(arrayEmpleados[i].getDatosEmpleado());
//        }

        Iterator<Empleados> iteratorEmpleados = listaEmpleados.iterator();
        while (iteratorEmpleados.hasNext()){
            System.out.println(iteratorEmpleados.next().getDatosEmpleado());
        }


    }
}

class Empleados {

    private final String nombre;
    private double sueldo;
    private LocalDate fechaAlta;
    private int id;

    private static int idSiguiente = 1;



    public Empleados(String nombre,double sueldo) {

        this.nombre = nombre;
        this.sueldo = sueldo;

        id = idSiguiente;
        idSiguiente++;
        fechaAlta = LocalDate.now();

    }

    public double getSueldo() {
        return sueldo;
    }

    public String getFechaAlta() {
        return fechaAlta.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }

    public double subeSueldo (double porcentaje) {

        double aumento = sueldo*porcentaje/100;
        return sueldo +=aumento;

    }

    public String getDatosEmpleado () {

        return "El empleado " + nombre + " tiene el ID: " + id + " con fecha de alta: " + fechaAlta;

    }

    public static String getIDSiguiente () {
        return " El ID del siguiente empleado será: " + idSiguiente;

    }

    public String getNombre () {
        return this.nombre;
    }
}

class Jefe extends Empleados {

    private double incentivo;


    public Jefe(String nombre, double sueldo) {
        super(nombre,sueldo);
    }

    public void setIncentivo (double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public double getSueldo () {

        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }

    @Override
    public String getDatosEmpleado() {
        return "El jefe " + this.getNombre() +" tiene un sueldo de " + this.getSueldo();
    }

}


