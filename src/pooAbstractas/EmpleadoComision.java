package bronsito.pooAbstractas;

public class EmpleadoComision extends Empleado{

    private int clientesCaptados;
    private double comision;
    public static final double salarioMinimo = 950.00;
    public EmpleadoComision() {
        super();
        clientesCaptados = 0;
        comision = 0.0;
    }

    public EmpleadoComision(String nombre, String dni, int fechaAlta, int clientesCaptados, double comision) {
        super(nombre,dni,fechaAlta);
        this.clientesCaptados = clientesCaptados;
        this.comision = comision;
    }
    @Override
    public double getSalario() {

        System.out.println(getSalarioMinimo());
        if (this.getSalarioMinimo() >= clientesCaptados*comision) return this.getSalarioMinimo();
        else return clientesCaptados*comision;

    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public double getComision() {
        return comision;
    }

    public double getSalarioMinimo(){
        return salarioMinimo;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
