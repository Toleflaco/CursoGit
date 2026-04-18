package bronsito.pooAbstractas;

public class Coche implements Vehiculo {

    private int velocidad;
    private final int plazas = 5;

    public Coche (int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int plazas() {
        return plazas;
    }

    @Override
    public void acelerar(int velocidad) {
        if (this.velocidad + velocidad >= Vehiculo.VELOCIDAD_MAXIMA) System.out.println("TE ESTAS PASANDO, NO PUEDO AUMENTAR LA VELOCIDAD");
        else {
            this.velocidad += velocidad;
            System.out.println("Tu coche circula a la velocidad actual de "+this.velocidad);
        }
    }

    @Override
    public void frenar(int velocidad) {
        if (this.velocidad - velocidad <=0) System.out.println("HAS PARADO EL COCHE");
        else {
            this.velocidad -= velocidad;
            System.out.println("Tu coche circula a la velocidad actual de "+this.velocidad);
        }

    }
}
