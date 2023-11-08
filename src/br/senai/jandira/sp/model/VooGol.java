package br.senai.jandira.sp.model;

public class VooGol extends Voos{

    public VooGol(String companhia, String destino, String origem, String horarioPartida, String dataPartida, int numberVoo, int capacidPassageiros) {
        super ("Gol","Guarulhos", "Rio Grande do Sul", "13:00", "24/09/22", 278, 87);
    }

    @Override
    public String exibirTela() {
        return "------ Voo Gol -------\n" + super.exibirTela();
    }
}




