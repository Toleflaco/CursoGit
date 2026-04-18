package bronsito.pooAbstractas;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado {

    private double salarioBase;

    public EmpleadoAsalariado () {
        super();
        salarioBase = 0.0;
    }
    public EmpleadoAsalariado(String nombre, String dni, int fechaAlta, double salarioBase) {
        super(nombre, dni,fechaAlta);
        this.salarioBase = salarioBase;

    }

    @Override
    public double getSalario() {
        int ahora = LocalDate.now().getYear();
        int tiempo = ahora - getFechaAlta();

        if (tiempo < 2) return salarioBase;
        else if (tiempo >=2 && tiempo <=3) return salarioBase*1.07;
        else if (tiempo >=4 && tiempo<=8) return salarioBase*1.11;
        else if (tiempo >=9 && tiempo <=15) return salarioBase*1.17;
        return 0;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf(" Salario: %.2f", getSalario());
        System.out.println();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
