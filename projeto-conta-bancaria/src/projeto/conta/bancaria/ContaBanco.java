/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.conta.bancaria;

/**
 *
 * @author 17004944
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    void abrirConta(int conta,String tipoConta){
        this.setNumConta(conta);
        this.setStatus(true);
        if(tipoConta.equals("CC")){
            this.setSaldo(50);
            this.setTipo("CC");
            System.out.println("Conta Corrente Aberta com Sucesso");
        }else if(tipoConta.equals("CP")){
            this.setSaldo(150);
            this.setTipo("CP");
            System.out.println("Conta Poupança com Sucesso");
    }
    }
    
    void fecharConta(){
    	saldo = this.getSaldo();
        if(saldo == 0) {
        	System.out.println("Conta encerrada");
        	this.setStatus(false);
        }else {
        	System.out.println("Fazer zerar o saldo da conta corrente");
        }
    }
    
    void depositar(int saldo){
    	int saldoInicial = this.getSaldo();
        if(this.isStatus() == true) {
        	saldoInicial = saldoInicial + saldo;
        	this.setSaldo(saldoInicial);
        	System.out.println("Saldo atual: " + this.getSaldo());
        }else {
        	System.out.println("A conta deve estar ativa");
        }
    }
    
    void sacar(int saque){
    	int saldoInicial = this.getSaldo();
        if(this.isStatus() == true) {
        	if(saque <= this.getSaldo()) {
        		saldoInicial = saldoInicial - saque;
        		this.setSaldo(saldoInicial);
        		System.out.println("Saldo atual: " + this.getSaldo());
        	}else {
        		System.out.println("Você não tem saldo suficiente");
        	}
        }
    }
    
    void pagarMensal(String conta){
    	saldo = this.getSaldo();
        if(conta == "CC") {
        	saldo = saldo - 12;
        	this.setSaldo(saldo);
        	System.out.println("Pagamento da taxa de 12 reais. Saldo atual: " + this.getSaldo());
        }else {
        	saldo = saldo - 20;
        	this.setSaldo(saldo);
        	System.out.println("Pagamento da taxa de 20 reais. Saldo atual: " + this.getSaldo());
        }
    }
    
    void extrato() {
    	System.out.println("#### Extrato ####");
    	System.out.println("Numero da conta: " + this.getNumConta());
    	System.out.println("Tipo da conta: " + this.getTipo());
    	System.out.println("Saldo: " + this.getSaldo());
    	System.out.println("Está ativa? " + this.isStatus());
    }
    
    void mudarNumeroConta(int novoNumero) {
    	this.setNumConta(novoNumero);
    	System.out.println("O novo numero da conta é " + novoNumero);
    }
}
