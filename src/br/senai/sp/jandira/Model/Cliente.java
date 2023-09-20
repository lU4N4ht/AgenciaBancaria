package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Cliente {
    public String nome, endereco;
    Scanner scanner = new Scanner(System.in);
    public long cpf, rg, telefone;

    public void cadastrarCliente(){

        System.out.println("----------CADASTRO CLIENTE-------------");
        System.out.print("Informe o seu Nome: ");
        nome = scanner.nextLine();
        System.out.print("Informe o seu Endereço: ");
        endereco = scanner.nextLine();
        System.out.println("Informe o seu CPF: ");
        cpf = scanner.nextLong();
        System.out.print("Informe o seu RG: ");
        rg = scanner.nextLong();
        System.out.println("Informe o seu Telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("-------------CADASTRO FINALIZADO-----------");

    }
}
