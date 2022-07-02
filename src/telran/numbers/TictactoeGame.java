package telran.numbers;

public class TictactoeGame {
	/**
	 * 
	 * @param matrix: square matrix (nRows == nColumns; where nRows >= 3)
	 * @param nRow: (number of row)
	 * @param nCol: (number of column)
	 * @param symb: (being filled symbol either 'x' or 'o')
	 * @return: 0 - game isn't over; 1 - game is over with the winner's move; 
	 * 2 - game is over with draw
	 */
	public static int tictactoeMove(char matrix[][], int nRow, int nCol, char symb) {
		matrix[nRow][nCol] = symb;
		if(checkRows(matrix, nRow) == 1 || checkColumns(matrix, nCol) == 1 || checkDiagonal(matrix) == 1) {
			matrix[nRow][nCol] = 0;
			return 1;
		}
		if(checkMatrix(matrix) == 0) {
			matrix[nRow][nCol] = 0;
			return 0;
		}	
		matrix[nRow][nCol] = 0;
		return 2;
	}
	
	public static int checkRows(char matrix[][], int nRow) {
		for(int i = 1; i < matrix.length; i++) {
			if(matrix[nRow][1] != matrix[nRow][i - 1]) return -1;
		}
		return 1;
	}
	public static int checkColumns(char matrix[][], int nCol) {
		for(int i = 1; i < matrix.length; i++) {
			if(matrix[i][nCol] != matrix[i - 1][nCol]) return -1;
		}
		return 1;
	}
	public static int checkDiagonal(char matrix[][]) {
		int res = 1;
		for(int i = 1; i < matrix.length; i++) {
			if(matrix[i][i] == matrix[i - 1][i - 1]) res++;
		}
		if(res == matrix.length) return 1;
		else res = 1;

		for(int i = 1, j = matrix.length - 2; i < matrix.length; i++, j--) {
				if(matrix[i][j] == matrix[i - 1][j + 1]) res++;
		}
		if(res == matrix.length) return 1;
		else res = 1;

		return -1;
	}
	public static int checkMatrix(char matrix[][]) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] == 0) return 0;
			}
		}
		return - 1;
	}

}

/*
 * Option to check all rows and columns:
 * 
 * 	public static int checkRows(char matrix[][]) {
		int res = 1;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 1; j < matrix.length; j++) {
				if(matrix[i][j] == matrix[i][j - 1]) res++;
			}
			if(res != matrix.length) res = 1;
			else return 1;
		}
		return -1;
	}
	public static int checkColumns(char matrix[][]) {
		int res = 1;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 1; j < matrix.length; j++) {
				if(matrix[j][i] == matrix[j - 1][i]) res++;
			}
			if(res != matrix.length) res = 1;
			else return 1;
		}
		return -1;
	}
 */
