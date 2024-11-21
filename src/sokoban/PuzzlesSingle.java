/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokoban;

/**
 * A classe PuzzlesSingle fornece métodos para obter puzzles para o modo
 * singleplayer do jogo Sokoban. Cada puzzle é representado como uma string
 * contendo a disposição inicial dos elementos no tabuleiro.
 *
 * @author Tiago Paiva
 * @author Mário Bonacho
 */
public class PuzzlesSingle {

    /**
     * Obtém o puzzle para o modo singleplayer com base no número especificado.
     *
     * @param numeroPuzzle O número do puzzle a ser obtido.
     * @return O puzzle correspondente como uma string, ou null se o número do
     * puzzle for inválido.
     */
    public static String getPuzzleSingle(int numeroPuzzle) {
        //tentar substituir o switch por for.
        return switch (numeroPuzzle) {
            //::::Nivel Fácil::::
            case 1 ->
                getPuzzleSingle1();
            case 2 ->
                getPuzzleSingle2();
            case 3 ->
                getPuzzleSingle3();
            case 4 ->
                getPuzzleSingle4();
            case 5 ->
                getPuzzleSingle5();
            case 6 ->
                getPuzzleSingle6();
            case 7 ->
                getPuzzleSingle7();
            case 8 ->
                getPuzzleSingle8();
            case 9 ->
                getPuzzleSingle9();
            case 10 ->
                getPuzzleSingle10();
            case 11 ->
                getPuzzleSingle11();
            case 12 ->
                getPuzzleSingle12();
            case 13 ->
                getPuzzleSingle13();
            case 14 ->
                getPuzzleSingle14();
            case 15 ->
                getPuzzleSingle15();
            case 16 ->
                getPuzzleSingle16();
            case 17 ->
                getPuzzleSingle17();
            case 18 ->
                getPuzzleSingle18();
            case 19 ->
                getPuzzleSingle19();
            case 20 ->
                getPuzzleSingle20();
            //::::Nivel Médio::::
            case 21 ->
                getPuzzleSingle21();
            case 22 ->
                getPuzzleSingle22();
            case 23 ->
                getPuzzleSingle23();
            case 24 ->
                getPuzzleSingle24();
            case 25 ->
                getPuzzleSingle25();
            case 26 ->
                getPuzzleSingle26();
            case 27 ->
                getPuzzleSingle27();
            case 28 ->
                getPuzzleSingle28();
            case 29 ->
                getPuzzleSingle29();
            case 30 ->
                getPuzzleSingle30();
            case 31 ->
                getPuzzleSingle31();
            case 32 ->
                getPuzzleSingle32();
            case 33 ->
                getPuzzleSingle33();
            case 34 ->
                getPuzzleSingle34();
            case 35 ->
                getPuzzleSingle35();
            case 36 ->
                getPuzzleSingle36();
            case 37 ->
                getPuzzleSingle37();
            case 38 ->
                getPuzzleSingle38();
            case 39 ->
                getPuzzleSingle39();
            case 40 ->
                getPuzzleSingle40();
            //::::Nivel Dificil::::
            case 41 ->
                getPuzzleSingle41();
            case 42 ->
                getPuzzleSingle42();
            case 43 ->
                getPuzzleSingle43();
            case 44 ->
                getPuzzleSingle44();
            case 45 ->
                getPuzzleSingle45();
            case 46 ->
                getPuzzleSingle46();
            case 47 ->
                getPuzzleSingle47();
            case 48 ->
                getPuzzleSingle48();
            case 49 ->
                getPuzzleSingle49();
            case 50 ->
                getPuzzleSingle50();
            case 51 ->
                getPuzzleSingle51();
            case 52 ->
                getPuzzleSingle52();
            case 53 ->
                getPuzzleSingle53();
            case 54 ->
                getPuzzleSingle54();
            case 55 ->
                getPuzzleSingle55();
            case 56 ->
                getPuzzleSingle56();
            case 57 ->
                getPuzzleSingle57();
            case 58 ->
                getPuzzleSingle58();
            case 59 ->
                getPuzzleSingle59();
            case 60 ->
                getPuzzleSingle60();
            default ->
                null;
        };

    }

//:::::::Puzzles modo singleplayer:::::::
    //:::Nivel fácil:::
    public static String getPuzzleSingle1() {
        return "####\n"
                + "# .#\n"
                + "#  ###\n"
                + "#*@  #\n"
                + "#  $ #\n"
                + "#    #\n"
                + "######";
    }

