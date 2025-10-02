import java.util.ArrayList;
import java.util.List; 
import java.util.*;

// Clase base abstracta
abstract class Empleado {
	protected String nombre;
	protected int id;
	protected double salarioBase;

	public Empleado(String nombre, int id, double salarioBase) {
		this.nombre = nombre;
		this.id = id;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();

	public void mostrarInformacion() {
		System.out.println("ID: " + id + ", Nombre: " + nombre + ", Salario: " + calcularSalario());
	}
}

// Subclase Gerente
class Gerente extends Empleado {
	private double bonoAnual;

	public Gerente(String nombre, int id, double salarioBase, double bonoAnual) {
		super(nombre, id, salarioBase);
		this.bonoAnual = bonoAnual;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + bonoAnual;
	}
}

// Subclase Desarrollador
class Desarrollador extends Empleado {
	private int proyectosAsignados;
	private double pagoPorProyecto = 5000; // ejemplo

	public Desarrollador(String nombre, int id, double salarioBase, int proyectosAsignados) {
		super(nombre, id, salarioBase);
		this.proyectosAsignados = proyectosAsignados;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + (proyectosAsignados * pagoPorProyecto);
	}
}

// Subclase Administrativo
class Administrativo extends Empleado {
	private int horasExtra;
	private double pagoPorHoraExtra = 100; // ejemplo

	public Administrativo(String nombre, int id, double salarioBase, int horasExtra) {
		super(nombre, id, salarioBase);
		this.horasExtra = horasExtra;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + (horasExtra * pagoPorHoraExtra);
	}
}

// Clase para gestión de personal
class GestionPersonal {
	public static void generarInforme(List<Empleado> empleados) {
		System.out.println("--- Informe de Empleados ---");
		for (Empleado e : empleados) {
			e.mostrarInformacion();
		}
	}
}

// Programa principal para probar
public class SistemaEmpleados {
	public static void main(String[] args) {
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(new Gerente("Ana", 1, 50000, 10000));
		empleados.add(new Desarrollador("Luis", 2, 40000, 3));
		empleados.add(new Administrativo("Marta", 3, 30000, 20));

		GestionPersonal.generarInforme(empleados);
	}
}


