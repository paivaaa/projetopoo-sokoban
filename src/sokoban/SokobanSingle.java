/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

import java.awt.Graphics;
/**
 * Classe que representa a variante single do jogo Sokoban.
 * 
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public class SokobanSingle extends Sokoban {
  
    /**
     * Construtor padrão que inicializa o jogo.
     */
    public SokobanSingle() {
        this(PuzzlesSingle.getPuzzleSingle1());
    }

    /**
     * Construtor que inicializa o jogo com um puzzle específico.
     * 
     * @param p O puzzle a ser utilizado.
     */
    public SokobanSingle(String p) {
        super(p);
    }
    
    /**
     * Desenha os componentes do jogo no contexto gráfico fornecido.
     * 
     * @param gr O contexto gráfico onde os componentes serão desenhados.
     */
    @Override
    public void paintComponent(Graphics gr) {
        int dimY = getHeight() / world.length;
        int dimX = getWidth() / getColumns();

        for (int y = 0; y < world.length; y++) {
            for (int x = 0; x < world[y].length; x++) {
                world[y][x].draw(gr, x, y, dimX, dimY);
            }
        }
        player.draw(gr, player.getCoordX(), player.getCoordY(), dimX, dimY);
    }
    
    /**
     * Move o jogador especificado por (dx, dy).
     * 
     * @param dx Deslocamento na coordenada x.
     * @param dy Deslocamento na coordenada y.
     * @param playerNumber O número do jogador a ser movido (sempre 1, já que é um jogo para um jogador).
     */
    public void movePlayer(int dx, int dy, int playerNumber) {
        if (playerNumber == 1) {
        super.move(dx, dy, player);
        } 
    }
}