    public static String getPuzzleSingle2() {
        return "############\n"
                + "#..  #     ###\n"
                + "#..  # $  $  #\n"
                + "#..  #$####  #\n"
                + "#..    @ ##  #\n"
                + "#..  # #  $ ##\n"
                + "###### ##$ $ #\n"
                + "BB# $  $ $ $ #\n"
                + "BB#    #     #\n"
                + "BB############\n";
    }

    public static String getPuzzleSingle3() {
        return "BBBBBBBB########\n"
                + "BBBBBBBB#     @#\n"
                + "BBBBBBBB# $#$ ##\n"
                + "BBBBBBBB# $  $#\n"
                + "BBBBBBBB##$ $ #\n"
                + "######### $ # ###\n"
                + "#....  ## $  $  #\n"
                + "##...    $  $   #\n"
                + "#....  ##########\n"
                + "########\n";
    }

    public static String getPuzzleSingle4() {
        return "BBBBBBBBBBB########\n"
                + "BBBBBBBBBBB#  ....#\n"
                + "############  ....#\n"
                + "#    #  $ $   ....#\n"
                + "# $$$#$  $ #  ....#\n"
                + "#  $     $ #  ....#\n"
                + "# $$ #$ $ $########\n"
                + "#  $ #     #\n"
                + "## #########\n"
                + "#    #    #\n"
                + "#     $   ##\n"
                + "#  $$#$$  @#\n"
                + "#    #    ##\n"
                + "###########\n";
    }

    public static String getPuzzleSingle5() {
        return "BBBBBBBB#####\n"
                + "BBBBBBBB#   #####\n"
                + "BBBBBBBB# #$##  #\n"
                + "BBBBBBBB#     $ #\n"
                + "######### ###   #\n"
                + "#....  ## $  $###\n"
                + "#....    $ $$ ##\n"
                + "#....  ##$  $ @#\n"
                + "#########  $  ##\n"
                + "BBBBBBBB# $ $  #\n"
                + "BBBBBBBB### ## #\n"
                + "BBBBBBBBBB#    #\n"
                + "BBBBBBBBBB######\n";
    }

    public static String getPuzzleSingle6() {
        return "######  ###\n"
                + "#..  # ##@##\n"
                + "#..  ###   #\n"
                + "#..     $$ #\n"
                + "#..  # # $ #\n"
                + "#..### # $ #\n"
                + "#### $ #$  #\n"
                + "BBB#  $# $ #\n"
                + "BBB# $  $  #\n"
                + "BBB#  ##   #\n"
                + "BBB#########\n";
    }

    public static String getPuzzleSingle7() {
        return "BBBBBBB#####\n"
                + "B#######   ##\n"
                + "## # @## $$ #\n"
                + "#    $      #\n"
                + "#  $  ###   #\n"
                + "### #####$###\n"
                + "# $  ### ..#\n"
                + "# $ $ $ ...#\n"
                + "#    ###...#\n"
                + "# $$ # #...#\n"
                + "#  ### #####\n"
                + "####\n";
    }

    public static String getPuzzleSingle8() {
        return "BB####\n"
                + "BB#  ###########\n"
                + "BB#    $   $ $ #\n"
                + "BB# $# $ #  $  #\n"
                + "BB#  $ $  #    #\n"
                + "### $# #  #### #\n"
                + "#@#$ $ $  ##   #\n"
                + "#    $ #$#   # #\n"
                + "#   $    $ $ $ #\n"
                + "#####  #########\n"
                + "BB#      #\n"
                + "BB#      #\n"
                + "BB#......#\n"
                + "BB#......#\n"
                + "BB#......#\n"
                + "BB########\n";
    }

    public static String getPuzzleSingle9() {
        return "BBBBBBBBBB#######\n"
                + "BBBBBBBBBB#  ...#\n"
                + "BBBBBB#####  ...#\n"
                + "BBBBBB#      . .#\n"
                + "BBBBBB#  ##  ...#\n"
                + "BBBBBB## ##  ...#\n"
                + "BBBBB### ########\n"
                + "BBBBB# $$$ ##\n"
                + "B#####  $ $ #####\n"
                + "##   #$ $   #   #\n"
                + "#@ $  $    $  $ #\n"
                + "###### $$ $ #####\n"
                + "BBBBB#      #\n"
                + "BBBBB########\n";
    }

