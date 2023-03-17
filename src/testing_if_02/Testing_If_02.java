/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing_if_02;
import java.util.Scanner;
/**
 *
 * @author Instructor
 */
public class Testing_If_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //llamar a la función escaner
        Scanner name = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = name.nextLine();
        System.out.println("Hola "+nombre);
        System.out.println("Ingrese un número: ");
        //**********************************
        float num = name.nextFloat();
        //Algoritmo if
        if (num < 10){ 
            System.out.println("Hola "+nombre+" "+"tu numero es menor que 10");
        }
        else if (num == 10){
            System.out.println("Hola "+nombre+" "+"tu numero es igual que 10");
        }
        else {
            System.out.println("Hola "+nombre+" "+"tu numero es mayor que 10");
        }
        
        }
  
}
