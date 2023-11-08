package br.senai.jandira.sp.model;

import java.util.Date;

public class VooEmirates extends Voos{

    public VooEmirates (String companhia, String destino, String origem, String horarioPartida, String dataPartida, int numberVoo, int capacidPassageiros) {
        super ("Emirates","Bahamas", "Guarulhos", "17:00", "27/12/21", 321, 90);
    }

    @Override
    public String exibirTela() {
        return "------ Voo Emirates-------\n" + super.exibirTela();
    }
}