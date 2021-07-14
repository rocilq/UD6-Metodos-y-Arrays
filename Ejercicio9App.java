import javax.swing.JOptionPane;

public class Ejercicio9App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Pon el tamaño del array"));
		
		int[] array = new int[num];
		
		int min = 0;
		int max = 9;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
		}
		
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
			cont = cont + array[i];
			
		}
		
		System.out.println("Suma: " + cont);
		
	}

}
