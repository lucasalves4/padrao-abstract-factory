package org.example;

public class FabricaAnimalSilvestre implements FabricaAbstrata{

    @Override
    public CarteiraVacinacao createCarteiraVacinacao() {
        return new CarteiraVacinacaoSilvestre();
    }

    @Override
    public HistoricoAnimal createHistoricoAnimal() {
        return new HistoricoAnimalSilvestre();
    }
}
