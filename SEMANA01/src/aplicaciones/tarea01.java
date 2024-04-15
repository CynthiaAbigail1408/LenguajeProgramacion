/*
 * Programa que permite hallar la masa corporal de una persona
 */
package aplicaciones;

import java.util.Scanner;
/*
 * @author Abigail
 */
public class tarea01 {
    public static void main(String[] args) {
    Scanner tecladomasa = new Scanner(System.in);
 float masa, peso;

 System.out.print("Ingrese el valor peso : ");
 peso = Float.parseFloat(tecladomasa.nextLine());

 masa =  peso * peso;

 System.out.println("---- Reporte ----");
 System.out.println("-----------------");
 System.out.println("Su masa corporal es de : " + masa);
 System.out.println("-----------------");
 }
}
