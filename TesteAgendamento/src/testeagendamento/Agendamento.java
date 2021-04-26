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
public class Agendamento{
    private String nome;     
    private Data data = new Data();
    private Hora hora = new Hora();
    private int duracao;
    private String participantes;
    private boolean status=false;
    
    public void inicializaAgendamento(String nome, int dia,int mes, int horaInicio, int duracao, String participantes){
        this.nome = nome;          
        data.inicializaData(dia, mes, 2021);         
        hora.inicializarHora(horaInicio, 0, 0);
        this.duracao = duracao;
        this.participantes = participantes;
        this.status = true;
    }
      
    public void cancelarAgendamento(){
        this.status = false;
    }
    
    public boolean remarcarAgendamento(int dia, int mes){
        if(!this.status){
            data.setDia(dia);
            data.setMes(mes);
            this.status = true;
            return true;
        }
        return false;           
    }    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHoraInicio() {
        return this.hora;
    }

    public void setHoraInicio(Hora horaInicio) {
        this.hora = horaInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getParticipantes() {
        return this.participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Agendamento:" + "\nnome: " + getNome() + "\ndata: " + getData() + "\nhora: " + getHoraInicio() + "\nduracao: " + getDuracao() + "\nparticipantes: " + getParticipantes() + "\nstatus: " + isStatus();
    }


    
}
