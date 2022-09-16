/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase17;
import java.util.Scanner;
public class periodo2class17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        int supar=0;
        int suimpar=0;
        System.out.println("Introduzca un numero");
        num = teclado.nextInt();
        for(int ind=1;ind<=num;ind++){
            if(ind%2==0){
                supar+=ind;
            }
            else {
                suimpar+=ind;
            }
        } 
        System.out.println("La suma de los pares es:" +supar);
        System.out.println("La suma de los impares es:" +suimpar);
    }
}