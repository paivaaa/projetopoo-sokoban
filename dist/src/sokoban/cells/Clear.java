/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

/**
 * A classe abstrata Clear representa uma célula vazia no jogo Sokoban. Ela
 * estende a classe Element e serve como base para outros tipos de células.
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public abstract class Clear extends Element {

    /**
     * Construtor da classe Clear.
     * 
     * @param name Nome da célula.
     */
    public Clear(String name) {
        super(name);
    }

}
