package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.Matrix;

class MatrixIntTest {

	@Test
	void testMatrixSum() {
		int matrix[][] = {
				{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
		};
		assertEquals(45, Matrix.matrixSum(matrix));
	}

	@Test
	void testInsertRow() {
		int matrix[][] = {
				{1, 2}, 
				{3, 4}
		};
		int row1[] = {5, 6};
		int row2[] = {5};
		int row3[] = {5, 6, 7};
		int expected1[][] = {
				{1, 2},
				{5, 6},
				{3, 4}
		};
		int expected2[][] = {
				{5, 6},
				{1, 2},
				{3, 4}
		};
		int expected3[][] = {
				{1, 2},
				{3, 4},
				{5, 0}
		};
		assertArrayEquals(expected1, Matrix.insertRow(matrix, row1, 1));
		assertArrayEquals(expected2, Matrix.insertRow(matrix, row3, 0));
		assertArrayEquals(expected3, Matrix.insertRow(matrix, row2, 2));
	}

	@Test
	void testInsertColumn() {
		int matrix[][] = {
				{1, 2}, 
				{3, 4}
		};
		int column1[] = {5, 6};
		int column2[] = {5};
		int column3[] = {5, 6, 7};
		int expected1[][] = {
				{1, 5, 2},
				{3, 6, 4}
		};
		int expected2[][] = {
				{5, 1, 2},
				{6, 3, 4}
		};
		int expected3[][] = {
				{1, 2, 5},
				{3, 4, 0}
		};
		assertArrayEquals(expected1, Matrix.insertColumn(matrix, column1, 1));
		assertArrayEquals(expected2, Matrix.insertColumn(matrix, column3, 0));
		assertArrayEquals(expected3, Matrix.insertColumn(matrix, column2, 2));
	}

	@Test
	void testRemoveRow() {
		int matrix1[][] = {
				{1, 2},
				{5, 6},
				{3, 4}
		};
		int matrix2[][] = {
				{5, 6},
				{1, 2},
				{3, 4}
		};
		int matrix3[][] = {
				{1, 2},
				{3, 4},
				{5, 0}
		};
		int expected[][] = {
				{1, 2}, 
				{3, 4}
		};
		assertArrayEquals(expected, Matrix.removeRow(matrix1, 1));
		assertArrayEquals(expected, Matrix.removeRow(matrix2, 0));
		assertArrayEquals(expected, Matrix.removeRow(matrix3, 2));
		
	}

	@Test
	void testRemoveColumn() {
		int matrix1[][] = {
				{1, 5, 2},
				{3, 6, 4}
		};
		int matrix2[][] = {
				{5, 1, 2},
				{6, 3, 4}
		};
		int matrix3[][] = {
				{1, 2, 5},
				{3, 4, 0}
		};
		int expected[][] = {
				{1, 2}, 
				{3, 4}
		};
		assertArrayEquals(expected, Matrix.removeColumn(matrix1, 1));
		assertArrayEquals(expected, Matrix.removeColumn(matrix2, 0));
		assertArrayEquals(expected, Matrix.removeColumn(matrix3, 2));
	}

	@Test
	void testTransposition() {
		int matrix[][] = {
				{1, 2, 3},
				{4, 5, 6}
		};
		int expected[][] = {
				{1, 4},
				{2, 5},
				{3, 6}
		};
		assertArrayEquals(expected, Matrix.transposition(matrix));
	}

}
