package bronsito.pooAbstractas;

public class MainEmpleados {

    public static void main(String[] args) {

        EmpleadoAsalariado Antonio = new EmpleadoAsalariado("Antonio López","6546545Z",2014,1125);
        EmpleadoComision Sandra = new EmpleadoComision("Sandar Nieto", "7879878S",2011,169,7.10);


        Empleado empleados[] = new Empleado[4];
        empleados[0] = Antonio;
        empleados[1] = Sandra;
        EmpleadoComision emple = new EmpleadoComision();
        emple.setNombre("Manuel");
        emple.setDni("4654654D");
        emple.setFechaAlta(2010);
        emple.setComision(6.90);
        emple.setClientesCaptados(35);
        empleados[2] = emple;

        EmpleadoAsalariado emple2 = new EmpleadoAsalariado();
        emple2.setNombre("María ramos");
        emple2.setDni("77879878F");
        emple2.setFechaAlta(2011);
        emple2.setSalarioBase(1055);

        empleados[3] = emple2;

        sueldoMayor(empleados);
        mostrarTodos(empleados);

        }
    public static void sueldoMayor(Empleado empleados[]) {

        int pos = 0;
        double sueldoAux=0.0;

        for (int i = 0; empleados.length > i; i++) {
            if (empleados[i].getSalario() > sueldoAux) {
                pos = i;
                sueldoAux = empleados[i].getSalario();
            }
        }

        System.out.printf("\n El empleado con mayor salario es "+ empleados[pos].getNombre() + " con salario " + sueldoAux);
        System.out.println();



    }
    public static void mostrarTodos(Empleado[] empleados) {

        for (Empleado e:empleados){
            System.out.println("El empleado con nombre: " + e.getNombre() +" tiene un dni " + e.getDni()+ " con un salario "+
                    e.getSalario()+ " y entró en la empresa el "+ e.getFechaAlta());
        }
    }
}
