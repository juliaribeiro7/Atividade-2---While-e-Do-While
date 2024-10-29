/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3dowhile;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Exercicio3DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para a contagem regressiva: ");
        int numero = scanner.nextInt();

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 1);
    }
}
