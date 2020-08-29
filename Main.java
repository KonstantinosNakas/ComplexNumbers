
public class Main {
	
	public static void main(String[] args) {
		ComplexMatrix ComMatrix1 = new ComplexMatrix(5, 5);
		System.out.println(ComMatrix1.toString());
		ComplexMatrix ComMatrix2 = new ComplexMatrix(5, 5);
		System.out.println(ComMatrix2.toString());
		ComplexMatrix ComMatrix3 = new ComplexMatrix(ComMatrix1.CompSubtract(ComMatrix2));
		System.out.println(ComMatrix3.toString());
	}
	
}
