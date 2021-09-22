package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rslLine = true;
        boolean rslRow = true;
        for(int i = 0; i < board.length; i++) {
            rslLine = true;
            for(int j = 0; j< board[i].length; j++) {
                if (board[i][j] == 0) {
                    rslLine = false;
                    break;
                }
            }
            if(rslLine) {
                break;
            }
        }
        for(int i = 0; i < board.length; i++) {
            rslRow = true;
            for(int j = 0; j< board[i].length; j++) {
                if (board[j][i] == 0) {
                    rslRow = false;
                    break;
                }
            }
            if(rslRow) {
                break;
            }
        }
        return rslRow || rslLine;
    }
}
