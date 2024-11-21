/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

/**
 * A classe Goal representa uma célula de objetivo no jogo Sokoban.
 * Ela herda da classe Clear e é usada para representar as áreas onde os blocos devem ser movidos.
 * 
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class Goal extends Clear {

    /**
     * O nome da imagem para uma célula de objetivo.
     */
    public static String goal = "goal.png";

    /**
     * Construtor da classe Goal.
     * Cria uma célula de objetivo com a imagem padrão.
     */

    public Goal() {
        super(goal);
    }

}
