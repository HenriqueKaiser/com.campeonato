/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

/**
 *
 * @author Escola
 */
public class Jogador {
    private String jogador;
    private int numeroCamisa;
    private Posicao posicao;

    public Jogador(String jogador, int numeroCamisa, Posicao posicao) {
        this.jogador = jogador;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
    }

    public Jogador() {
    }

    public String getJogador() {
        return jogador;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Jogador{" + "jogador=" + jogador + ", numeroCamisa=" + numeroCamisa + ", posicao=" + posicao + '}';
    }
    
    
}
