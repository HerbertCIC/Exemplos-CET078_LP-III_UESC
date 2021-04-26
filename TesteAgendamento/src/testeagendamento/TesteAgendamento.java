/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeagendamento;



/**
 *
 * @author Herbert Nascimento
 */
public class TesteAgendamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Agendamento agend = new Agendamento();  
        
        agend.inicializaAgendamento("Dentista", 10, 2, 14, 3, "Fulano da Silva");  
        System.out.println(agend.toString());
        
        agend.cancelarAgendamento();
        
        if(agend.remarcarAgendamento(19, 4))
            System.out.println("Agendamento remarcado!");
        else
            System.out.println("Não foi possivel efetuar o reagendamento!");
        
        System.out.println("-------------------------------------------\n");
        
        System.out.println(agend.toString());
    }
    
}
