/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

import javax.sound.sampled.Clip;
import sokoban.SokobanSons;

/**
 * A classe Player representa um jogador no jogo Sokoban. Ela herda da classe
 * Element e é responsável por gerenciar a posição e os movimentos do jogador.
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class Player extends Element {

    private int coordX; // Coordenada X do jogador
    private int coordY; // Coordenada Y do jogador
    private final int playerNumber; // Número do jogador

    Clip move;

    private static final String PLAYER1 = "player1.png";
    private static final String PLAYER2 = "player2.png";

    /**
     * Construtor da classe Player. Cria um jogador com o número especificado.
     *
     * @param playerNumber O número do jogador (1 ou 2).
     */
    public Player(int playerNumber) {
        super(playerNumber == 1 ? PLAYER1 : PLAYER2);
        this.playerNumber = playerNumber;
    }

    /**
     * Move o jogador na direção especificada.
     *
     * @param dx Coordenada X.
     * @param dy Coordenada Y.
     */
    public void moveXY(int dx, int dy) {
        coordX += dx;
        coordY += dy;
        this.myImg = loadImage("player" + playerNumber + dx + dy + ".png");
        move = SokobanSons.carregarSom("src/sokoban/resources/multimedia/move.wav");
        move.start();
    }

    /**
     * Obtém a coordenada X do jogador.
     *
     * @return A coordenada X do jogador.
     */
    public int getCoordX() {
        return coordX;
    }

    /**
     * Define a coordenada X do jogador.
     *
     * @param coordX A nova coordenada X do jogador.
     */
    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    /**
     * Obtém a coordenada Y do jogador.
     *
     * @return A coordenada Y do jogador.
     */
    public int getCoordY() {
        return coordY;
    }

    /**
     * Define a coordenada Y do jogador.
     *
     * @param coordY A nova coordenada Y do jogador.
     */
    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

}
