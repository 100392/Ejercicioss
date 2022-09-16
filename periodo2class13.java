/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo2clase13;
import java.util.Scanner;
public class periodo2class13 {
    public static void main(String[] args){
        String tipoDia = "";
        String diaSemana = "";
        
        switch (diaSemana.toLowerCase()){
            case "lunes" -> tipoDia = "Inicio de semana";
            case "martes", "miercoles", "jueves" -> tipoDia = "Mediados de semana";
            case "viernes" -> tipoDia = "Inicio de fin de semana";
            case "sabado", "domingo" -> tipoDia = "Fin de semana";
                
            
        }
        System.out.println(diaSemana + "es" + tipoDia);
    }
}