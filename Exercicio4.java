/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int N = scanner.nextInt();
        int i = 2;

        System.out.println("Números pares de 1 a " + N + ":");
        while (i <= N) {
            System.out.println(i);
            i += 2;
        }
    }
}
