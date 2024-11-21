/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import static sokoban.SokobanEditor.PuzzleDefault;

/**
 * Classe que permite carregar, visualizar e manipular puzzles
 * do jogo Sokoban.
 *
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public class SokobanPlayEditor extends Sokoban {

    /**
     * Construtor padrão que inicializa o editor com um puzzle padrão.
     */
    public SokobanPlayEditor() {
        this(PuzzleDefault());
    }

    /**
     * Construtor que inicializa o editor com um puzzle especificado.
     *
     * @param p String representando o puzzle a ser carregado no editor.
     */
    public SokobanPlayEditor(String p) {
        super(p);
    }

    /**
     * Desenha os componentes do jogo no contexto gráfico fornecido.
     *
     * @param gr O contexto gráfico onde os componentes serão desenhados.
     * @autor Professor António Manso
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

    /**
     * Define o movimento do player
     *
     * @param dx Deslocamento na coordenada x.
     * @param dy Deslocamento na coordenada y.
     * @param playerNumber Número do jogador (1 neste caso).
     */
    public void movePlayer(int dx, int dy, int playerNumber) {
        if (playerNumber == 1) {
            super.move(dx, dy, player);
        }
    }

    /**
     * Método responsável por carregar um puzzle a partir de um ficheiro.
     *
     * @return String representando o conteúdo do puzzle carregado ou null em
     * caso de erro ou se nenhum ficheiro for selecionado.
     */
    public String loadFromFile() {
        final JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File("./PuzzlesEditor"));
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            StringBuilder sb = new StringBuilder();

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                return sb.toString(); // Retorna o conteúdo do puzzle como uma string.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null; // Retorna null em caso de erro ou se nenhum ficheiro for selecionado.
    }

}
