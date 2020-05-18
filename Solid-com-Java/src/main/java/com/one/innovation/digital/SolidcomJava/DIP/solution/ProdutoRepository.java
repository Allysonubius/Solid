package com.one.innovation.digital.SolidcomJava.DIP.solution;

import com.one.innovation.digital.SolidcomJava.SRP.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private DbConnection dbConnection;
    public  ProdutoRepository(DbConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    public List buscarProduto(){
        //Retorna a lista de produto da base de dados
        return new ArrayList ();
    }
    public void salvarProduto(Produto produto){
        //Salva lista de produtos na base de dados
    }
}
