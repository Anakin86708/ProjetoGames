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
public class Games {
    private String titulo, plataforma, idiomas, faixa_etaria, conteudo_embalagem, genero;
    private int codigo, codigo_barras, codigo_marca, codigo_fornecedor;
    private double preco, avaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getFaixa_etaria() {
        return faixa_etaria;
    }

    public void setFaixa_etaria(String faixa_etaria) {
        this.faixa_etaria = faixa_etaria;
    }

    public String getConteudo_embalagem() {
        return conteudo_embalagem;
    }

    public void setConteudo_embalagem(String conteudo_embalagem) {
        this.conteudo_embalagem = conteudo_embalagem;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        try {
            this.codigo = Integer.parseInt(codigo);   
        } catch (Exception e) {
            this.codigo = 0;
        }
    }

    public int getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        try {
            this.codigo_barras = Integer.parseInt(codigo_barras);  
        } catch (Exception e) {
            this.codigo_barras = 0;
        }
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        try {
            preco = preco.replace(",", ".");
            this.preco = Double.parseDouble(preco);   
        } catch (Exception e) {
            this.preco = 0.0;
        }
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        try {
            avaliacao = avaliacao.replace(",", ".");
            this.avaliacao = Double.parseDouble(avaliacao);  
        } catch (Exception e) {
            this.avaliacao = 0.0;
        }
    }
    
    
    
}
