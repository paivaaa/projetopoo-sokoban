/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

/**
 * A classe PuzzlesMulti fornece métodos para obter puzzles para o modo multiplayer do jogo Sokoban.
 * Cada puzzle é representado como uma string contendo a disposição inicial dos elementos no tabuleiro.
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class PuzzlesMulti {
    
    /**
     * Obtém o puzzle para o modo multiplayer com base no número especificado.
     *
     * @param numeroPuzzle O número do puzzle a ser obtido.
     * @return O puzzle correspondente como uma string, ou null se o número do puzzle for inválido.
     */
    public static String getPuzzleMulti(int numeroPuzzle) {
        //tentar substituir o switch por for.
        return switch (numeroPuzzle) {
            //::::Multiplayer::::
            case 1 -> getPuzzleMulti1();
            case 2 -> getPuzzleMulti2();
            case 3 -> getPuzzleMulti3();
            case 4 -> getPuzzleMulti4();
            case 5 -> getPuzzleMulti5();
            case 6 -> getPuzzleMulti6();
            case 7 -> getPuzzleMulti7();
            case 8 -> getPuzzleMulti8();
            case 9 -> getPuzzleMulti9();
            case 10 -> getPuzzleMulti10();
            case 11 -> getPuzzleMulti11();
            case 12 -> getPuzzleMulti12();
            case 13 -> getPuzzleMulti13();
            case 14 -> getPuzzleMulti14();
            case 15 -> getPuzzleMulti15();
            case 16 -> getPuzzleMulti16();
            case 17 -> getPuzzleMulti17();
            case 18 -> getPuzzleMulti18();
            case 19 -> getPuzzleMulti19();
            case 20 -> getPuzzleMulti20();
             default -> null;
        };
    }
    
    public static String getPuzzleMulti1() {
        return    "B###\n"
                + "#@ .#\n"
                + "##$#\n"
                + "#2 #\n"
                + "B##\n";
    }
    
    public static String getPuzzleMulti2() {
        return    "B###\n"
                + "B#@###\n"
                + "##$  #\n"
                + "#2$ ##\n"
                + "### ##\n"
                + "#   .#\n"
                + "##  .#\n"
                + "B# ###\n"
                + "B###\n";
    }
    
    public static String getPuzzleMulti3() {
        return    "BBBBBB###\n"
                + "####### #\n"
                + "#@$ $ $ ##\n"
                + "#2 .. .  #\n"
                + "##########\n";
    }
    
    public static String getPuzzleMulti4() {
        return    "BB###\n"
                + "### ####\n"
                + "#  .# @#\n"
                + "##  $$ ##\n"
                + " # .# 2 #\n"
                + "##### ###\n"
                + "BBBB###\n";
    }
    
    public static String getPuzzleMulti5() {
        return    "#######\n"
                + "#. @..#\n"
                + "##2#######\n"
                + "# $      #\n"
                + "#   $ $ ##\n"
                + "####### #\n"
                + "BBBBBB###\n";
    }
    
    public static String getPuzzleMulti6() {
       return    " ###\n"
                + "## ###\n"
                + "# @  #\n"
                + "##.#$##\n"
                + "B#    #\n"
                + "B#.# ##\n"
                + "B#2$ #\n"
                + "B### #\n"
                + "BBB###\n";
    }
    
    public static String getPuzzleMulti7() {
        return    "BB###\n"
                + "BB# ###\n"
                + "B##.  #\n"
                + "B# . ###\n"
                + "B#@#   #\n"
                + "##$   ##\n"
                + "#2$ # #\n"
                + "### ###\n"
                + "BB###\n";
    }
    
    public static String getPuzzleMulti8() {
        return    "BBBBB###\n"
                + "######@#\n"
                + "#     $$##\n"
                + "#        #\n"
                + "##$#######\n"
                + "#. ..2#\n"
                + "#     #\n"
                + "## # ##\n"
                + "B#####\n";
    }
    
    public static String getPuzzleMulti9() {
        return    "BBB###\n"
                + "B###@###\n"
                + "## #$$2#\n"
                + "#    $##\n"
                + "#.. # ##\n"
                + "###    #\n"
                + "BB# ####\n"
                + "BB###\n";
    }
    
    public static String getPuzzleMulti10() {
        return    "BBBBB###\n"
                + "######@#\n"
                + "#     $$##\n"
                + "#        #\n"
                + "##$#######\n"
                + "#. ..2#\n"
                + "#     #\n"
                + "## # ##\n"
                + "B#####\n";
    }
    
    public static String getPuzzleMulti11() {
        return    "BBBB#####\n"
                + "BBBB#   #\n"
                + "B#### # #\n"
                + "## ##   #\n"
                + "#   $  ##\n"
                + "##  #  #\n"
                + "B# #####\n"
                + "## @##2#\n"
                + "#    $.#\n"
                + "## ##*.#\n"
                + "B####  #\n"
                + "BBBB####\n";
    }
    
    public static String getPuzzleMulti12() {
        return    "B####\n"
                + "B#  #\n"
                + "##$ #\n"
                + "#@$ ##\n"
                + "## $.#\n"
                + "B#2 .#\n"
                + "B## .#\n"
                + "BB####\n";
    }
    
    public static String getPuzzleMulti13() {
        return    "BB###\n"
                + "### ###\n"
                + "#@$   #\n"
                + "## ...#\n"
                + "B#$ $ #\n"
                + "B#2####\n"
                + "B###\n";
    }
    
    public static String getPuzzleMulti14() {
        return    "BB###\n"
                + "### #######\n"
                + "#  .#  #  #\n"
                + "##     $$@#\n"
                + "B# .# $#  #\n"
                + "B#####2# .#\n"
                + "BBBBB######\n";
    }
    
    public static String getPuzzleMulti15() {
        return    "BBBBBBB###  \n"
                + "BB###### ###\n"
                + "###@# ##.. #\n"
                + "#  $#     ##\n"
                + "##   $$#. #\n"
                + "B#  # 2####\n"
                + "B#######\n";
    }
    
    public static String getPuzzleMulti16() {
        return    "BB####\n"
                + "B##  #\n"
                + "##.$.##\n"
                + "#@$ $2#\n"
                + "##.$.##\n"
                + "B#  ##\n"
                + "B# ##\n"
                + "B###\n";
    }
    
    public static String getPuzzleMulti17() {
        return    "BBBB###\n"
                + "##### ###\n"
                + "#     $ #\n"
                + "##* * . #\n"
                + "B# # ####\n"
                + "B#@ 2#\n"
                + "B#####\n";
    }
    
    public static String getPuzzleMulti18() {
        return    "BBBBB###\n"
                + "B#####@#\n"
                + "##   $$#\n"
                + "#    #2#\n"
                + "## # #$#\n"
                + "# .. . #\n"
                + "## # # ##\n"
                + "B###    #\n"
                + "BBB# ####\n"
                + "BBB###";
    }
    
    public static String getPuzzleMulti19() {
        return    "BBBBBB###\n"
                + "BBBB### #\n"
                + "BB###   ##\n"
                + "### #. . #\n"
                + "#   ## ####\n"
                + "##    $#  #\n"
                + "B#  #  $  ##\n"
                + "B####$##$  #\n"
                + "BB# . .#2###\n"
                + "BB##  @###\n"
                + "BBB# ###\n"
                + "BBB###\n";
    }
    
    public static String getPuzzleMulti20() {
        return    "B###\n"
                + "## ###\n"
                + "# @  #\n"
                + "##.#$##\n"
                + "B#    #\n"
                + "B#.# ##\n"
                + "B#2$ #\n"
                + "B### #\n"
                + "BBB###\n";
    }


}

