/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.periodo;
import java.util.Scanner;
public class Periodo1class11 {
  public static void main(String[] args) {
   Scanner Entrada = new Scanner (System.in);
    float nota1, nota2, nota3, promedio;
    System.out.println("Ingresar la primera nota");
    nota1 = Entrada.nextFloat();
     System.out.println("Ingresar la segunda nota");
    nota2 = Entrada.nextFloat();
     System.out.println("Ingresar la tercera nota");
    nota3 = Entrada.nextFloat();
    promedio = (nota1 + nota2 + nota3) /3;
    System.out.println("El promedio es:" + promedio);
    if (promedio >= 7) {
      System.out.println("Aprobado");
    } else if (promedio >= 4){
      System.out.println("Regular");
    } else {
      System.out.println("Reprobado");
    }
  }
}   