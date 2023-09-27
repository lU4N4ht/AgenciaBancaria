package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    private String nome, endereco;
    Scanner scanner = new Scanner(System.in);
    private long cpf, rg, telefone;

    List<Cliente> ListCliente = new ArrayList<>();

    public Cliente pesquisarCliente(long cpf){
        for (Cliente cliente: ListCliente){
            long validaCpf = getCpf();
            if (validaCpf == cpf){
                return cliente;
            }
        }
        return null;
    }
    public void listarCliente(){
        for (Cliente cliente: ListCliente){
            System.out.println(cliente.getNome());
            System.out.println(cliente.getCpf());
        }
    }

    public void adicionarCliente(Cliente cliente){
        ListCliente.add(cliente);
    }

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
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCpf(long cpf) {

        this.cpf = cpf;
    }
    public long getCpf() {

        return cpf;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getRg() {
        return rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }

}
