import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog("Introduce la figura que quieres calcular el área");
		if (figura.equalsIgnoreCase("circulo")) {
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Pon el radio del circulo"));
			
			JOptionPane.showMessageDialog(null, "Area: " + circulo(radio));
			
		}else if (figura.equalsIgnoreCase("triangulo")) {
			double base = Double.parseDouble(JOptionPane.showInputDialog("Pon la base del triángulo"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Pon la altura del triángulo"));
			
			JOptionPane.showMessageDialog(null, "Area: " + triangulo(base,altura));
			
		}else if (figura.equalsIgnoreCase("cuadrado")) {
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Pon el lado del cuadrado"));
			
			JOptionPane.showMessageDialog(null, "Area: " + cuadrado(lado));
		}
	}
	
	public static double circulo(double radio) {
		
		double areaCirculo = Math.pow(radio, 2) * 3.14;
		
		return areaCirculo;
	}
	
	public static double triangulo(double base, double altura) {
		
		double areaTriangulo = (base*altura)/2;
		
		return areaTriangulo;
	}
	
	public static double cuadrado(double lado) {
		
		double areaCuadrado = lado * lado;
		
		return areaCuadrado;
	}

}
