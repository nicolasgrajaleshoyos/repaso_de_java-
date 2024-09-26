package arreglos;

import javax.swing.*;
import java.util.Scanner;
//como se llena un arreglo
public class video_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nElementos;

        nElementos=Integer.parseInt(JOptionPane.showInputDialog("digite la cnatida de datos que vaya a almacenar "));

        char[][] letras = new char[nElementos][nElementos];//se esta creando un arreglo

        System.out.println("diguite los elementos que vaya a almacenar");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+".diguite un caracter:");
            letras[i] = sc.next().toCharArray();
        }

        System.out.println("\n los caracteres del arreglo son ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println(letras[i]);
        }
    }

}
