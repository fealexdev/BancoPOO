package com.projetobanco;

public class Main {

    public static void main(String[] args) {
        //Criação do objeto
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Felipe");
        p1.abrirConta("CC");

        //Saque e depósito
        p1.depositar(100);
        p1.sacar(50);

        //Informações
        p1.estadoAtual();

    }
}


