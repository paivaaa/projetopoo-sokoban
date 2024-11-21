/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

/**
 * A classe Wall representa uma parede no jogo Sokoban. Ela herda da classe
 * Element e é responsável por representar as paredes no jogo.
 *
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public class Wall extends Element {

    public static String wall = "wall.png";

    /**
     * Construtor padrão da classe Wall.
     * Cria uma parede utilizando o nome padrão da imagem.
     */
    public Wall() {
        super(wall);
    }

}
