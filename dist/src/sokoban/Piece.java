/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sokoban;

import sokoban.cells.Background;
import sokoban.cells.Block;
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
 * Enumeração que representa as diferentes peças do jogo Sokoban.
 * Cada peça é associada a um carácter específico.
 * 
 * @autor Professor António Manso
 * @autor Tiago Paiva
 * @autor Mário Bonacho
 */
public enum Piece {
    WALL('#'),
    PLAYER1('@'),
    PLAYER2('2'),
    PLAYEREDITOR('E'),
    PLAYERGOAL('*'),
    BLOCK('$'),
    GOAL('.'),
    BLOCKGOAL('*'),
    EMPTY(' '),
    TELEPORT('T'),
    TELEPORT2('t'),
    DOOR('D'),
    OPENDOOR('O'),
    SPECIALBLOCK('&'),
    BACKGROUND('B');

    private final char ch;

    private Piece(char ch) {
        this.ch = ch;

    }
    
    /**
     * Devolve o carácter associado à peça.
     * 
     * @return o carácter associado à peça.
     */
    public char getChar() {
        return ch;
    }

    /**
     * Consoante o carácter fornecido, devolve um novo elemento do jogo.
     * 
     * @param ch Carácter associado ao elemento.
     * @return um novo elemento do jogo correspondente ao carácter fornecido.
     */
    public static Element getElement(char ch) {
        if (ch == WALL.ch) {
            return new Wall();
        }
        if (ch == PLAYER1.ch) {
            return new Empty();
        }
        if (ch == PLAYER2.ch) {
            return new Empty();
        }
        if (ch == PLAYEREDITOR.ch) {
            return new Player(1);
        }
        if (ch == EMPTY.ch) {
            return new Empty();
        }
        if (ch == BLOCK.ch) {
            return new Block();
        }
        if (ch == BLOCKGOAL.ch) {
            return new Block(true);
        }
        if (ch == GOAL.ch) {
            return new Goal();
        }
        if (ch == TELEPORT.ch) {
            return new Teleport(0, 0);
        }
        if (ch == TELEPORT2.ch) {
            return new Teleport(0, 0);
        }
        if (ch == DOOR.ch) {
            return new Door();
        }
        if (ch == OPENDOOR.ch) {
            return new OpenDoors();//Usado para abrir a porta
        }
        if (ch == SPECIALBLOCK.ch) {
            return new SpecialBlock();
        }
        if (ch == BACKGROUND.ch) {
            return new Background();
        }

        return new Empty();
    }

     /**
     * Consoante o elemento fornecido, devolve o carácter do jogo correspondente.
     * 
     * @param e Elemento associado ao carácter.
     * @return o carácter do jogo correspondente ao elemento fornecido.
     */
    public static char getChar(Element e) {
        if (e instanceof Wall) {
            return WALL.ch;
        }
        if (e instanceof Block b) {
            if (b.inGoal) {
                return BLOCKGOAL.ch;
            } else {
                return BLOCK.ch;
            }
        }
        if (e instanceof Goal) {
            return GOAL.ch;
        }
        if (e instanceof Teleport) {
            return TELEPORT.ch;
        }
        if (e instanceof Door) {
            return DOOR.ch;
        }
        if (e instanceof OpenDoors) {
            return OPENDOOR.ch;
        }
        if (e instanceof SpecialBlock) {
            return SPECIALBLOCK.ch;
        }
        if (e instanceof Background) {
            return BACKGROUND.ch;
        }
        return EMPTY.ch;
    }

}
