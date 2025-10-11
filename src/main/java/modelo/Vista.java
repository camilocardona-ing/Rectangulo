/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Scanner;

/**
 *
 * @author camilocardonasuarez
 */
public class Vista {
    private final Scanner sc = new Scanner(System.in);

    public void mostrar(String msg) { System.out.println(msg); }

    public double leerDouble(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) { sc.next(); System.out.print("Ingrese numero: "); }
        return sc.nextDouble();
    }

    public int leerInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) { sc.next(); System.out.print("Ingrese entero: "); }
        return sc.nextInt();
    }
    
}
