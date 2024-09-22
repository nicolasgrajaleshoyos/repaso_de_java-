import javax.swing.*;

public class sueldo {
   public static void main(String[] args) {

       int TotalSueldo;
       float sueldo;
       int mayor;


       TotalSueldo=Integer.parseInt(JOptionPane.showInputDialog(null,"cuantos sueldo va ingresar"));
       mayor = TotalSueldo;

       for (int i = 1; i <=TotalSueldo ; i++) {

           Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese el sueldo :"+ i));

           if(TotalSueldo> mayor){
               mayor = TotalSueldo ;
           }
           
       }
       System.out.println("El mayor es: " + mayor);

    }
}
