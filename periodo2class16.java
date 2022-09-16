/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase16;
import java.util.Scanner;
public class periodo2class16 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int fact=1;
        int num=0;
        System.out.println("Introduce un numero");
        num = teclado.nextInt();
        for (int ind=1;ind<=num;ind++){
            fact*=ind;
        }
        System.out.println("El factorial es" + fact);
    }
}