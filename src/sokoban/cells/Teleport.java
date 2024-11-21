/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban.cells;

/**
 * A classe Teleport representa um teleportador na variante universo no jogo.
 * Ela herda da classe Element e é responsável por representar os teleportadores
 * no jogo.
 *
 * A classe Teleport pode ser utilizada para criar teleportadores que possuem
 * uma posição de destino específica.
 *
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public class Teleport extends Element {

    public static String teleport = "teleport.png";

    private int destX;
    private int destY;
    private int numeroPuzzle = 1;

    /**
     * Construtor padrão da classe Teleport. Cria um teleportador sem uma
     * posição de destino específica.
     */
    public Teleport() {
        super(teleport);
    }

    /**
     * Construtor da classe Teleport. Cria um teleportador com uma posição de
     * destino específica.
     *
     * @param destX A coordenada X do destino do teleportador.
     * @param destY A coordenada Y do destino do teleportador.
     */
    public Teleport(int destX, int destY) {
        this.destX = destX;
        this.destY = destY;
    }

    /**
     * Obtém a coordenada X do destino do teleportador.
     *
     * @return A coordenada X do destino do teleportador.
     */
    public int getDestX() {
        return destX;
    }

    /**
     * Obtém a coordenada Y do destino do teleportador.
     *
     * @return A coordenada Y do destino do teleportador.
     */
    public int getDestY() {
        return destY;
    }

    /**
     * Compara se dois teleportadores são iguais. Dois teleportadores são
     * considerados iguais se possuem a mesma posição de destino e o mesmo
     * número de puzzle associado.
     *
     * @param obj O objeto a ser comparado.
     * @return true se os teleportadores forem iguais, false caso contrário.
     */
    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto é o próprio objeto atual
        if (this == obj) {
            return true;
        }
        // Verifica se o objeto é nulo
        if (obj == null) {
            return false;
        }
        // Verifica se os objetos são da mesma classe
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Faz um cast do objeto para a classe Teleport
        final Teleport other = (Teleport) obj;
        // Compara as coordenadas X
        if (this.destX != other.destX) {
            return false;
        }
        // Compara as coordenadas Y
        if (this.destY != other.destY) {
            return false;
        }
        // Compara o número do puzzle
        return this.numeroPuzzle == other.numeroPuzzle;
    }

}
