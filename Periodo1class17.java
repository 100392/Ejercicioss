/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1clase17;
import java.util.Scanner;
public class Periodo1class17 {
    public static void main(String[] args) {
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese clave de usuario: ");
        clave = entrada.nextLine();
        if(nombre.equals("Gabriela") && clave.equals(1234)){
            System.out.println("Bienvenido");
        }
        else{
            System.out.println("Nnombre o clave de usuario es incorrecto");
        }
    }
}
