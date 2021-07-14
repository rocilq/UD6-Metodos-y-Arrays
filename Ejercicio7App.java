import javax.swing.JOptionPane;

public class Ejercicio7App {

	public static void main(String[] args) {
		int euros = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));
		
		String moneda = JOptionPane.showInputDialog("Pon la moneda");
		moneda(euros,moneda);
	}

	public static void moneda(int euros, String moneda) {		
		moneda = moneda.toLowerCase();
		switch (moneda) {
		case "dolares":
			System.out.println(euros * 1.28611);
			break;
		case "libras":
			System.out.println(euros * 0.86);
			break;
			
		case "yenes":
			System.out.println(euros * 129.852);
			break;

		default:
			break;
		}

	}

}
