/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecontato;

/**
 *
 * @author Herbert Nascimento
 */
public class TesteContato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contato pessoa[] = new Contato[3];
        pessoa[0] = new Contato();
        pessoa[1] = new Contato();
        
        pessoa[0].inicializaContato("Fulano", "fulano@uesc.br", "73 9953214");       
        System.out.println(pessoa[0].getNome()+" "+pessoa[0].getEmail()+" "+pessoa[0].getTelefone());        

        pessoa[1].inicializaContato("Ciclano", "ciclanosemarromba", "73 98654724");
        System.out.println(pessoa[1].getNome()+" "+pessoa[1].getEmail()+" "+pessoa[1].getTelefone());
        
        pessoa[1].setEmail("ciclano@uesc.br");
        System.out.println(Contato.validarEmail(pessoa[1].getEmail()));
        if(Contato.validarEmail(pessoa[1].getEmail())){
            pessoa[1].inicializaContato("Ciclano", "ciclano@uesc.br", "73 98654724");
        }
                
        System.out.println(pessoa[1].getNome()+" "+pessoa[1].getEmail()+" "+pessoa[1].getTelefone());
    }

}
