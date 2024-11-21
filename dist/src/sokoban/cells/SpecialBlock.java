/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

import java.awt.Image;

/**
 * A Classe “SpecialBlock” representa um bloco especial no jogo Sokoban, herda a
 * classe “Element” e é responsável por representar um bloco especial com
 * capacidade de empurrar outros blocos.
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class SpecialBlock extends Element {

    public static String greenBlock = "specialBlock.png";
    public static String greenInGoal = "blockInGoal.png";

    private Image imageBlock; // Imagem do bloco especial
    private Image imageBlockGoal; // Imagem do bloco especial em um objetivo

    private boolean inGoal; // Indica se o bloco especial está em um objetivo

    /**
     * Construtor da classe SpecialBlock. Cria um bloco especial, podendo
     * especificar se ele está em um objetivo.
     *
     * @param inGoal Indica se o bloco especial está em um objetivo.
     */
    public SpecialBlock(boolean inGoal) {
        super(inGoal ? greenInGoal : greenBlock);
        this.inGoal = inGoal;
        imageBlock = loadImage(greenBlock);
        imageBlockGoal = loadImage(greenInGoal);
    }

    /**
     * Construtor padrão da classe SpecialBlock. Cria um bloco especial sem
     * especificar se ele está em um objetivo.
     */
    public SpecialBlock() {
        this(false);
    }

    /**
     * Verifica se o bloco especial está em um objetivo.
     *
     * @return true se o bloco especial estiver em um objetivo, false caso
     * contrário.
     */
    public boolean isInGoal() {
        return inGoal;
    }

    /**
     * Define se o bloco especial está em um objetivo.
     *
     * @param inGoal true para indicar que o bloco especial está em um objetivo,
     * false caso contrário.
     */
    public void setInGoal(boolean inGoal) {
        this.inGoal = inGoal;
    }

}
