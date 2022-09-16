/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase14;
import java.util.Scanner;
public class periodo2class14 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int numlados;
        System.out.println("Numero de lados");
        numlados = entrada.nextInt();
        switch(numlados){
            case 1 : System.out.println("No es figura");
            case 2 : System.out.println("No es figura");
            case 3 : System.out.println("Tringulo");
            case 4 : System.out.println("Cuadradro o rectangulo");
            case 5 : System.out.println("Pentagono");
            case 6 : System.out.println("Hexagono");
            case 7 : System.out.println("Octagono");
            default : System.out.println("No esta registrada");
                
                
        }
    }
}