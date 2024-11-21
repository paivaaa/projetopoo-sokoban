/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

/**
 * A classe Door representa uma porta no jogo Sokoban.
 * Ela herda da classe Element e é usada para bloquear o acesso a certas áreas do jogo.
 * 
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class Door extends Element {

    /**
     * O caminho padrão para a imagem da porta.
     */
    public static String porta = "door.png";

    /**
     * Construtor da classe Door.
     * Cria uma porta com a imagem padrão.
     */
    public Door() {
        super(porta);
    }

}
