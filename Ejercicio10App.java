import javax.swing.JOptionPane;

public class Ejercicio10App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Pon el tamaño del array"));
		
		int[] array = new int[num];
		
	}
	
	public static int devolverAleatorio(int min, int max) {
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		return random_int;
	}
	
}
