package bronsito.pooAbstractas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PruebaTemporizador2 {

    public static void main(String[] args) {

        Reloj miReloj = new Reloj();
        miReloj.ejecutarTemporizador(2000,false);
        JOptionPane.showMessageDialog(null,"Pulsa para acabar");
    }
}

class Reloj {

    public void ejecutarTemporizador (int intervalo, boolean sonido) {

//        class DameLaHora implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(LocalDateTime.now());
//
//                if (sonido) Toolkit.getDefaultToolkit().beep();
//
//            }
//        }
//
//        ActionListener oyente = new DameLaHora();

        Timer miTemporizador = new Timer(intervalo, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LocalDateTime.now().getSecond());
                if (sonido) Toolkit.getDefaultToolkit().beep();
            }
        });
        miTemporizador.start();
    }
}

