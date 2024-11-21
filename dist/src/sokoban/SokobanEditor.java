/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import sokoban.cells.Player;

/**
 * Classe SokobanEditor que permite editar puzzles do jogo Sokoban.
 * Possui funcionalidades para criar e modificar puzzles através de cliques do rato.
 * 
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public class SokobanEditor extends Sokoban {

    private Piece pecaSelecionada = Piece.EMPTY;  // A peça atualmente selecionada para colocar no mapa

    /**
     * Cria um puzzle padrão para o editor.
     * 
     * @return String representando o puzzle padrão.
     */
    public static String PuzzleDefault() {
        return "               \n"
                + "               \n"
                + "               \n"
                + "         @     \n"
                + "               \n"
                + "               \n"
                + "               ";
    }

    /**
     * Construtor que inicializa o editor com um puzzle especificado.
     * 
     * @param p String representando o puzzle a ser carregado no editor.
     */
    public SokobanEditor(String p) {
        super(p);
    }

    /**
     * Construtor da classe SokobanEditor. Este construtor inicializa o editor
     * com um puzzle padrão e adiciona um ouvinte de rato para tratar os cliques
     * do rato, permitindo a edição do puzzle.
     */
    public SokobanEditor() {
        this(PuzzleDefault());
        SokobanEditor playerEditor = this;

        /**
         * Adiciona um ouvinte de rato que trata dos cliques do rato. Quando o
         * rato é clicado, calcula a célula do puzzle clicada e coloca a peça
         * selecionada nessa célula. Se a peça selecionada for um jogador,
         * atualiza as coordenadas do jogador.
         */
        addMouseListener(new MouseAdapter() {
            /**
             * Método chamado quando o rato é clicado. Calcula a célula clicada
             * no puzzle e coloca a peça selecionada nessa célula. Se a peça
             * selecionada for um jogador, atualiza as coordenadas do jogador.
             *
             * @param e o evento de clique do rato
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                int dimY = getHeight() / world.length;  // Calcular a altura de cada célula
                int dimX = getWidth() / getColumns();  // Calcular a largura de cada célula
                int x = e.getX() / dimX;  // Determinar a coordenada x da célula clicada
                int y = e.getY() / dimY;  // Determinar a coordenada y da célula clicada

                if (x >= 0 && x < getColumns() && y >= 0 && y < world.length) {
                    if (Piece.getElement(pecaSelecionada.getChar()) instanceof Player player) {
                        playerEditor.player = player;
                        playerEditor.player.setCoordX(x);
                        playerEditor.player.setCoordY(y);
                        repaint();
                    } else {
                        world[y][x] = Piece.getElement(pecaSelecionada.getChar());  // Colocar a peça selecionada na célula clicada
                        repaint();
                    }
                }
            }
        });
    }

    /**
     * Definir a peça a ser colocada quando o rato for clicado
     *
     * @param peca - Peça selecionada pelo utilizador
     */
    public void setPecaSelecionada(Piece peca) {
        this.pecaSelecionada = peca;
    }

    /**
     * Pinta os elementos do puzzle
     *
     * @param gr
     * @author Professor António Manso
     */
    @Override
    public void paintComponent(Graphics gr) {
        Color c = new Color(97, 153, 180, 255);
        gr.setColor(c);
        gr.fillRect(0, 0, getWidth(), getHeight());

        int dimY = getHeight() / world.length;
        int dimX = getWidth() / getColumns();

        for (int y = 0; y < world.length; y++) {
            for (int x = 0; x < world[y].length; x++) {
                world[y][x].draw(gr, x, y, dimX, dimY);
            }
        }
        player.draw(gr, player.getCoordX(), player.getCoordY(), dimX, dimY);
    }
}
