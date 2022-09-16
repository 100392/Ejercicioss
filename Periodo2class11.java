/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase11;
import java.util.Scanner;
public class Periodo2class11 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
       Scanner ingresar = new Scanner(System.in);
       String cadena = "";
       System.out.println("Ingresar un caracter: ");
       String caracter = ingresar.nextLine();
       for(int i=1; i<=20; i++);{
        cadena = cadena + caracter;
        System.out.println(cadena);
       }
    }
}