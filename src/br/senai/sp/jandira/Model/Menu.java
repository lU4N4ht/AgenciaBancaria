package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Cliente referenciacliente = new Cliente();
    Conta referenciaconta = new Conta();
    public void executarMetodos(){

        boolean continuar = true;

        while (continuar) {

            System.out.println("-----------------MENU------------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Gerar Conta");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Realizar Depósito");
            System.out.println("5 - Realizar Saque");
            System.out.println("7 - Transferência");
            System.out.println("8 - Sair");
            System.out.println("----------------------------------");
            int option = scanner.nextInt();

            switch (option) {

                case 1:
                    Cliente cliente = new Cliente();
                    cliente.cadastrarCliente();
                    referenciacliente.adicionarCliente(cliente);
                    break;
                case 2:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfTitular = scanner.nextLong();
                    scanner.nextLine();

                   Cliente clienteTitular = referenciacliente.pesquisarCliente(cpfTitular);

                   if(clienteTitular != null){
                       Conta conta = new Conta();
                       conta.gerarConta(clienteTitular);
                       referenciaconta.adicionarConta(conta);
                   } else {
                       System.err.println("Impossível gerar conta! Necessário cadastrar um cliente!");
                   }
                    break;
                case 3:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfConta = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaPesquisar = referenciaconta.pesquisarContas(cpfConta);

                    if (contaPesquisar != null){
                        double saldo = contaPesquisar.getSaldo();
                        System.out.println("O saldo disponível na conta é: " + saldo);
                    } else{
                        System.err.println("O usuário não possui conta cadastrada!");
                    }

                    break;
                case 4:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfDeposito = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaDeposito = referenciaconta.pesquisarContas(cpfDeposito);
                    if (contaDeposito != null){
                        System.out.println("Informe o valor do Depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        contaDeposito.realizarDeposito(valorDeposito);
                    } else{
                        System.err.println("O usuário não possui conta cadastrada!");
                    }
                    break;
                case 5:
                    System.out.println("Informe o CPF do Titular: ");
                    long cpfSaque = scanner.nextLong();
                    scanner.nextLine();

                    Conta contaSaque = referenciaconta.pesquisarContas(cpfSaque);
                    if (contaSaque != null){
                        System.out.println("Informe o valor do Depósito: ");
                        double valorSaque = scanner.nextDouble();
                        contaSaque.realizarSaque(valorSaque);
                    } else{
                        System.err.println("O usuário não possui conta cadastrada!");
                    }

                case 6:
                    System.out.println("FEATURE IN DEVELOPMENT");
                    break;
                case 7:

                case 8:
                    continuar = false;
                    break;
            }
        }
    }
}
