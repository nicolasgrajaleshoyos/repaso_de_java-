import javax.swing.*;
import java.util.Scanner;

public class facturacion {
    public static void main(String[] args){

        /*



        int codigo, litros,litrosArticulos=0 ,coteo=0;
        float precioLitros,importefacturacion,facturacion=0;

        for (int i = 1; i <=5 ; i++) {
            codigo=Integer.parseInt(JOptionPane.showInputDialog("articulo n°"+i+"\n Digite el codigo"));
            litros=Integer.parseInt(JOptionPane.showInputDialog("articulo n°"+i+"\n Digite el codigo"));
            precioLitros=Float.parseFloat(JOptionPane.showInputDialog("articulo n°"+i+"\n Digite el precio por litro"));

            importefacturacion= (float) litros*precioLitros;

            facturacion += importefacturacion;

            if (codigo ==1){
                litrosArticulos *= litros;
            }
            if (importefacturacion > 600){
                facturacion += importefacturacion;
                coteo ++;
            }

            System.out.println("resumen de ventas");
            System.out.println("facturacion total: "+facturacion);
            System.out.println("cantidad de litros vendidios"+litrosArticulos);
            System.out.println("cantidad de mayo de  6000"+litrosArticulos);
        }
  */

        //1) 0,6 $/litro
        //2) 3 $/litro
        //3) 1,25 $/litro
        //Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
        //En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas:
        //Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de $600.

        int codigo,litros,litrosArt1=0,conteomayor600=0;
        float precioLitro,importeFactura=0,factT=0;

        Scanner in = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.print("Articulo N#"+i+"\nIngrese el codigo del producto: "); codigo = in.nextInt();
            System.out.print("Articulo N#"+i+"\nIngrese la cantidad de litros: "); litros = in.nextInt();
            System.out.println("\n\n");

            //importeFactura =(float) litros*precioLitro;//Importe por factura

            switch (codigo) {
                case 1:
                    precioLitro = 0.6f;
                    litrosArt1 += litros;
                    importeFactura = (float)(precioLitro*litros);
                    break;
                case 2:
                    precioLitro = 3f;
                    importeFactura = (float)(precioLitro*litros);
                    break;
                case 3:
                    precioLitro = 1.25f;
                    importeFactura = (float)(precioLitro*litros);
                    break;
                default:
                    break;
            }


            factT += importeFactura;//Facturacion total
            if(importeFactura>600){
                conteomayor600++;
            }

        }

        System.out.println("\nResumen de ventas\n");
        System.out.println("Facturacion Total : "+factT);
        System.out.println("Cantidad de litros vendidos del articulo 1: "+litrosArt1);
        System.out.println("Cantidad de facturas que superan los $600: "+conteomayor600);



    }
}

