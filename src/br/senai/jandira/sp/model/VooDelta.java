package br.senai.jandira.sp.model;

import java.util.Date;

public class VooDelta extends Voos{

        public VooDelta(String companhia, String destino, String origem, String horarioPartida, String dataPartida, int numberVoo, int capacidPassageiros) {
            super ("Delta","Guarulhos", "Viracopos", "19:00", "24/09/22", 221, 95);
        }

        @Override
        public String exibirTela() {
            return "------ Voo Delta -------\n" + super.exibirTela();
        }
    }

