package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    List<Conta> ListContas = new ArrayList<>();
    private String agencia ="ajksjhakjhjak";

    private int numeroConta;

    private double saldo = 0;

    public void gerarConta(Cliente cliente){
        numeroConta = (int) ( Math.random()*1000);
        this.cliente = cliente;
    }
    public void adicionarConta(Conta conta){
        ListContas.add(conta);
    }

    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void listarContas(){
        for (Conta conta: ListContas){
            System.out.println(conta.getNumeroConta());
        }
    }
    public Conta pesquisarContas(long cpf){
        for (Conta conta: ListContas){
            long validaCpfConta = conta.cliente.getCpf();
            if (validaCpfConta == cpf){
                return conta;
            }
        }
        return null;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void realizarSaque(double valorSaque) {
        if (saldo < valorSaque) {
            System.err.println("Impossivel Realizar o Saque");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Seu saldo atual é: " + this.saldo);

        }

    }

    public void realizarDeposito(double valorDeposito) {
        this.saldo += valorDeposito;
        System.out.println("Seu saldo atual é: " + this.saldo);

    }
}
