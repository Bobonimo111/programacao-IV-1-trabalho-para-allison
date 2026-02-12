package Application.entity;

import java.util.HashMap;
import java.util.Map;

public class EstoqueEntity {
    private Map<String,Double> estoque;

    public EstoqueEntity(){
        this.estoque = new HashMap<String,Double>();
        this.populate();
    }

    private void populate(){
        this.estoque.put("sandalia",25.0);
        this.estoque.put("pirulito",1.0);
    }

    public double getValueByName(String item){
        return this.estoque.get(item);
    }

}
