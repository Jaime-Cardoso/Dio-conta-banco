package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicita o número da conta
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        // Solicita o nome do cliente
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo da conta
        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}