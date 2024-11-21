/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

/**
 * A classe OpenDoors representa uma célula de porta aberta no jogo Sokoban.
 * Ela herda da classe Clear e é usada para representar áreas onde as portas estão abertas.
 * 
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class OpenDoors extends Clear {

    /**
     * O nome da imagem para uma célula de porta aberta.
     */
    public static String openDoor = "openDoor.png";

    /**
     * Construtor da classe OpenDoors.
     * Cria uma célula de porta aberta com a imagem padrão.
     */
    public OpenDoors() {
        super(openDoor);
    }

}
