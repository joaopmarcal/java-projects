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
public class ProjetoContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
    	ContaBanco joao = new ContaBanco();
        joao.abrirConta(10,"CC");
        joao.fecharConta();
        joao.depositar(300);
        joao.sacar(100);
        joao.pagarMensal("CC");
        joao.sacar(238);
        joao.fecharConta();
        
        ContaBanco maria = new ContaBanco();
        maria.abrirConta(50, "CP");
        maria.depositar(5000);
        maria.sacar(1000);
        maria.pagarMensal("CP");*/
        
        ContaBanco paulo = new ContaBanco();
        paulo.abrirConta(100, "CC");
        paulo.depositar(10);
        paulo.extrato();
        paulo.mudarNumeroConta(55);
        paulo.extrato();
    }
    
    
    
}
