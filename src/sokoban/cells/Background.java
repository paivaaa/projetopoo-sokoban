/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A classe Background representa um elemento de fundo no jogo Sokoban.
 * Este elemento é usado para preencher o fundo de uma célula no tabuleiro.
 * 
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class Background extends Element {

    private static final Color color = new Color(97, 153, 180, 255);

    /**
     * Desenha o elemento de fundo.
     * 
     * @param gr Objeto Graphics usado para desenhar o elemento.
     * @param px Coordenada x do elemento.
     * @param py Coordenada y do elemento.
     * @param width Largura do elemento.
     * @param height Altura do elemento.
     */
    @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
        gr.setColor(color);
        gr.fillRect(px * width, py * height, width, height);
    }

}
