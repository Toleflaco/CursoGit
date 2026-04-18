package bronsito.poo;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class Password {

    private int longitud;
    private String pass="";

    public Password(int longitud) {

        this.longitud = longitud;
    }

    public void generarPassword () {
        int rd;
        int min = 65;
        int max = 122;
        for (int i = 0; i < longitud; i++) {
            SecureRandom sr = new SecureRandom();
            rd = sr.nextInt((max - min) + 1) + min;
            pass += (char) rd;
        }
    }
    public boolean esSegura(String pass) {
       int contadorMays=0;
       int contadorMins=0;
       int contadorNums=0;

       for (char c: pass.toCharArray()) {
           if (Character.isUpperCase(c)) contadorMays++;
           else if (Character.isLowerCase(c)) contadorMins++;
           else if (Character.isDigit(c)) contadorNums++;
       }
        return ((contadorMays > 2) && (contadorMins >= 2) && (contadorNums > 5));
    }
    public int getLongitud() {
        return longitud;
    }

    public String getPass() {
        return pass;
    }

}
