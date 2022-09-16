/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo3clase17;
import java.util.Scanner;
public class periodo3class17 {
    public static void main(String[] args) {
        String nombre,clave;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese Nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese Clave de usuario: ");
        clave = entrada.nextLine();
        if(nombre.equals("aranza") && clave.equals("123456")){
            System.out.println("Bienvenido al Sistema");
            }
        else{
            System.out.println("Nombre de Usuario o contraseña Incorrecta");
        }
        }
    }