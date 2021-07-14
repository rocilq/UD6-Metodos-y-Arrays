import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));
		
		System.out.println(factorial(num));
	}
	
	public static int factorial(int num) {
		int fact = 1;
			
		for (int i = 2; i <= num; i++) {
			
			fact = fact * i;

		}
		
		return fact;
	}

}
