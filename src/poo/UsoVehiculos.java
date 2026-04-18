package bronsito.poo;

public class UsoVehiculos {

    public static void main(String[] args) {

        Vehiculos micoche = new Vehiculos(4);
        Vehiculos moto1 = new Vehiculos(2);
        Vehiculos micoche2 = new Vehiculos(4,1,0.3,300);
        moto1.setColor("Rojo");
        micoche.setColor("Naranja");
        System.out.println(micoche.getColor());
        System.out.println(moto1.getColor());
        System.out.println(moto1.getDatosVehiculos());
        micoche2.setExtra(true,true,true);
        System.out.println(micoche2.getDatosVehiculos());
        micoche.setExtra(true,true,true);
        System.out.println(micoche.getExtra());


    }
}
