package paquete1;

public class App {

	public static void main(String[] args) {
		
		//Realizar pruebas corregirlo con chatgpt y subirlo al github.
		
		//Creacion de objetos:
		
		
		Cereales lions = new Cereales("Nestle", 2.5, "Espelta"); //Cereales(String marca, double precio, String tipoCereal) {
		Detergente vanish = new Detergente("Vanish", 12, 2); //String marca, double precio, double cantidadLitros
		Vino perritoFaldero = new Vino("La Rioja", 20, "Afrutado", 2); //String marca, double precio, String tipoVino, double volumen
		
		
		System.out.println(lions);
		System.out.println(vanish);
		System.out.println(perritoFaldero);
	}

}
