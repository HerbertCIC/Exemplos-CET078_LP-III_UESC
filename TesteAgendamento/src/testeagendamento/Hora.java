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
public class Hora {
    private int horas=0;
    private int minutos=0;
    private int segundos=0;
    private String fuso;

    public void inicializarHora(int horas, int minutos, int segundos) {
        if (verificarHora(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
            this.fuso = "Brasilia";
        } else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
            this.fuso = "Brasilia";
        }
    }

    public static boolean verificarHora(int horas, int minutos, int segundos) {
        if (horas < 0 || horas > 23) {
            return false;
        } else if (minutos < 0 || minutos > 59) {
            return false;
        } else if (segundos < 0 || segundos > 59) {
            return false;
        } else {
            return true;
        }
    }

    private boolean verificarMinhaHora() {
        if (this.horas < 0 || this.horas > 23) {
            return false;
        } else if (this.minutos < 0 || this.minutos > 59) {
            return false;
        } else if (this.segundos < 0 || this.segundos > 59) {
            return false;
        } else {
            return true;
        }
    }

    private int valorFuso() {
        switch (this.fuso) {            
            case "Linha de Data internacional Oeste":
                return -12;
            case "Alasca":
                return -9;
            case "América Central":
                return -6;
            case "Brasilia":
                return -3;
            case "Salvador":
                return -3; 
            case "Kwait":
                return 3;
            case "Astana":
                return 6;
            case "Fiji":
                return 12;    
            default:
                return 0;
        }
    }

    public String getFuso() {
        return this.fuso;
    }

    public void setFuso(String fuso) {
        if (!fuso.equals(this.fuso)) {
            int fusoAnt = valorFuso();
            this.fuso = fuso;
            int fusoAtual = valorFuso();
            //settar pro padrão
            int aux = (getHoras() - fusoAnt);
            if (aux < 0) {
                setHoras(aux + 24);
            } else if (aux > 23) {
                setHoras(aux - 24);
            } else {
                setHoras(aux);
            }
            //settar para o fuso        
            int aux2 = (getHoras() + fusoAtual);
            if (aux2 < 0) {
                setHoras(aux2 + 24);
            } else if (aux2 > 23) {
                setHoras(aux2 - 24);
            } else {
                setHoras(aux2);
            }
        }
    }

    public int getHoras() {
        return horas;
    }

    public boolean setHoras(int horas) {
        this.horas = horas;
        if (!verificarMinhaHora()) {
            this.horas = 0;
            return false;
        }
        return true;
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        this.minutos = minutos;
        if (!verificarMinhaHora()) {
            this.minutos = 0;
            return false;
        }
        return true;
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos(int segundos) {
        this.segundos = segundos;
        if (!verificarMinhaHora()) {
            this.segundos = 0;
            return false;
        }
        return true;
    }
}
