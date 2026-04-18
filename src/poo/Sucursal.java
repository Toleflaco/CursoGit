package bronsito.poo;

public class Sucursal {

    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    double precio(Paquete paquete) {
        double envio=0;
        envio= paquete.getPeso() *2;
        int prio = paquete.getPrioridad();
        envio = switch(prio){
            case 0 -> envio;
            case 1 -> envio *=10;
            case 2 -> envio *=20;
            default -> throw new IllegalStateException("Unexpected value: " + prio);
        };
        return envio;
    }
}
