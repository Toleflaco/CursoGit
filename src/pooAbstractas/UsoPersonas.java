package bronsito.pooAbstractas;


import java.util.Arrays;

public class UsoPersonas {

    public static void main(String[] args) {

//        Empleados Juan = new Empleados("Juan",2122.22);
//        Jefes Pedro = new Jefes("Pedro",3233.23);
//        Alumnos Manel = new Alumnos("Manel", "Java","home1");
//        Jefes David = new Jefes("david",4800);
//        David.setCargo("Director de RRHH");
//
//        System.out.println(Juan.getNombre());
//        System.out.println(Juan.getDescripcion());
//        System.out.println(Pedro.getNombre());
//        System.out.println(Pedro.getDescripcion());
//        System.out.println(Manel.getNombre());
//        System.out.println(Manel.getDescripcion());
//        System.out.println(David.getNombre());
//        System.out.println(David.getDescripcion()+ David.getCargo());

        Empleados losEmpleados[] = new Empleados[5];

        losEmpleados[0] = new Empleados("Juan",2200);
        losEmpleados[1] = new Empleados("Pedro",1200);
        losEmpleados[2] = new Empleados("Luis",3300);
        losEmpleados[3] = new Empleados("Marcos",4400);
        losEmpleados[4] = new Empleados("Lucas",6700);

        Arrays.sort(losEmpleados);


        for (Empleados e: losEmpleados) {
            System.out.println(e.getDescripcion());
        }

        Jefes Manuel = new Jefes("Manuel",3000);
        Empleados Sonia = new Empleados("Sonia",2700);

        System.out.println("El trabajador " + Manuel.getNombre() + " tiene un bonuts de " + Manuel.setBonus(500));
        System.out.println("El trabajador " + Sonia.getNombre() + " tiene un bonus de " + Sonia.setBonus(500));

    }
}
