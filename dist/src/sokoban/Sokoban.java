/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;
import sokoban.cells.Block;
import sokoban.cells.Clear;
import sokoban.cells.Door;
import sokoban.cells.Element;
import sokoban.cells.Empty;
import sokoban.cells.Goal;
import sokoban.cells.OpenDoors;
import sokoban.cells.Player;
import sokoban.cells.SpecialBlock;
import sokoban.cells.Teleport;
import sokoban.cells.Wall;

/**
 * Classe abstrata que define a lógica e a interface do jogo Sokoban.
 *
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public abstract class Sokoban extends JComponent {

    Element[][] world;

    ArrayList<String> undoRedo = new ArrayList<>();
    ArrayList<String> startPuzzle = new ArrayList<>();
    private int undoIndex = -1;

    //Cria os dois jogadores
    public Player player;
    public Player player2;

    //Estatísticas 
    private int empurroes = 0; //Inicializar a contagem das caixas arrastadas a 0:
    private int passos = 0; //Inicializar a contagem dos passos a 0:
    //Teleporte
    private Teleport teleport1;
    private Teleport teleport2;

    /**
     * Construtor padrão da classe Sokoban.
     */
    public Sokoban() {

    }

    /**
     * Construtor que inicializa o jogo com um puzzle específico.
     *
     * @param p O puzzle a ser utilizado.
     */
    public Sokoban(String p) {
        setPuzzle(p);
    }

    /**
     * Altera o puzzle atrvés de uma string
     *
     * @param p novo puzzle
     */
    public void setPuzzle(String p) {
        String lines[] = p.split("\n");
        world = new Element[lines.length][];
        for (int y = 0; y < lines.length; y++) {
            world[y] = new Element[lines[y].length()];
            for (int x = 0; x < lines[y].length(); x++) {
                world[y][x] = Piece.getElement(lines[y].charAt(x));
                if (lines[y].charAt(x) == Piece.PLAYER1.getChar()) {
                    player = new Player(1);
                    player.setCoordY(y);
                    player.setCoordX(x);
                } else if (lines[y].charAt(x) == Piece.PLAYER2.getChar()) {
                    player2 = new Player(2);
                    player2.setCoordY(y);
                    player2.setCoordX(x);
                }
                if (lines[y].charAt(x) == Piece.TELEPORT.getChar()) {
                    teleport1 = new Teleport(x, y);
                    world[y][x] = teleport1;
                } else if (lines[y].charAt(x) == Piece.TELEPORT2.getChar()) {
                    teleport2 = new Teleport(x, y);
                    world[y][x] = teleport2;
                }
            }
        }
        repaint();
    }

    /**
     * Calcula as colunas máximas do puzzle
     *
     * @return num de colunas
     */
    public int getColumns() {
        int max = 0;
        //iterar as linhas
        for (Element[] line : world) {
            max = Math.max(max, line.length);
        }
        return max;
    }

    /**
     * Devolve o puzzle (em formato Array)
     *
     * @return puzzle
     */
    public Element[][] getWorld() {
        return world;
    }

    /**
     * Desenha os componentes do jogo no contexto gráfico fornecido.
     *
     * @param gr O contexto gráfico onde os componentes serão desenhados.
     * @autor Professor António Manso
     */
    @Override
    public void paintComponent(Graphics gr) {
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
     * Define o impacto do movimento do player no mapa
     *
     * @param dx Deslocamento na coordenada x.
     * @param dy Deslocamento na coordenada y.
     * @param player - player selecionado
     */
    public void move(int dx, int dy, Player player) {
        //Cria uma cópia inicial do mapa
        if (startPuzzle.size() < 1) {
            startPuzzle.add(toString());

        }
        int newX = player.getCoordX() + dx;
        int newY = player.getCoordY() + dy;
        if (player2 != null) {
            //Método para os player não se conseguirem sobrepor
            if ((newY == this.player.getCoordY() && newX == this.player.getCoordX())
                    || (newY == this.player2.getCoordY() && newX == this.player2.getCoordX())) {
                return;
            }
        }
        if (world[newY][newX] instanceof Wall) {
            return;
        }
        if (world[newY][newX] instanceof Clear) {
            player.moveXY(dx, dy);
            passos++;
        }
        //:::::::::::ARASTAR UM BLOCO:::::::::::
        if (world[newY][newX] instanceof Block) {
            Block block = (Block) world[newY][newX];
            int bx = newX + dx;
            int by = newY + dy;
            if (world[by][bx] instanceof Empty) {
                world[by][bx] = new Block();
                if (block.isInGoal()) {
                    world[newY][newX] = new Goal();
                } else {
                    world[newY][newX] = new Empty();
                }
                player.moveXY(dx, dy);
                passos++;
                empurroes++;
            } else if (world[by][bx] instanceof Goal) {
                world[by][bx] = new Block(true);
                if (block.isInGoal()) {
                    world[newY][newX] = new Goal();
                } else {
                    world[newY][newX] = new Empty();
                }
                player.moveXY(dx, dy);
                passos++;
                empurroes++;
            }
            //:::::::::::Abrir porta:::::::::::
            if (world[by][bx] instanceof OpenDoors) {
                world[by][bx] = new Block(true);
                removeDoor();
                if (block.isInGoal()) {
                    world[newY][newX] = new Goal();
                } else {
                    world[newY][newX] = new Empty();

                }
                player.moveXY(dx, dy);
                passos++;
            }
        }
        //:::::::::::Teleport:::::::::::
        if (world[newY][newX] instanceof Teleport) {

            Teleport teleport = (Teleport) world[newY][newX];

            if (teleport.equals(this.teleport1)) {
                player.setCoordX(teleport2.getDestX());
                player.setCoordY(teleport2.getDestY());
                passos++;
            } else if (teleport.equals(this.teleport2)) {
                player.setCoordX(teleport1.getDestX());
                player.setCoordY(teleport1.getDestY());
                passos++;
            }
        }
        //:::::::::::Bloco especial:::::::::::
        if (world[newY][newX] instanceof SpecialBlock) {
            SpecialBlock specialBlock = (SpecialBlock) world[newY][newX];
            int bx = newX + dx;
            int by = newY + dy;
            if (world[by][bx] instanceof Empty || world[by][bx] instanceof Goal) {
                world[by][bx] = specialBlock; // Limpa a posição anterior do bloco especial
                world[newY][newX] = new Empty();
                player.moveXY(dx, dy);
                passos++;
            } else if (world[by][bx] instanceof Block || world[by][bx] instanceof SpecialBlock) {
                // Se o bloco especial encontrar outro bloco especial ou um bloco normal, tenta empurrá-lo
                int nextBx = bx + dx;
                int nextBy = by + dy;
                if (world[nextBy][nextBx] instanceof Empty || world[nextBy][nextBx] instanceof Goal) {
                    world[nextBy][nextBx] = world[by][bx]; // Se a próxima posição estiver vazia, move ambos os blocos
                    world[by][bx] = specialBlock;
                    world[newY][newX] = new Empty(); // Limpa a posição anterior do bloco especial
                    player.moveXY(dx, dy);
                    passos++;
                    empurroes++;
                }
            }
        }

        // Método para atualizar a lista de estados "undoRedo" para operações de "undo" e "redo".
        // Remove estados de "redo" inválidos após um "undo" seguido de uma nova ação
        if (undoIndex + 1 < undoRedo.size()) {
            for (int i = undoRedo.size() - 1; i >= undoIndex + 1; i--) {
                undoRedo.remove(i);
            }
            undoIndex = undoRedo.size() - 1;
        }
        undoRedo.add(toString());
        undoIndex++;
        //redesenhar
        repaint();
    }

    /**
     * Define o movimento do player
     *
     * @param dx Deslocamento na coordenada x.
     * @param dy Deslocamento na coordenada y.
     * @param playerNumber - número do player selecionado
     */
    public void movePlayer(int dx, int dy, int playerNumber) {
        if (playerNumber == 1) {
            move(dx, dy, player);
        } else if (playerNumber == 2) {
            move(dx, dy, player2);
        }
    }

    /**
     * Verifica se o jogador completou o puzzle.
     *
     * @return True se o puzzle está completo, false caso contrário.
     */
    public boolean isComplete() {
        for (int linhas = 0; linhas < world.length; linhas++) {
            for (int colunas = 0; colunas < world[linhas].length; colunas++) {
                // Verifica se o elemento na posição atual é um bloco
                if (world[linhas][colunas] instanceof Block) {
                    Block block = (Block) world[linhas][colunas]; // Converte o elemento em um objeto Block para verificar se está sobre um objetivo
                    if (!block.isInGoal()) {  // Se o bloco não estiver sobre um objetivo, o jogo não está completo
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * Método para passar Puzzle de array para string:
     *
     * @author Professor António Manso
     * @author Tiago Paiva
     * @author Mário Bonacho
     * @return Puzzle em string
     */
    public String toString() {
        StringBuilder txt = new StringBuilder();
        for (int y = 0; y < world.length; y++) {
            for (int x = 0; x < world[y].length; x++) {
                if (y == player.getCoordY() && x == player.getCoordX()) {
                    if (world[y][x] instanceof Goal) {
                        txt.append(Piece.PLAYERGOAL.getChar());
                    } else {
                        txt.append(Piece.PLAYER1.getChar());
                    }
                } else if (player2 != null && y == player2.getCoordY() && x == player2.getCoordX()) {
                    if (world[y][x] instanceof Goal) {
                        txt.append(Piece.PLAYERGOAL.getChar());
                    } else {
                        txt.append(Piece.PLAYER2.getChar());
                    }

                } else {
                    txt.append(Piece.getChar(world[y][x]));
                }
            }

            txt.append("\n");
        }
        return txt.toString();
    }

    /**
     * Retorna o último movimento
     *
     * @param level - define o numero do puzzle
     */
    public void undo(int level) {
        //Se os movimentos do player for 0 retorna o puzzle inicial
        if (undoIndex == 0) {
            String start = startPuzzle.get(0); //String do puzzle inicial
            setPuzzle(start);
            undoIndex--;
        }
        //Se os movimentos do player > 0 remove o valor ao último movimento e retorna a posição do array indicada pelo movimento 
        if (undoIndex > 0) {
            undoIndex--;
            String last = undoRedo.get(undoIndex);
            setPuzzle(last);
            passos--;
        }
        repaint();
    }

    /**
     * Recupera o último movimento
     */
    public void redo() {
        // Se o num de movimentos for < que o tamanho do array-1 adiciona o valor ao movimento   
        if (undoIndex < undoRedo.size() - 1) {
            undoIndex++;
            String next = undoRedo.get(undoIndex);
            setPuzzle(next);
            passos++;
        }
        repaint();
    }

    /**
     * Método para apagar o puzzle quando o user muda de nivel
     */
    public void apagarPuzzle() {
        for (int y = 0; y < world.length; y++) {
            for (int x = 0; x < world[y].length; x++) {
                world[y][x] = new Empty();
            }
        }
        repaint();
    }

    /**
     * Metodo para remover a porta(Quando o utilizador cumprir o objetivo)
     */
    public void removeDoor() {
        for (int y = 0; y < world.length; y++) {
            for (int x = 0; x < world[y].length; x++) {
                if (world[y][x] instanceof Door) {
                    world[y][x] = new Empty();
                    repaint();
                    return;
                }
            }
        }
    }

    /**
     * Retorna o valor das caixas empurradas a 0
     */
    public void resetEmpurroes() {
        empurroes = 0;
    }

    /**
     * Retorna o número de passos a 0
     */
    public void resetPassos() {
        passos = 0;
    }

    /**
     * Limpa os valores dos passos e dos empurrões
     */
    public void restartStatistics() {
        resetPassos();
        resetEmpurroes();
    }

    /**
     * Limpa todas as posições dos arrays
     */
    public void restartArray() {
        undoRedo.clear();
        startPuzzle.clear();
        undoIndex = -1;
    }

    public int getEmpurroes() {
        return empurroes;
    }

    public int getPassos() {
        return passos;
    }
}
