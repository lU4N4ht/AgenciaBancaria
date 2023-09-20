package br.senai.sp.jandira.Model;

public class Conta {
    private String agencia = "000-20-X";

    private int numeroConta = 1234;

    private double saldo = 8640;

    public void realizarSaque(double valorSaque){
        if (saldo < valorSaque){
            System.err.println("NAO DA PRA SACAR");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Seu saldo atual é: " + this.saldo);

        }

    }
    public void realizarDeposito(double valorDeposito){
        this.saldo  += valorDeposito;
        System.out.println("Seu saldo atual é: " + this.saldo);

    }
    public void consultarSaldo(){
        System.out.println("Seu saldo atual é: " + this.saldo);
    }
}
