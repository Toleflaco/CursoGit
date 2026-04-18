package bronsito.pooAbstractas;

import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class PruebaTemporizador {

    public static void main(String[] args) {

  //      Temporizador oyente = new Temporizador();
        Timer miTemporizador = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LocalDateTime.now());
            }
        });
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
    }
}

//class Temporizador implements ActionListener {
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        System.out.println(LocalDate.now());
//
//    }

//}