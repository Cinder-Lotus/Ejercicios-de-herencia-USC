public class Main {
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
