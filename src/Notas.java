import javax.swing.*;

public class Notas {

    public static void main(String[] args) {

        float notas = 0;
        boolean gano=true;
        int cont=0;
        int cont2=0;


        for (int i = 1; i <= 5 ; i++) {
            notas=Float.parseFloat(JOptionPane.showInputDialog("digite la notas del estudiante  "+ i ));

            //notas +=notas/i;


            if ( notas >=2.9) {
                gano=false;
                JOptionPane.showMessageDialog(null, "El estudiante gano");
                cont ++;
            }
            else {
                gano=true;
                JOptionPane.showMessageDialog(null, "El estudiante perdio");
                cont2++;
            }

        }

        System.out.println("perdieron: "+cont2);
        System.out.println("ganaron:  "+  cont);
    }


}

