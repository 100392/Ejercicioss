/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3clase16;
import java.util.Scanner;
public class periodo3class16 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int password;
        do {
            System.out.print("Introduzca su contraseña numerica: ");
            password = keyboard.nextInt();
            if (password != 12345)
                System.out.println("La contraseña no es valida");
        }
        while (password !=12345);
    }
}