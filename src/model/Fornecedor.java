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

    public void setCodigo_fornecedor(String codigo_fornecedor) {
        try {
            this.codigo_fornecedor = Integer.parseInt(codigo_fornecedor);
        } catch (Exception e) {
            this.codigo_fornecedor = 0;
        }
    }

    public int getGarantia_fornecedor() {
        return garantia_fornecedor;
    }

    public void setGarantia_fornecedor(String garantia_fornecedor) {
        try {
            this.garantia_fornecedor = Integer.parseInt(garantia_fornecedor);
        } catch (Exception e) {
            this.garantia_fornecedor = 0;
        }
    }

    public int getSac() {
        return sac;
    }

    public void setSac(String sac) {
        try {
            this.sac = Integer.parseInt(sac);
        } catch (Exception e) {
            this.sac = 0;
        }
    }

    public int getQtdGames() {
        return qtdGames;
    }

    public void setQtdGames(String qtdGames) {
        try {
            this.qtdGames = Integer.parseInt(qtdGames);
        } catch (Exception e) {
            this.qtdGames = 0;
        }
    }
    
    
    
}
