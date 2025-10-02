// Clase para probar ConceptosBasicos.java y la jerarquía completa
public class Main {
	public static void main(String[] args) {
		// Prueba directa de ConceptosBasicos
		ConceptosBasicos.main(args);

		// Prueba individual de objetos y polimorfismo
		Vehiculo[] vehiculos = new Vehiculo[] {
			new Auto("Mazda", "3", "Gasolina"),
			new Motocicleta("Honda", "CBR", "Gasolina"),
			new Camioneta("Chevrolet", "Silverado", "Diesel", 2000)
		};

		System.out.println("\nPrueba de polimorfismo desde Main:");
		for (Vehiculo v : vehiculos) {
			ConceptosBasicos.iniciarVehiculo(v);
		}

		// Prueba de métodos propios de Camioneta
		Camioneta camioneta = new Camioneta("Toyota", "Hilux", "Diesel", 1500);
		camioneta.mostrarInfo();
		camioneta.cargar(1200);
		camioneta.cargar(1600);
	}
}
