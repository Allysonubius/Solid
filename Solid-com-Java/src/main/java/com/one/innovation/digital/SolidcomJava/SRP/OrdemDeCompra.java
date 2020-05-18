package com.one.innovation.digital.SolidcomJava.SRP;

import java.util.ArrayList;
import java.util.List;
/*
* CLASSE ORDEM DE COMPRA
*
*/
public class OrdemDeCompra {

    public final List<Produto> produtos = new ArrayList<> ();

    public void adicionarProduto(Produto produto) {
        produtos.add (produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove ( produto);
    }

    public void calcularTotal() {
        //return produtos.stream()
        //        .map(Produto::getValor)
        //        .reduce(BigDecimal.ZERO , BigDecimal::add);
    }
    /*
    *
    * CLASSE ORDEM DE COMPRA REPOSITORY
    *
    */
    public List<OrdemDeCompra> buscarOrdemDeCompra() {
        //Retornar a lista de ordens de compra da base de dados
    return new ArrayList<>();
    }
    public void alterarOrdemDeCompra(){
        //Alterar na base dados
    }
    public void salvarOrdemDeCompra(){
        //Salvar lista de produtos na base de dados
    }

    /*
    *
    *
    *CLASSE ORDEM DE COMPRA MAIL
    *
    */
    public void enviarEmail(String email){
        //Envia email da ordem de compra
    }
    public void imprimirOrdemDeCompra(){
        //Imprime a ordem de compra
    }
    /*
    *
    *
    *CLASSE ORDEM DE COMPRA PRINT
    *
    */
    public void imprimirOrdemDeCompra(OrdemDeCompra ordemDeCompra){
        //Imprime a ordem de compra
        }
}

