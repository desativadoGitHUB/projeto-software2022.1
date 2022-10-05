package repository;

import model.Lote;
import model.Produto;

import java.util.HashMap;
import java.util.Map;

public class LoteRepository {

    Map<String, Lote> loteMap = new HashMap<String,Lote>();


    public LoteRepository(Map<String, Lote> loteMap) {
        this.loteMap = loteMap;
    }

    public void saveOneProduct(String name, Lote lote){
        loteMap.put(name, lote);
    }

    public String findAllProduct(){
        String myList = "";
        for(int i = 1; i <= loteMap.size(); i++){
            myList += loteMap.get(i);
        }
        return myList;


    }




}
