package br.senai.jandira.sp;

import br.senai.jandira.sp.model.VooDelta;
import br.senai.jandira.sp.model.VooEmirates;
import br.senai.jandira.sp.model.VooGol;

public class App {

    public static void main(String[] args) {
        VooDelta vooDelta = new VooDelta("Delta", "Guarulhos", "Viracopos", "19:00", "24/09/22", 221, 95);
        VooEmirates vooEmirates = new VooEmirates("Emirates","Bahamas", "Guarulhos", "17:00", "27/12/21", 321, 90);
        VooGol vooGol = new VooGol ("Gol","Guarulhos", "Rio Grande do Sul", "13:00", "24/09/22", 278, 87);

        System.out.println("-------- Lista de Companhias ----------");
        System.out.println(vooGol.exibirTela());
        System.out.println();
        System.out.println(vooEmirates.exibirTela());
        System.out.println();
        System.out.println(vooDelta.exibirTela());
    }
}

