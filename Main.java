package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

      
        ContaCorrente contaCorrente = new ContaCorrente("123", 1000.0, "João", 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 2000.0, "Maria", 3);
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        String numeroConta = sc.nextLine();

        System.out.println("Digite o valor do depósito:");
        double valorDeposito = sc.nextDouble();

        // Localizando a conta com o número fornecido
        ContaBancaria contaEncontrada = null;
        for (ContaBancaria conta : banco.getContas()) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                contaEncontrada = conta;
                break;
            }
        }

        if (contaEncontrada != null) {
            contaEncontrada.depositar(valorDeposito);
            System.out.println("Depósito realizado com sucesso!");     
            System.out.println("Saldo atual da conta: " + contaEncontrada.getSaldo());
            System.out.println("-----------------------------------------------------");
            
        } else {
            System.out.println("Conta não encontrada!");
        }
        System.out.println("Digite o valor para sacar!");
        double valorSaque = sc.nextDouble();
        if (contaEncontrada != null) {
            contaEncontrada.sacar(valorSaque);
            System.out.println("Saque realizado com sucesso!");     
            System.out.println("Saldo atual da conta: " + contaEncontrada.getSaldo());
            System.out.println("-----------------------------------------------------");
            
        } else {
            System.out.println("Conta não encontrada!");
        }
    }
}

