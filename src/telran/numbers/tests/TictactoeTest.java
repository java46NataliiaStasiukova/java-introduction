package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TictactoeGame;

class TictactoeTest {

	@Test
	void testTictactoeMove() {
		char matrix1[][] = {
			    {'x',  0,  'x'},
			    {'0', 'x', '0'},
			    { 0,  'x',  0 }
		   };
		char matrix2[][] = {
				{'0',  0,  '0', '0'},
				{'x', '0', '0', 'x'},
				{ 0,   0,  '0', 'x'},
				{'0', 'x',  0,   0 }
			};
		char matrix3[][] = {
			    {'x', '0', 'x'},
			    {'0', 'x', '0'},
			    {'0', 'x',  0 }
		   };
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 0, 1, 'x'));//game over with winner
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 0, 1, 'x'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 2, 0, 'x'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix1, 2, 2, 'x'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix2, 0, 1, '0'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix2, 3, 2, '0'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix2, 3, 3, '0'));
		assertEquals(1, TictactoeGame.tictactoeMove(matrix2, 2, 1, '0'));
		assertEquals(0, TictactoeGame.tictactoeMove(matrix1, 2, 0, '0'));//game not over
		assertEquals(0, TictactoeGame.tictactoeMove(matrix2, 0, 1, 'x'));
		assertEquals(2, TictactoeGame.tictactoeMove(matrix3, 2, 2, '0'));//game is over

		
	}


}
