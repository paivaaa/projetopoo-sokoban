/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

/**
 * A classe PuzzlesUniverse fornece métodos para obter puzzles para o modo
 * Universe do jogo Sokoban. Cada puzzle é representado como uma string contendo
 * a disposição inicial dos elementos no tabuleiro.
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class PuzzlesUniverse {

    /**
     * Obtém o puzzle para o modo Universe com base no número especificado.
     *
     * @param numeroPuzzle O número do puzzle a ser obtido.
     * @return O puzzle correspondente como uma string, ou null se o número do
     * puzzle for inválido.
     */
    public static String getPuzzleUniverse(int numeroPuzzle) {
        return switch (numeroPuzzle) {
            //::::Nivel Universe::::
            case 1 ->
                getPuzzleUniverse1();
            case 2 ->
                getPuzzleUniverse2();
            case 3 ->
                getPuzzleUniverse3();
            default ->
                null;
        };
    }

    public static String getPuzzleUniverse1() {
        return    "#######BBBBB#######\n"
                + "#t   .#BBBBB#.    #\n"
                + "#     #######   $ #\n"
                + "#*@      D    &   #\n"
                + "#  $ O#######  $  #\n"
                + "#  T  #BBBBB#     #\n"
                + "#######BBBBB#######";
    }

    public static String getPuzzleUniverse2() {
        return "##############\n"
                + "#@$  .#     O#\n"
                + "#    t#   $  #\n"
                + "#######     T#\n"
                + "BBBBBB####D###\n"
                + "BBBBBB#. $   #\n"
                + "BBBBBB########";
    }

    public static String getPuzzleUniverse3() {
        return "##############\n"
                + "#@$  .#     O#\n"
                + "#    t#   $  #\n"
                + "#######     T#\n"
                + "BBBBBB####D###\n"
                + "BBBBBB#. $   #\n"
                + "BBBBBB########";
    }
}