    public static String getPuzzleSingle10() {
        return "B###BB#############\n"
                + "##@####       #   #\n"
                + "# $$   $$  $ $ ...#\n"
                + "#  $$$#    $  #...#\n"
                + "# $   # $$ $$ #...#\n"
                + "###   #  $    #...#\n"
                + "#     # $ $ $ #...#\n"
                + "#    ###### ###...#\n"
                + "## #  #  $ $  #...#\n"
                + "#  ## # $$ $ $##..#\n"
                + "# ..# #  $      #.#\n"
                + "# ..# # $$$ $$$ #.#\n"
                + "##### #       # #.#\n"
                + "BBBB# ######### #.#\n"
                + "BBBB#           #.#\n"
                + "BBBB###############\n";
    }

    public static String getPuzzleSingle11() {
        return "BBBBBBBBBB###\n"
                + "BBBBB#### #  #\n"
                + "BBB### @###$ #\n"
                + "BB##      $  #\n"
                + "B##  $ $$## ##\n"
                + "B#  #$##     #\n"
                + "B# # $ $$ # ###\n"
                + "B#   $ #  # $ #####\n"
                + "B###    #  $$ #   #\n"
                + "#### ## $         #\n"
                + "#.    ###  ########\n"
                + "#.. ..# ####\n"
                + "#...#.#\n"
                + "#.....#\n"
                + "#######\n";
    }

    public static String getPuzzleSingle12() {
        return "################\n"
                + "#              #\n"
                + "# # ######     #\n"
                + "# #  $ $ $ $#  #\n"
                + "# #   $@$   ## ##\n"
                + "# # #$ $ $###...#\n"
                + "# #   $ $  ##...#\n"
                + "# ###$$$ $ ##...#\n"
                + "#     # ## ##...#\n"
                + "#####   ## ##...#\n"
                + "BBBB#####     ###\n"
                + "BBBBBBBB#     #\n"
                + "BBBBBBBB#######\n";
    }

    public static String getPuzzleSingle13() {
        return "BBB#########\n"
                + "BB##   ##  ######\n"
                + "###     #  #    ###\n"
                + "#  $ #$ #  #  ... #\n"
                + "# # $#@$## # #.#. #\n"
                + "#  # #$  #    . . #\n"
                + "# $    $ # # #.#. #\n"
                + "#   ##  ##$ $ . . #\n"
                + "# $ #   #  #$#.#. #\n"
                + "## $  $   $  $... #\n"
                + "B#$ ######    ##  #\n"
                + "B#  #    ##########\n"
                + "B####\n";
    }

    public static String getPuzzleSingle14() {
        return "BBBBBBB#######\n"
                + "B#######     #\n"
                + "B#     # $@$ #\n"
                + "B#$$ #   #########\n"
                + "B# ###......##   #\n"
                + "B#   $......## # #\n"
                + "B# ###......     #\n"
                + "##   #### ### #$##\n"
                + "#  #$   #  $  # #\n"
                + "#  $ $$$  # $## #\n"
                + "#   $ $ ###$$ # #\n"
                + "#####     $   # #\n"
                + "BBBB### ###   # #\n"
                + "BBBBBB#     #   #\n"
                + "BBBBBB########  #\n"
                + "BBBBBBBBBBBBB####\n";
    }

    public static String getPuzzleSingle15() {
        return "BBB########\n"
                + "BBB#   #  #\n"
                + "BBB#  $   #\n"
                + "B### #$   ####\n"
                + "B#  $  ##$   #\n"
                + "B#  # @ $ # $#\n"
                + "B#  #      $ ####\n"
                + "B## ####$##     #\n"
                + "B# $#.....# #   #\n"
                + "B#  $..**. $# ###\n"
                + "##  #.....#   #\n"
                + "#   ### #######\n"
                + "# $$  #  #\n"
                + "#  #     #\n"
                + "######   #\n"
                + "BBBBB#####\n";
    }

    public static String getPuzzleSingle16() {
        return "#####\n"
                + "#   ##\n"
                + "#    #  ####\n"
                + "# $  ####  #\n"
                + "#  $$ $   $#\n"
                + "###@ #$    ##\n"
                + "B#  ##  $ $ ##\n"
                + "B# $  ## ## .#\n"
                + "B#  #$##$  #.#\n"
                + "B###   $..##.#\n"
                + "BB#    #.*...#\n"
                + "BB# $$ #.....#\n"
                + "BB#  #########\n"
                + "BB#  #\n"
                + "BB####\n";
    }

