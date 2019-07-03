package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard chessBoard;

    @Before
    public void setUp() {
        System.out.println("Before");
        chessBoard = new ChessBoard();
    }

    @After
    public void tearDown() {
        chessBoard = null;
        System.out.println("After");
    }

    @Test
    public void givenRowsAndColsShouldPrintChessboardPattern() {
        String expected[][] = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};

        String[][] actual = chessBoard.display(8, 8);

        assertNotEquals("Following is chessPattern output", expected, actual);

    }
}