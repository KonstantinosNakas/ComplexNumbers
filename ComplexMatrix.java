import java.util.Random;

public class ComplexMatrix {
	
	private ComplexNumber[][] ComplexArray;
	private int rows;
	private int cols;
	private Random rand = new Random();

	public ComplexMatrix() {}
	
	public ComplexMatrix(ComplexMatrix original) {
		this.rows = original.getRows();
		this.cols = original.getCols();
		ComplexArray = new ComplexNumber[original.getRows()][original.getCols()];
		for (int i=0; i<original.getRows(); i++) {
			for (int j=0; j<original.getCols(); j++) {
				ComplexArray[i][j] = original.ComplexArray[i][j];
			}
		}
	}
	
	private double computeRandom() {
		int randomNum = (int)((rand.nextDouble()-0.5)*rand.nextInt(20)*100);
		return randomNum/100.0;
	}
	
	public ComplexMatrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		ComplexArray = new ComplexNumber[rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				ComplexNumber myComNum = new ComplexNumber(computeRandom(), computeRandom());
				ComplexArray[i][j] = myComNum;
			}
		}
	}	
	
	public String toString() {
		String s;
		s = "[";
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				if (j == cols-1) {
					s = s + ComplexArray[i][j].toString();
				}else {
					s = s + ComplexArray[i][j].toString() + ", ";
				}
				
			}
			if (i == rows-1) {
				s = s + ";" + "]" + "\n";
			}else {
				s = s + ";" + "\n";
			}
		}	
		return s;
	}
	
	ComplexMatrix CompAdd(ComplexMatrix matrix) {
		if (matrix.getRows() != rows || matrix.getCols() != cols) {
			return null;
		}
		ComplexMatrix newCompMatrix = new ComplexMatrix(rows, cols); 
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				newCompMatrix.ComplexArray[i][j] = ComplexArray[i][j].addComp(matrix.ComplexArray[i][j]);
			}
		}	
		return newCompMatrix;
	}
	
	ComplexMatrix CompSubtract(ComplexMatrix matrix) {
		if (matrix.getRows() != rows || matrix.getCols() != cols) {
			return null;
		}
		ComplexMatrix newCompMatrix = new ComplexMatrix(rows, cols); 
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				newCompMatrix.ComplexArray[i][j] = ComplexArray[i][j].substractComp(matrix.ComplexArray[i][j]);
			}
		}	
		return newCompMatrix;
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}
	
}
