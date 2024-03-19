package org.example;

public class FabricaAnimalDomestico implements FabricaAbstrata{

    @Override
    public CarteiraVacinacao createCarteiraVacinacao() {
        return new CarteiraVacinacaoDomestico();
    }

    @Override
    public HistoricoAnimal createHistoricoAnimal() {
        return new HistoricoAnimalDomestico();
    }
}
