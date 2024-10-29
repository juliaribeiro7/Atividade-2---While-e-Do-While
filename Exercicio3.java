/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 37;
        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 100:");
        do {
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Você acertou! O número era " + numeroSecreto + ".");
        System.out.println("Você fez " + tentativas + " tentativas.");
    }
}
