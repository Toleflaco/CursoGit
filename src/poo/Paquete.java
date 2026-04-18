package bronsito.poo;

import java.util.HashMap;

public class Paquete {

    private long referencia;
    private double peso;
    // private HashMap<int,String> prioridad;
    private int prioridad;
    private String dni;

    public Paquete(long referencia, double peso, int prioridad, String dni) {
        this.referencia = referencia;
        this.peso = peso;
        this.prioridad = prioridad;
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public long getReferencia() {
        return referencia;
    }

    public String getDni() {
        return dni;
    }
}
