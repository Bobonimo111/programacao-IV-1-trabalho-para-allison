package Application.services;

import Application.entity.EstoqueEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueService {
    private final EstoqueEntity estoqueEntity;

    public EstoqueService(EstoqueEntity estoqueEntity) {
        this.estoqueEntity = estoqueEntity;
    }

    public double calcularValorDeListaDeItens(List<String> listaDeItens) {
        double total = 0;
        for (String item : listaDeItens) {
            total += estoqueEntity.getValueByName(item);
        }
        return total;
    }

}
