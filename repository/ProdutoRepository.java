package repository;

import model.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

    Map<String, Produto> produtoMap = new HashMap<String,Produto>();


    public ProdutoRepository(Map<String, Produto> produtoMap) {
        this.produtoMap = produtoMap;
    }

    public void save(String name, Produto produto){

        Produto p1 = new Produto();

        produtoMap.put(name, p1);

    }

    public String listarProduto(){

        return "retorno da lista de produtos";



    }






}
