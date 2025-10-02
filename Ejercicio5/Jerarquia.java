// Clase base
class Animal {
	String foto;
	String comida;
	String localizacion;
	String tamano;

	public void hacerRuido() {
		System.out.println("El animal hace un ruido.");
	}
	public void comer() {
		System.out.println("El animal está comiendo.");
	}
	public void dormir() {
		System.out.println("El animal está durmiendo.");
	}
	public void rugir() {
		System.out.println("El animal ruge.");
	}
}

// Felino hereda de Animal
class Felino extends Animal {
	public void rugir() {
		System.out.println("El felino ruge.");
	}
}

class Leon extends Felino {
	public void comer() {
		System.out.println("El león está comiendo carne.");
	}
	public void hacerRuido() {
		System.out.println("El león ruge fuerte.");
	}
	public void vacunar() {
		System.out.println("El león ha sido vacunado.");
	}
}

class Tigre extends Felino {
	public void comer() {
		System.out.println("El tigre está comiendo.");
	}
	public void hacerRuido() {
		System.out.println("El tigre ruge.");
	}
	public void vacunar() {
		System.out.println("El tigre ha sido vacunado.");
	}
}

class Gato extends Felino {
	public void comer() {
		System.out.println("El gato está comiendo.");
	}
	public void hacerRuido() {
		System.out.println("El gato maúlla.");
	}
	public void vacunar() {
		System.out.println("El gato ha sido vacunado.");
	}
}

// Canino hereda de Animal
class Canino extends Animal {
	public void rugir() {
		System.out.println("El canino ruge.");
	}
}

class Lobo extends Canino {
	public void comer() {
		System.out.println("El lobo está comiendo.");
	}
	public void hacerRuido() {
		System.out.println("El lobo aúlla.");
	}
	public void vacunar() {
		System.out.println("El lobo ha sido vacunado.");
	}
}

class Perro extends Canino {
	public void comer() {
		System.out.println("El perro está comiendo.");
	}
	public void hacerRuido() {
		System.out.println("El perro ladra.");
	}
	public void vacunar() {
		System.out.println("El perro ha sido vacunado.");
	}
	public void pasear() {
		System.out.println("El perro está paseando.");
	}
}

// Clase Main para probar la jerarquía
public class Jerarquia {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Felino felino = new Felino();
		Canino canino = new Canino();
		Leon leon = new Leon();
		Tigre tigre = new Tigre();
		Gato gato = new Gato();
		Lobo lobo = new Lobo();
		Perro perro = new Perro();

		System.out.println("--- Animal ---");
		animal.hacerRuido();
		animal.comer();
		animal.dormir();
		animal.rugir();

		System.out.println("--- Felino ---");
		felino.hacerRuido();
		felino.rugir();

		System.out.println("--- Canino ---");
		canino.hacerRuido();
		canino.rugir();

		System.out.println("--- Leon ---");
		leon.hacerRuido();
		leon.comer();
		leon.vacunar();

		System.out.println("--- Tigre ---");
		tigre.hacerRuido();
		tigre.comer();
		tigre.vacunar();

		System.out.println("--- Gato ---");
		gato.hacerRuido();
		gato.comer();
		gato.vacunar();

		System.out.println("--- Lobo ---");
		lobo.hacerRuido();
		lobo.comer();
		lobo.vacunar();

		System.out.println("--- Perro ---");
		perro.hacerRuido();
		perro.comer();
		perro.vacunar();
		perro.pasear();
	}
}
