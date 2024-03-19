package org.example;

public class Animal {

    private CarteiraVacinacao carteiraVacinacao;
    private HistoricoAnimal historicoAnimal;

    public Animal (FabricaAbstrata fabrica) {
        this.carteiraVacinacao = fabrica.createCarteiraVacinacao();
        this.historicoAnimal = fabrica.createHistoricoAnimal();
    }

    public String emitirCarteiraVacinacao() {
        return this.carteiraVacinacao.emitir();
    }

    public String emitirHistoricoAnimal() {
        return this.historicoAnimal.emitir();
    }
}
