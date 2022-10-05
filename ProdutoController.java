package controller;

import model.Produto;
import repository.ProdutoRepository;
// Não pode ter lógica aqui :)

public class ProdutoController {

    private ProdutoRepository myProductRepository;

    public void criarProduto(String name, Produto produto){
        myProductRepository.save(name, produto);
    }

    public String listarProduto() {
        return myProductRepository.listarProduto();
    }



}
