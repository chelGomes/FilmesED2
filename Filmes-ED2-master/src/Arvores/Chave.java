/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvores;

/**
 *
 * @author miche
 */
public class Chave {
    private int idUsuario;
    private int idFilme;
    private double avaliacao;
    private int id;

    /**
     * Contrutor da classe
     */
    public Chave() {
    }

    /**
     * Construtor da classe
     * @param avaliacao
     * @param idFilme
     * @param idUsuario
     * @param id
     * 
     */
    public Chave(int idUsuario, int idFilme, double avaliacao) {
        this.idUsuario = idUsuario;
        this.idFilme = idFilme;
        this.avaliacao = avaliacao;
        this.id = -1;
    }

    /**
     * Construtor da Classe
     * @param avaliacao
     * @param idFilme
     * @param idUsuario
     * @param id 
     */
    public Chave(int idUsuario,int idFilme, double avaliacao,int id){
        this.idUsuario = idUsuario;
        this.idFilme = idFilme;
        this.avaliacao = avaliacao;
        this.id = id;
    }

    /**
     * Retorna o idUsuario
     * @return idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Altera o idUsuario
     * @param idUsuario 
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Retorna o idFilme
     * @return idFilme
     */
    public int getIdFilme() {
        return idFilme;
    }

    /**
     * Altera o idFilme
     * @param idFilme 
     */
    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    /**
     * Retona a avaliacao
     * @return avaliacao
     */
    public double getAvaliacao() {
        return avaliacao;
    }

    /**
     * Altera a avaliacao
     * @param avaliacao 
     */
    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
