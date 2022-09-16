/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3clase6;
import java.util.Scanner;
public class periodo3class6 {
    public static void main(String[] args){
        Scanner objetoNum = new Scanner(System.in);
        Scanner objetoTexto = new Scanner(System.in);
        String seguir = "s";
        double num,suma;
        int conteo = 0,primo = 0,noprimo = 0;
        while ("s".equals(seguir)|| "S".equals(seguir))
        {
            System.out.println("Ingresar un numero positivo");
            num = objetoNum.nextInt();
            while (num<0)
            {
                System.out.println("Ingresar un numero positivo");
                num = objetoNum.nextInt();
            }
            conteo++;
            if(num%2==0)
            {
                primo++;
            }
            else
            {
                noprimo++;
            }
            System.out.println("Desea ingresar otro valor, s");
            seguir = objetoTexto.next();
        }
    }
    
}
