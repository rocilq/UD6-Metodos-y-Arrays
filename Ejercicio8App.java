import javax.swing.JOptionPane;

public class Ejercicio8App {

	public static void main(String[] args) {
		int array[] = llenarArray();
		
		mostrarArray(array);

	}

	public static int[] llenarArray() {
		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));
		}

		return array;
	}

	public static void mostrarArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
