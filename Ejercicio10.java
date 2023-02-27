/* Escribir un programa que imprima la tabla de multiplicar de un nÃºmero haciendo uso de CICLOS
 */

import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[]args){
        int entradaNumero = 0;    
        int numeroTempo = 0; 
        Scanner sc = new Scanner (System.in);    
    
        System.out.println("Ingrese el nÃºmero de que desea obtener la tabla: ");

        entradaNumero = sc.nextInt();
        numeroTempo = entradaNumero; 

        System.out.println("la tabla de " + entradaNumero + " es: ");
        for (int i = 1; i <= 10; i ++){
             numeroTempo = entradaNumero * i;

            System.out.println("\n" + numeroTempo);

        }
    }
}