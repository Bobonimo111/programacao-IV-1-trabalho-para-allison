package Application.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueService {
    private Map<String,Double> estoque;
    public EstoqueService(){
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
