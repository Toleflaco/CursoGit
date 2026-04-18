package bronsito.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsoSucursalPaquete {

    public static void main(String[] args) {

        int numeroSucursal;
        String direccion;
        String ciudad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de sucursal");
        numeroSucursal = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Introduce la dirección");
        direccion = entrada.nextLine();
        System.out.println("Introduce la ciudad");
        ciudad = entrada.nextLine();
        Sucursal sucursal = new Sucursal(numeroSucursal,direccion,ciudad);

        System.out.println("Cuantos paquetes vas a enviar??");
        int numPaquetes = entrada.nextInt();

        List<Paquete> paquetes = new ArrayList<>(numPaquetes);

        for(int i= 0; i< numPaquetes;i++) {
            System.out.println("Introduce la referencia");
            long referencia = entrada.nextLong();
            System.out.println("Introduce el peso");
            double peso = entrada.nextDouble();
            System.out.println("Introduce la prioridad");
            int prioridad = entrada.nextInt();
            System.out.println("Introduce el DNI del remitente");
            String dni = entrada.next();
                    //nextLine();
            Paquete paq = new Paquete(referencia,peso,prioridad,dni);
            paquetes.add(i,paq);

            double precio = sucursal.precio(paquetes.get(i));

            System.out.println("Datos del envio");
            System.out.println("Sucursal Nº:" + sucursal.getNumeroSucursal());
            System.out.println("Dirección: "+ sucursal.getDireccion());
            System.out.println("Ciudad: "+ sucursal.getCiudad());
            System.out.println("Referencia paquete: " + paquetes.get(i).getReferencia());
            System.out.println("DNI remitente: " + paquetes.get(i).getDni());
            System.out.println("Peso: " + paquetes.get(i).getPeso());
            System.out.println("Prioridad: " + paquetes.get(i).getPrioridad());
            System.out.println("Precio del envio: " + precio);

        }
        entrada.close();


    }
}
