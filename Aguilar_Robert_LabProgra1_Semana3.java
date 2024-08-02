/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguilar_robert_labprogra1_semana3;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Selvin Aguilar
 */
public class Aguilar_Robert_LabProgra1_Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea=new Scanner(System.in);
        Random rand=new Random();
        String repetir="Si";
                
        while (true){
                System.out.println("""
                                   Bienvenido al Lab de Progra1 de la Semana 3:  
                                   1. Juego Piedra, Papel o Tijera
                                   2. Ejercicio de Suma
                                   3. Patron de Numeros
                                   4. Salir
                                   Ingresa una opcion: """);
                int menu=lea.nextInt();
                
                if(menu==1){
                    System.out.println("""
                                       Bienvenido a Juegos mentales: 
                                       Elije una opcion (Piedra, Papel o Tijera): """);
                    String Elec_User = lea.next().toLowerCase();
                    
                    while("Piedra".equals(Elec_User) || "Papel".equals(Elec_User) || "Tijera".equals(Elec_User)){   
                        System.out.println("Escriba una opcion valida: ");
                        Elec_User = lea.next().toLowerCase();
                    }
                    
                    String cpu_str = " "; 
                    int Elec_cpu=rand.nextInt(3);
                    
                    switch (Elec_cpu) {
                        case 0 -> cpu_str="piedra";
                        case 1 -> cpu_str="papel";
                        case 2 -> cpu_str="tijera";
                        default -> {
                        }
                    }
                    System.out.println("""
                                       La computadora elije: 
                                       -"""+cpu_str);
                    
                     if (Elec_User.equals(cpu_str)) {
                        System.out.println("¡Es un empate!");
                        } else if ((Elec_User.equals("Piedra") && cpu_str.equals("Tijeras")) ||
                   (Elec_User.equals("Papel") && cpu_str.equals("Piedra")) ||
                   (Elec_User.equals("Tijeras") && cpu_str.equals("Papel"))) {
                        System.out.println("¡Ganaste!");
                    } else {
                    System.out.println("!Perdiste!");
        }
                    
                    System.out.println("Quieres volver a jugar? (Si/No): ");
                    repetir = lea.next().toLowerCase();
                        
                
 
                } else if(menu ==2 ){
            
            System.out.println("Ingresa un numeros enteros:");
            int num_enteros = lea.nextInt();

            int suma_num = 0;
            String fun_sumando = "";

            while (num_enteros > 0) {
                int digito = num_enteros % 10;
                suma_num += digito;
                fun_sumando = digito + " + " + fun_sumando;
                num_enteros /= 10;
            }

            
            fun_sumando = fun_sumando.substring(0, fun_sumando.length() - 3);

            System.out.println("La suma de los digitos es: " + suma_num);
            System.out.println("Sumandos: " + fun_sumando + " = " + suma_num);
                    
                
                }else if(menu == 3){
                System.out.print("Ingrese la cantidad de filas: ");
                int cant_filas = lea.nextInt();
        
                System.out.println("Patron numerico descendente:");
                for (int i = 0; i < cant_filas; i++) {
                for (int j = 0; j < i; j++) {
                System.out.print("  "); 
                }
                for (int j = cant_filas - i; j >= 1; j--) {
                System.out.print(j + " ");
                }
                System.out.println();
                }
                } else{
                    System.out.println("""
                                       Gracias por usar el sistema
                                       Vuelva Pronto...""");
                    break;
                }
        }
    }
}
                
                
     
     



