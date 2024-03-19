package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void deveEmitirCarteiraVacinacaoDomestico() {
        FabricaAbstrata fabrica = new FabricaAnimalDomestico();
        Animal animal = new Animal(fabrica);
        assertEquals("Carteira de Vacinação - Animal Doméstico", animal.emitirCarteiraVacinacao());
    }

    @Test
    void deveEmitirCarteiraVacinacaoSilvestre() {
        FabricaAbstrata fabrica = new FabricaAnimalSilvestre();
        Animal animal = new Animal(fabrica);
        assertEquals("Carteira de Vacinação - Animal Silvestre", animal.emitirCarteiraVacinacao());
    }

    @Test
    void deveEmitirHistoricoAnimalDomestico() {
        FabricaAbstrata fabrica = new FabricaAnimalDomestico();
        Animal animal = new Animal(fabrica);
        assertEquals("Histórico de Atendimento - Animal Doméstico", animal.emitirHistoricoAnimal());
    }

    @Test
    void deveEmitirHistoricoAnimalSilvestre() {
        FabricaAbstrata fabrica = new FabricaAnimalSilvestre();
        Animal animal = new Animal(fabrica);
        assertEquals("Histórico de Atendimento - Animal Silvestre", animal.emitirHistoricoAnimal());
    }

}