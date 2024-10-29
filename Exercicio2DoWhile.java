/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2dowhile;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Exercicio2DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        do {
            System.out.print("Digite a temperatura em Celsius (0 para sair): ");
            celsius = scanner.nextDouble();
            if (celsius != 0) {
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
            }
        } while (celsius != 0);
    }
}