    public static String getPuzzleSingle17() {
        return "BBB##########\n"
                + "BBB#..  #   #\n"
                + "BBB#..      #\n"
                + "BBB#..  #  ####\n"
                + "BB#######  #  ##\n"
                + "BB#            #\n"
                + "BB#  #  ##  #  #\n"
                + "#### ##  #### ##\n"
                + "#  $  ##### #  #\n"
                + "# # $  $  # $  #\n"
                + "# @$  $   #   ##\n"
                + "#### ## #######\n"
                + "BBB#    #\n"
                + "BBB######\n";
    }

    public static String getPuzzleSingle18() {
        return "BBBBB###########\n"
                + "BBBBB#  .  #   #\n"
                + "BBBBB# #.    @ #\n"
                + "B##### ##..# ####\n"
                + "##  # ..###     ###\n"
                + "# $ #...   $ #  $ #\n"
                + "#    .. ##  ## ## #\n"
                + "####$##$# $ #   # #\n"
                + "BB## #    #$ $$ # #\n"
                + "BB#  $ # #  # $## #\n"
                + "BB#               #\n"
                + "BB#  ###########  #\n"
                + "BB####BBBBBBBBB####\n";
    }

    public static String getPuzzleSingle19() {
        return "BB######\n"
                + "BB#   @####\n"
                + "##### $   #\n"
                + "#   ##    ####\n"
                + "# $ #  ##    #\n"
                + "# $ #  ##### #\n"
                + "## $  $    # #\n"
                + "B# $ $ ### # #\n"
                + "B# #  $  # # #\n"
                + "B# # #$#   # #\n"
                + "## ###   # # ######\n"
                + "#  $  #### # #....#\n"
                + "#    $    $   ..#.#\n"
                + "####$  $# $   ....#\n"
                + "#       #  ## ....#\n"
                + "###################\n";
    }

    public static String getPuzzleSingle20() {
        return "BBBB##########\n"
                + "#####        ####\n"
                + "#     #   $  #@ #\n"
                + "# #######$####  ###\n"
                + "# #    ## #  #$ ..#\n"
                + "# # $  $  #  #  #.#\n"
                + "# # $  #     #$ ..#\n"
                + "# #  ### ##     #.#\n"
                + "# ###  #  #  #$ ..#\n"
                + "# #    # $####  #.#\n"
                + "# #$   $  $  #* ..#\n"
                + "#    $ # $ $ #  #.#\n"
                + "#### $###    #* ..#\n"
                + "BBB#    $$ ###....#\n"
                + "BBB#      ## ######\n"
                + "BBB########\n";
    }

    //:::Nivel Médio:::
    public static String getPuzzleSingle21() {
        return "BBBB#####\n"
                + "BBBB#   #\n"
                + "BBBB#$  #\n"
                + "BB###  $##\n"
                + "BB#  $ $ #\n"
                + "### # ## #   ######\n"
                + "#   # ## #####  ..#\n"
                + "# $  $          ..#\n"
                + "##### ### #@##  ..#\n"
                + "BBBB#     #########\n"
                + "BBBB#######\n";
    }

    public static String getPuzzleSingle22() {
        return "#######\n"
                + "#  .@ #\n"
                + "# #.# #\n"
                + "#   $ #\n"
                + "#.$$ ##\n"
                + "#  ###\n"
                + "####";
    }

    public static String getPuzzleSingle23() {
        return "BBB####\n"
                + "#### @#\n"
                + "#  *$ #\n"
                + "#     #\n"
                + "## .###\n"
                + "B#$ #\n"
                + "B# .#\n"
                + "B####";
    }

    public static String getPuzzleSingle24() {
        return "### ###\n"
                + "#.###.#\n"
                + "# #  .#\n"
                + "# $$ @#\n"
                + "#  $  #\n"
                + "#  #  #\n"
                + "#  ####\n"
                + "####";
    }

    public static String getPuzzleSingle25() {
        return "BBB####\n"
                + "BBB# @##\n"
                + "####   #\n"
                + "#. #$$ #\n"
                + "#     ##\n"
                + "#.  $##\n"
                + "##.  #\n"
                + "B#####";
    }

    public static String getPuzzleSingle26() {
        return "#####\n"
                + "# ..####\n"
                + "# $    #\n"
                + "#  #$# #\n"
                + "# @ .$ #\n"
                + "########\n";
    }

