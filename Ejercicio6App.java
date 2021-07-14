import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));
		
		System.out.println(numeroCifras(num));
	}
	
	public static int numeroCifras(int num) {
		int numCifras = 0;
		
		while (num != 0) {
			num = num/10;
			numCifras++;
		}
		
		return numCifras;
	}

}
