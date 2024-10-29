/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Digite números inteiros (um número negativo para sair):");
        while ((numero = scanner.nextInt()) >= 0) {
            soma += numero;
        }
        System.out.println("A soma dos números positivos é: " + soma);
    }
}

