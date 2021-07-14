import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		int numAleatorios = Integer.parseInt(JOptionPane.showInputDialog("Pon el total de aleatorios"));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Pon el mínimo"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Pon el máximo"));

		for (int i = 0; i < numAleatorios; i++) {
			System.out.println(devolverAleatorio(min,max));
		}
	}

	public static int devolverAleatorio(int min, int max) {
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		return random_int;
		
	}

}
