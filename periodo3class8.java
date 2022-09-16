/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3clase8;
import java.util.Scanner;
public class periodo3class8 {
    public static void main (String[] args) {
        Scanner Reader = new Scanner(System.in);
        String quieroJugar = "si";
        while(quieroJugar.equals("si")) {
            System.out.println("¿Quieres seguir jugando");
            quieroJugar = Reader.next();
        }
    }
    
}