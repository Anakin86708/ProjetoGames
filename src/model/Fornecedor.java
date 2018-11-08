/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ariel
 */
public class Fornecedor {
    private String fornecedor, cidade, ceo ;
    private int codigo_fornecedor, garantia_fornecedor, sac, qtdGames;

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getCodigo_fornecedor() {
        return codigo_fornecedor;
    }

    public void setCodigo_fornecedor(int codigo_fornecedor) {
        this.codigo_fornecedor = codigo_fornecedor;
    }

    public int getGarantia_fornecedor() {
        return garantia_fornecedor;
    }

    public void setGarantia_fornecedor(int garantia_fornecedor) {
        this.garantia_fornecedor = garantia_fornecedor;
    }

    public int getSac() {
        return sac;
    }

    public void setSac(int sac) {
        this.sac = sac;
    }

    public int getQtdGames() {
        return qtdGames;
    }

    public void setQtdGames(int qtdGames) {
        this.qtdGames = qtdGames;
    }
    
    
    
}
