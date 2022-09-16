/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase21;
import java.util.Scanner;
public class periodo2class21 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int mu13,mu15,valor,f;
        mu13 = 0;
        mu15 = 0;
        for(f=1;f<=10;f++){
            System.out.print("Ingrese un valor: ");
            valor = teclado.nextInt();
            if (valor%3==0) {
                mu13 = mu13+1;
            }
            if (valor%5==0) {
                mu15 = mu15+1;
            }
            System.out.print("Cantidad de valores ingresados multiplos de 3: ");
            System.out.println(mu13);
            System.out.print("Cantidad de calores ingresados multiplos de 5: ");
            System.out.println(mu15);
    }
    
}