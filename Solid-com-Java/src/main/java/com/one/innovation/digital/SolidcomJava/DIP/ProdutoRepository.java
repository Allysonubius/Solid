package com.one.innovation.digital.SolidcomJava.DIP;

import java.util.ArrayList;
//impot java.util.List;

public class ProdutoRepository {

    private MySqlConnection mySqlConnection;

    public ProdutoRepository(MySqlConnection mySqlConnection){
        this.mySqlConnection = mySqlConnection;
    }
    //public  List<Produto> buscarProduto(){
        //retorna a lista de produto da base de dados
    //    return new ArrayList<> ();
    //}
    //public void salvarProduto(Produto produto){
        //Salva lista de produtos na base de dados
    //}
}
