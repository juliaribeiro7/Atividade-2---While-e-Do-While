/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4dowhile;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Exercicio4DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contagemImpares = 0;
        int numero;

        do {
            System.out.print("Digite um número (0 para parar): ");
            numero = scanner.nextInt();
            if (numero % 2 != 0) {
                contagemImpares++;
            }
        } while (numero != 0);

        System.out.println("A quantidade de números ímpares inseridos foi: " + contagemImpares);
    }
}
