/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canetagettersetter;

/**
 *
 * @author paulo
 */
public class CanetaGetterSetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta bic = new Caneta("Bic","Azul",0.7); 
        bic.escrever();
        bic.destampar();
        bic.pintar();
    }
    
    
    
}
