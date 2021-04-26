/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Herbert Nascimento
 */
public class Data {

    private int dia = 1;
    private int mes = 1;
    private int ano = 1980;

    public void inicializaData(int dia, int mes, int ano) {
        if (verificarData(dia, mes, ano)) {
            this.dia = dia;
            this.ano = ano;
            this.mes = mes;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1980;
        }
    }

    public int getDia() {
        //return this.dia;
        return dia;
    }

    public int getMes() {
        //return this.mes;
        return mes;
    }

    public int getAno() {
        //return this.ano;
        return ano;
    }

    private boolean verificarMinhaData() {
        if (this.dia < 1 || this.dia > 31) {
            return false;
        } else if (this.mes < 1 || this.mes > 12) {
            return false;
        }
        return true;
    }

    static public boolean verificarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            return false;
        } else if (mes < 1 || mes > 12) {
            return false;
        }
        return true;
    }

    public boolean setDia(int dia) {

        int diaAtual = this.dia;
        this.dia = dia;
        if (!verificarMinhaData()) {
            this.dia = diaAtual;
            return false;
        }
        return true;
    }

    public boolean setMes(int mes) {
        this.mes = mes;
        if (!verificarMinhaData()) {
            this.mes = 1;
            return false;
        }
        return true;
    }

    public boolean setAno(int ano) {
        this.ano = ano;
        if (!verificarMinhaData()) {
            this.ano = 1980;
            return false;
        }
        return true;
    }
}
