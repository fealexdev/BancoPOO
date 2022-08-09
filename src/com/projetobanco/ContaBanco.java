package com.projetobanco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String dono;
    private String tipo;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("-------------------------------");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo final:" + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }

    //Construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Getters and setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Metodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois possui débito");
        } else {
            setStatus(false);
        }

    }

    public void depositar(int v) {
        if (status = true) {
            setSaldo(getSaldo() + v);
            System.out.println("Deposito de" + " " + v + " " + "realizado na conta:" + getDono());
        } else {
            System.out.println("Impossível depositar");
        }

    }

    public void sacar(int v) {
        if (status = true) {
            if (saldo > v) {
                saldo = saldo - v;
                System.out.println("Saque de" + " " + v + " " + "realizado na conta:" + getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }

    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por" + getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }

    }

}

