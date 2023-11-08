package br.senai.jandira.sp.model;

public abstract class Voos {

    private String companhia, destino, origem, horarioPartida,dataPartida;
    private int capacidPassageiros, numberVoo;

    public Voos(String companhia,
               String destino,
               String origem,
               String horarioPartida,
               String dataPartida,
               int numberVoo,
               int capacidPassageiros) {
        this.companhia = companhia;
        this.destino = destino;
        this.origem = origem;
        this.horarioPartida = horarioPartida;
        this.dataPartida = dataPartida;
        this.numberVoo = numberVoo;
        this.capacidPassageiros = capacidPassageiros;
    }

    public String exibirTela() {
        return  "Companhia: " + companhia + "\n" +
                "Número do Voo: " + numberVoo + "\n" +
                "Origem: " + origem + "\n" +
                "Destino: " + destino + "\n" +
                "Data de partida: " + dataPartida + "\n" +
                "Horário de partida " + horarioPartida+ "\n" +
                "Capacidade de Passageiros: " + capacidPassageiros;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getHorarioPartida() {
        return horarioPartida;
    }

    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida= dataPartida;
    }

    public int getCapacidPassageiros() {
        return capacidPassageiros;
    }

    public void setCapacidPassageiros(int capacidPassageiros) {
        this.capacidPassageiros = capacidPassageiros;
    }

    public int getNumberVoo() {
        return numberVoo;
    }

    public void setNumberVoo(int numberVoo) {
        this.numberVoo = numberVoo;
    }
}



