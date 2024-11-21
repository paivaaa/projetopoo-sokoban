/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

/**
 * A classe Empty representa uma célula vazia no jogo Sokoban.
 * Ela herda da classe Clear e é usada para representar áreas vazias do mapa.
 * 
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class Empty extends Clear {

    /**
     * O nome padrão da imagem para uma célula vazia.
     */
    public static String empty = "empty.png";

    /**
     * Construtor da classe Empty.
     * Cria uma célula vazia com a imagem padrão.
     */
    public Empty() {
        super(empty);
    }

}
