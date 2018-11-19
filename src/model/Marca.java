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
public class Marca {
    private String marca, cidade;
    private int codigo_marca, telefone, qtdGames;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodigo_marca() {
        return codigo_marca;
    }

    public void setCodigo_marca(String codigo_marca) {
        try {
            this.codigo_marca = Integer.parseInt(codigo_marca);
        } catch (Exception e) {
            this.codigo_marca = 0;
        }
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        try {
            this.telefone = Integer.parseInt(telefone);
        } catch (Exception e) {
            this.telefone = 0;
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
