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
public class Contato {

    private String nome;
    private String email;
    private String telefone;

    public void inicializaContato(String nome, String email, String telefone) {
        if (validarContato(nome, email, telefone)) {
            this.nome = nome;
            this.email = email;
            this.telefone = telefone;
        }          
    }

    private boolean validarContato(String nome, String email, String telefone) {
        if(nome.length() > 0 && validarEmail(email) && telefone.length() > 0)
            return true;
        return false;
    }
    
    public static boolean validarEmail(String email){
        return email.indexOf('@') > 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email){
        if(validarEmail(email)){
            this.email = email;
            return true;
        }
        return false;            
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + getNome() + ", email=" + getEmail() + ", telefone=" + getTelefone() + '}';
    }

}
