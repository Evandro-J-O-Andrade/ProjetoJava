/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author TI-02
 */
public class Contas {
    float saldo;
    String conta;

    public Contas(String conta) {
        saldo =0;
        this.conta =conta;
    }
    public void depositar (float deposito) {
        saldo += deposito;
    }
    public void sacar (float sacar){
        if (sacar > saldo){
            System.out.println("Erro");
           
        } else{
            
        
        saldo -= sacar;
     }
    }
    public String toString(){
        return "Saldo"+saldo;
    }
}

