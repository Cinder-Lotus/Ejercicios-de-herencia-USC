// Ejemplo de herencia en Java


// Superclase Vehiculo
class Vehiculo {
	String marca;
	String modelo;

	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void encender() {
		System.out.println("El vehículo se ha encendido.");
	}
}

// Subclase Auto
class Auto extends Vehiculo {
	String tipoDeCombustible;

	public Auto(String marca, String modelo, String tipoDeCombustible) {
		super(marca, modelo);
		this.tipoDeCombustible = tipoDeCombustible;
	}

	@Override
	public void encender() {
		System.out.println("El auto se ha encendido. Listo para rodar!");
	}

	public void mostrarInfo() {
		System.out.println("Auto: " + marca + " " + modelo + ", Combustible: " + tipoDeCombustible);
	}
}

// Subclase Motocicleta
class Motocicleta extends Vehiculo {
	String tipoDeCombustible;

	public Motocicleta(String marca, String modelo, String tipoDeCombustible){
		super(marca, modelo);
		this.tipoDeCombustible = tipoDeCombustible; 
	}

	@Override
	public void encender() {
		System.out.println("La motocicleta ruge y está encendida!");
	}

	public void mostrarInfo() {
		System.out.println("Motocicleta: " + marca + " " + modelo + ", Combustible: " + tipoDeCombustible);
	}
}

// Subclase Camioneta
class Camioneta extends Vehiculo {
	String tipoDeCombustible;
	int capacidadCarga;

	public Camioneta(String marca, String modelo, String tipoDeCombustible, int capacidadCarga) {
		super(marca, modelo);
		this.tipoDeCombustible = tipoDeCombustible;
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void encender() {
		System.out.println("La camioneta está encendida y lista para transportar carga!");
	}

	public void mostrarInfo() {
		System.out.println("Camioneta: " + marca + " " + modelo + ", Combustible: " + tipoDeCombustible + ", Capacidad: " + capacidadCarga + "kg");
	}

	public void cargar(int peso) {
		if (peso <= capacidadCarga) {
			System.out.println("Carga aceptada: " + peso + "kg");
		} else {
			System.out.println("Exceso de carga. Capacidad máxima: " + capacidadCarga + "kg");
		}
	}
}

public class ConceptosBasicos {
	// Método para demostrar polimorfismo
	public static void iniciarVehiculo(Vehiculo vehiculo) {
		vehiculo.encender();
	}

	public static void main(String[] args) {
		Auto miAuto = new Auto("Petromovil", "Reformaneitor 3000", "Lechona");
		Motocicleta miMoto = new Motocicleta("duke", "1390 r", "Gasolina premium");
		Camioneta miCamioneta = new Camioneta("Ford", "F-150", "Diesel", 1200);

		// Pruebas individuales
		miAuto.mostrarInfo();
		miMoto.mostrarInfo();
		miCamioneta.mostrarInfo();
		miCamioneta.cargar(1000);
		miCamioneta.cargar(1500);

		// Polimorfismo: iniciarVehiculo
		System.out.println("\nDemostración de polimorfismo:");
		iniciarVehiculo(miAuto);
		iniciarVehiculo(miMoto);
		iniciarVehiculo(miCamioneta);
	}
}
    

