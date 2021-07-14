import javax.swing.JOptionPane;

public class Ejercicio3App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));
		
		System.out.println(esPrimo(num));
		
	}
	
	public static boolean esPrimo(int num) {
		
		if (num <= 1) {
	        return false;
	    }
	 
	    int contador = 0;

	    for (int i = (int) Math.sqrt(num); i > 1; i--) {
	        if (num % i == 0) {
	            contador++;
	        }
	    }
	 
	    return contador < 1;
	}

}