    public static String getPuzzleSingle27() {
        return "BB#####\n"
                + "###  .#\n"
                + "# $ # #\n"
                + "# *$  #\n"
                + "# .#@ #\n"
                + "#    ##\n"
                + "#   ##\n"
                + "#####";
    }

    public static String getPuzzleSingle28() {
        return "#######\n"
                + "#.  @.#\n"
                + "#  $# ##\n"
                + "# # $. #\n"
                + "#   $# #\n"
                + "####   #\n"
                + "BBB#####";
    }

    public static String getPuzzleSingle29() {
        return "#####\n"
                + "#. .###\n"
                + "#.#$$ #\n"
                + "#   @ #\n"
                + "# $#  #\n"
                + "##   ##\n"
                + "B#####";
    }

    public static String getPuzzleSingle30() {
        return "#####\n"
                + "#.  ###\n"
                + "# #   #\n"
                + "# . # #\n"
                + "# $*$ #\n"
                + "B#@ ###\n"
                + "B#  #\n"
                + "B####";
    }

    public static String getPuzzleSingle31() {
        return "########\n"
                + "#.   . #\n"
                + "# # #  #\n"
                + "#@$  $.#\n"
                + "##### $#\n"
                + "BBBB#  #\n"
                + "BBBB####";
    }

    public static String getPuzzleSingle32() {
        return "####\n"
                + "#  #\n"
                + "#  #####\n"
                + "# .*   #\n"
                + "##$    #\n"
                + "B# #$###\n"
                + "B#. @#\n"
                + "B#####";
    }

    public static String getPuzzleSingle33() {
        return "B#####\n"
                + "B# @ ###\n"
                + "## .   #\n"
                + "#. $.$ #\n"
                + "##$# ###\n"
                + "B#   #\n"
                + "B#####";
    }

    public static String getPuzzleSingle34() {
        return "B#####\n"
                + "##   #\n"
                + "# $# #\n"
                + "# . @##\n"
                + "# *   #\n"
                + "## #$ #\n"
                + "B#.  ##\n"
                + "B#####";
    }

    public static String getPuzzleSingle35() {
        return "B####\n"
                + "##  ####\n"
                + "#..$  .#\n"
                + "# #$ $ #\n"
                + "#@  #  #\n"
                + "#####  #\n"
                + "BBBB####\n";
    }

    public static String getPuzzleSingle36() {
        return "B######\n"
                + "B#  .@##\n"
                + "B#   $.#\n"
                + "B###*# #\n"
                + "##     #\n"
                + "#  $  ##\n"
                + "#   ###\n"
                + "#####";
    }

    public static String getPuzzleSingle37() {
        return "B####\n"
                + "B#@ #\n"
                + "B#  #\n"
                + "##. ####\n"
                + "# $$. .#\n"
                + "#  $ ###\n"
                + "###  #\n"
                + "BB####";
    }

    public static String getPuzzleSingle38() {
        return "#####\n"
                + "#.  #\n"
                + "# # ###\n"
                + "# *$  #\n"
                + "#  $. #\n"
                + "#  @###\n"
                + "#####";
    }

    public static String getPuzzleSingle39() {
        return "BB#####\n"
                + "BB#   #\n"
                + "BB# #.#\n"
                + "###  .#\n"
                + "#@ $$ #\n"
                + "#  .$ #\n"
                + "#######";
    }

    public static String getPuzzleSingle40() {
        return "######\n"
                + "#   @#\n"
                + "# $# ###\n"
                + "# * $  #\n"
                + "#   ## #\n"
                + "##.  . #\n"
                + "B##   ##\n"
                + "BB#####";
    }

    //:::Nivel Dificil:::
    public static String getPuzzleSingle41() {
        return "####\n"
                + "# .#\n"
                + "#  ###\n"
                + "#*@  #\n"
                + "#  $ #\n"
                + "#    #\n"
                + "######";
    }

    public static String getPuzzleSingle42() {
        return "#######\n"
                + "#  .@ #\n"
                + "# #.# #\n"
                + "#   $ #\n"
                + "#.$$ ##\n"
                + "#  ###\n"
                + "####";
    }

    public static String getPuzzleSingle43() {
        return "BBB####\n"
                + "#### @#\n"
                + "#  *$ #\n"
                + "#     #\n"
                + "## .###\n"
                + "B#$ #\n"
                + "B# .#\n"
                + "B####";
    }

