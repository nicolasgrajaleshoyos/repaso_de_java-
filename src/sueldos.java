import javax.swing.*;

public class sueldos {


    public static void main(String[] args) {
        //pedir 10 sueldos mostrar su suma  y cuantos hay mayores de 1000


        float sueldo,cont_sueldo=0;
        int mayores = 0;


        for (float i = 0; i <10 ; i++) {
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("ingrese un sueldo "));
            cont_sueldo+=sueldo;



            if (sueldo >1000){
                mayores++;
            }


        }

        JOptionPane.showMessageDialog(null,"el total de los sueldos es  "+cont_sueldo);
        System.out.println("el total de los sueldos es  "+cont_sueldo);
        JOptionPane.showMessageDialog(null,"los sueldos  mayores son "+mayores);
        System.out.println("los sueldos  mayores son "+mayores);
    }



}
