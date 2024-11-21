/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

import java.awt.Graphics;
import java.awt.Image;
import javax.sound.sampled.Clip;
import sokoban.SokobanSons;

/**
 * A classe Block representa um bloco no jogo Sokoban. Pode ser um bloco normal
 * ou um bloco posicionado em um objetivo (goal).
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class Block extends Element {

    public static String greenBlock = "block.png";
    public static String greenInGoal = "blockInGoal.png";

    // Imagem do bloco normal e do bloco em objetivo
    private Image imageBlock;
    private Image imageBlockGoal;

    Clip blockGoal;

    // Indica se o bloco está em um objetivo
    public boolean inGoal;

    /**
     * Construtor da classe Block. Cria um bloco normal se inGoal for falso, ou
     * um bloco em objetivo se inGoal for verdadeiro.
     *
     * @param inGoal Indica se o bloco está em um objetivo.
     */
    public Block(boolean inGoal) {
        super(inGoal ? greenInGoal : greenBlock);
        this.inGoal = inGoal;
        imageBlock = loadImage(greenBlock);
        imageBlockGoal = loadImage(greenInGoal);
        if (inGoal) {
            blockGoal = SokobanSons.carregarSom("src/sokoban/resources/multimedia/BlockInGoal.wav");
            blockGoal.start();
        }

    }

    /**
     * Construtor da classe Block. Cria um bloco normal.
     */
    public Block() {
        this(false);
    }

    /**
     * Desenha o bloco na posição especificada.
     *
     * @param gr Objeto Graphics usado para desenhar o bloco.
     * @param px Coordenada x do bloco.
     * @param py Coordenada y do bloco.
     * @param width Largura do bloco.
     * @param height Altura do bloco.
     */
    @Override
    public void draw(Graphics gr, int px, int py, int width, int height) {
        if (inGoal && imageBlockGoal != null) {
            gr.drawImage(imageBlockGoal, px * width, py * height, width, height, null);
        } else if (!inGoal && imageBlock != null) {
            gr.drawImage(imageBlock, px * width, py * height, width, height, null);
        }
    }

    /**
     * Verifica se o bloco está em um objetivo.
     *
     * @return true se o bloco estiver em um objetivo, false caso contrário.
     */
    public boolean isInGoal() {
        return inGoal;
    }

    /**
     * Define se o bloco está em um objetivo.
     *
     * @param inGoal true para definir o bloco em objetivo, false caso
     * contrário.
     */
    public void setInGoal(boolean inGoal) {
        this.inGoal = inGoal;
        repaint();
    }

}
