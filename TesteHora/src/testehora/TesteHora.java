/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehora;


/**
 *
 * @author Herbert Nascimento
 */
public class TesteHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hora a = new Hora();       
        
        a.inicializarHora(2,56,30);        
        System.out.println(a.toString());
        
        a.setFuso("Linha de Data internacional Oeste");
        System.out.println(a.toString());
        
        a.setFuso("Alasca");
        System.out.println(a.toString());
        
        a.setFuso("América Central");
        System.out.println(a.toString());
        
        a.setFuso("Salvador");
        System.out.println(a.toString());
        
        a.setFuso("Tempo Universal Coordenado");
        System.out.println(a.toString());
        
        a.setFuso("Kwait");
        System.out.println(a.toString());
        
        a.setFuso("Astana");
        System.out.println(a.toString());
        
        a.setFuso("Fiji");
        System.out.println(a.toString());
    }       
}
