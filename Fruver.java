// ANALISIS
/*
* Entradas: 2 entradas: cantidadBanos (double), cantidadManzanas (double)
* Salidas: 5 salidas: subtotalManzanas (double), subtotalBananos (double), totalSinDescuento (double),
* descuentoAplicado (double), totalFinal(double)
* Ejemplo: 2 manzanas y 3 bananos. subtotalManzanas = 2 * 1000 = 2000. subtotalBananos = 3 * 800 = 2400.
* totalSinDescuento = 4400. descuentoAplicado = 440. totalFinal = 4400 - 440 = 3960.
*/

import java.util.Scanner;

public class Fruver {
    
     public static void main(String[] args) {

        final double PRECIO_MANZANA = 1000;
        final double PRECIO_BANANO = 800;
        final double PORCENTAJE_DESCUENTO= 0.10;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de manzanas:");
        double cantidadManzanas = escaner.nextDouble();
        escaner.nextLine();

        System.out.println("Ingrese cantidad de bananos:");
        double cantidadBananos = escaner.nextDouble();
        escaner.nextLine();

        double subtotalManzanas, subtotalBananos, totalSinDescuento;
        subtotalManzanas = calcularSubtotal(cantidadManzanas, PRECIO_MANZANA);
        subtotalBananos = calcularSubtotal(cantidadBananos, PRECIO_BANANO);

        System.out.println("El subtotal a pagar de manzanas es: " + subtotalManzanas);
        System.out.println("El subtotal a pagar de bananos es: " + subtotalBananos);

        totalSinDescuento = calcularTotalSinDescuento(subtotalManzanas, subtotalBananos);
        System.out.println("El total sin descuento es: " + totalSinDescuento);

        descuentoAplicado = calcularDescuentoAplicado(totalSinDescuento, PORCENTAJE_DESCUENTO);
        System.out.println("descuento aplicado " + (PORCENTAJE_DESCUENTO * 100)+ "% : " + descuentoAplicado );

        
        totalFinal= calcularTotalFinal(totalSinDescuento,descuentoAplicado);
        System.out.println("total final a pagar: " + totalFinal);
        
        
     }

     public static double calcularSubtotal(double cantidad, double precio) {
      double subtotal = cantidad * precio;
      return subtotal;
     }

     public static double calcularTotalSinDescuento(double subtotal1, double subtotal2) {
      double sumaSubtotales = subtotal1 + subtotal2;
      return sumaSubtotales;
     }
     
    public static double calcularDescuentoAplicado(double totalSinDescuento, double porcentaje) {
        double multiplicacion=totalSinDescuento * porcentaje;
        return multiplicacion;
    }
     public static double calculartotalFinal(double totaSinDescuento, double descuento){
        double descuento= TotalSinDescuento - descuento;
        return descuento;
     }
    

}