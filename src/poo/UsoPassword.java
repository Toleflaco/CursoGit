package bronsito.poo;

import javax.swing.*;
import java.awt.*;

public class UsoPassword {
    public static void main(String[] args) {

        int longitud= Integer.parseInt(JOptionPane.showInputDialog(null, " Introduce la longitud del password"));
        int numPass = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas contraseñas quieres que genere"));

        Password [] passwords = new Password[numPass];
        for (int i = 0; i< passwords.length;i++) {
            passwords[i] = new Password(longitud);
            passwords[i].generarPassword();
        }
        for(Password pss : passwords) {
            System.out.println("La contraseña creada es: " + pss.getPass() +" con longitud " + pss.getLongitud() +
                     " y su seguridad es: " + (pss.esSegura(pss.getPass())?"FUERTE": "DEBIL"));

        }



    }
}
