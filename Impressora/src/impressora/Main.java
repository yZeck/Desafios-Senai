/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ImpressoraLocal imp = new ImpressoraLocal();
            imp.ligar(new hp());
            imp.imprimir();
            imp.desligar();
            
           }
    
}
