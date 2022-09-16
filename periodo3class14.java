/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3clase14;
import java.util.Scanner;
public class periodo3class14 {
    public static void main (String[] args){
        int Nota = 0, Cont1 = 0, Cont2 = 0;
        Scanner Teclado = new Scanner(System.in);
        do {
            System.out.println("Ingresar la nota del aluumno");
            Nota = Teclado.nextInt();
            if (Nota>=7){
                Cont1 = Cont1 +1;
            } else if (Nota>0){
                Cont2 = Cont2 + 1;
            }
        } while (Nota != 0);// cuando tecleamos o detendra el ciclo...
        System.out.println("La cantidad de alumnos que tienen notas mayores o iguales a 7 son: " + Cont1);
        System.out.println("La cantidad de alumnos que tienen notas menores a 7 son: " + Cont2);
    }
    
}