    public static String getPuzzleSingle44() {
        return "###B###\n"
                + "#.###.#\n"
                + "# #  .#\n"
                + "# $$ @#\n"
                + "#  $  #\n"
                + "#  #  #\n"
                + "#  ####\n"
                + "####";
    }

    public static String getPuzzleSingle45() {
        return "BBB####\n"
                + "BBB# @##\n"
                + "####   #\n"
                + "#. #$$ #\n"
                + "#     ##\n"
                + "#.  $##\n"
                + "##.  #\n"
                + "B#####";
    }

    public static String getPuzzleSingle46() {
        return "#####\n"
                + "# ..####\n"
                + "# $    #\n"
                + "#  #$# #\n"
                + "# @ .$ #\n"
                + "########\n";
    }

    public static String getPuzzleSingle47() {
        return "BB#####\n"
                + "###  .#\n"
                + "# $ # #\n"
                + "# *$  #\n"
                + "# .#@ #\n"
                + "#    ##\n"
                + "#   ##\n"
                + "#####";
    }

    public static String getPuzzleSingle48() {
        return "#######\n"
                + "#.  @.#\n"
                + "#  $# ##\n"
                + "# # $. #\n"
                + "#   $# #\n"
                + "####   #\n"
                + "BBB#####";
    }

    public static String getPuzzleSingle49() {
        return "#####\n"
                + "#. .###\n"
                + "#.#$$ #\n"
                + "#   @ #\n"
                + "# $#  #\n"
                + "##   ##\n"
                + "B#####";
    }

    public static String getPuzzleSingle50() {
        return "#####\n"
                + "#.  ###\n"
                + "# #   #\n"
                + "# . # #\n"
                + "# $*$ #\n"
                + "B#@ ###\n"
                + "B#  #\n"
                + "B####";
    }

    public static String getPuzzleSingle51() {
        return "########\n"
                + "#.   . #\n"
                + "# # #  #\n"
                + "#@$  $.#\n"
                + "##### $#\n"
                + "BBBB#  #\n"
                + "BBBB####";
    }

    public static String getPuzzleSingle52() {
        return "####\n"
                + "#  #\n"
                + "#  #####\n"
                + "# .*   #\n"
                + "##$    #\n"
                + "B# #$###\n"
                + "B#. @#\n"
                + "B#####";
    }

    public static String getPuzzleSingle53() {
        return "B#####\n"
                + "B# @ ###\n"
                + "## .   #\n"
                + "#. $.$ #\n"
                + "##$# ###\n"
                + "B#   #\n"
                + "B#####";
    }

    public static String getPuzzleSingle54() {
        return "B#####\n"
                + "##   #\n"
                + "# $# #\n"
                + "# . @##\n"
                + "# *   #\n"
                + "## #$ #\n"
                + "B#.  ##\n"
                + "B#####";
    }

    public static String getPuzzleSingle55() {
        return "B####\n"
                + "##  ####\n"
                + "#..$  .#\n"
                + "# #$ $ #\n"
                + "#@  #  #\n"
                + "#####  #\n"
                + "BBBB####\n";
    }

    public static String getPuzzleSingle56() {
        return "B######\n"
                + "B#  .@##\n"
                + "B#   $.#\n"
                + "B###*# #\n"
                + "##     #\n"
                + "#  $  ##\n"
                + "#   ###\n"
                + "#####";
    }

    public static String getPuzzleSingle57() {
        return "B####\n"
                + "B#@ #\n"
                + "B#  #\n"
                + "##. ####\n"
                + "# $$. .#\n"
                + "#  $ ###\n"
                + "###  #\n"
                + "BB####";
    }

    public static String getPuzzleSingle58() {
        return "#####\n"
                + "#.  #\n"
                + "# # ###\n"
                + "# *$  #\n"
                + "#  $. #\n"
                + "#  @###\n"
                + "#####";
    }

    public static String getPuzzleSingle59() {
        return "BB#####\n"
                + "BB#   #\n"
                + "BB# #.#\n"
                + "###  .#\n"
                + "#@ $$ #\n"
                + "#  .$ #\n"
                + "#######";
    }

    public static String getPuzzleSingle60() {
        return "######\n"
                + "#   @#\n"
                + "# $# ###\n"
                + "# * $  #\n"
                + "#   ## #\n"
                + "##.  . #\n"
                + "B##   ##\n"
                + "BB#####";
    }

}
