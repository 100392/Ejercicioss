/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1class9;
import java.util.Scanner;
public class Periodo1Clase9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1; // primer numero y comparar
        
        System.out.print("Escribir el primer entero: "); //indicador
        numero1 = entrada.nextInt(); // lee el primer numero del usuario
        
        if (numero1 >= 100){
            System.out.println("El numero" + numero1 + "es mayor o igual a 100");
        }
        else if (numero1 >= 50){
            System.out.println("El numero" + numero1 + "es mayor o igual a 50 pero menor a 100");
        }
        else if (numero1 >= 0){
            System.out.println("El numero" + numero1 + "es mayor o igual a 50 pero menor a 50");
        } else {
            System.out.println("El numoer" + numero1 + "es menor que 0");
        }
    }
    
}