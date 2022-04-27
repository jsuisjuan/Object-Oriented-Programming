
public class ArrayInverter {
	public static void main (String [] args) {
		int [] array = {1, 7, 6, 5};
		
		for(int i = 0; i < array.length ; i++) {
			int aux = array[i];
			array[i] = array[array.length - i];
			array[array.length - i] = aux;
			System.out.print(array[i] + " ");
		}
	}
}
