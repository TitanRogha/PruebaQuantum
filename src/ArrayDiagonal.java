import java.lang.reflect.Array;

public class ArrayDiagonal {

	public static void main(String[] args) {

		int array [][]= {{1, 3, 6, 10},{2, 5, 9, 13},{4, 8, 12, 15},{7, 11, 14, 16}};


		try 
		{
		for (var i=0;i<array.length;i++) {

			for (var j=0;j<=i;j++) {

			System.out.println((array[i-j][j])); ;

			}
		}
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Se presentó excepcion en el indice del array");
		}
		catch(ArithmeticException ex) {
			System.out.println("Se presento excepcion en las operaciones del indice del array");
		}
		catch(Exception ex) {
			System.out.println("Se presento excepcion general");
		}

}

}