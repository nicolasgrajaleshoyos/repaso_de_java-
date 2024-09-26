package arreglos;

import java.util.Scanner;

public class ejercico1_de_arreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numeros [] = new  float[5];

        System.out.println("guardando los datos del arreglo");
        for (int i = 0; i <5; i++) {
            System.out.println((i+1)+":"+"diguite un numero del arreglo ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("\n los datos del arreglo");
            for(float i = 4; i >= 0; i--) {
                System.out.println(numeros[(int) i]);
        };
    }
}
