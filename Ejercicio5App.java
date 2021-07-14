import javax.swing.JOptionPane;

public class Ejercicio5App {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));

		System.out.printf("Binario: %.0f %n", binario(num));

	}

	public static double binario(int num) {
		double binario = 0;
		int exp=0;
		int digito;

		while(num!=0){
			digito = num % 2;           
			binario = binario + digito * Math.pow(10, exp);                                                   
			exp++;
			num = num/2;
		}

		return binario;
	}

}
