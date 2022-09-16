/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1clase16;
import java.util.Scanner;
public class Periodo1class16 {
    public static void main(String[] args){
        int n1,n2,n3;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Ingresar un numero:" );
        n1=Entrada.nextInt();
        System.out.print("Ingresar un numero:" );
        n2=Entrada.nextInt();
        System.out.print("Ingresar un numero:" );
        n3=Entrada.nextInt();
        if ((n1>n2) && (n2>n3)){
            System.out.println("El orden es: " + n1 + n2 + n3);
        }
        else if ((n1>n3) && (n3>n2)){
            System.out.println("El orden es: " + n1 + n3 + n2);
        }
        else if ((n2>n1) && (n1>n3)){
            System.out.println("El orden es: " + n2 + n1 + n3);
        }
        else if ((n2>n3) && (n3>n1)){
            System.out.println("El orden es: " + n2 + n3 + n1);
        }
        else if ((n3>n2) && (n2>n1)){
            System.out.println("El orden es: " + n3 + n2 + n1);
        }
        else {
        System.out.println("El orden es: " + n3 + n1 + n2);
    }
        
    }
    
    
}