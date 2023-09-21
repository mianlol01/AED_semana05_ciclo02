package semana_05;

public class ArregloSueldos {
	private double[] sueldo = { 2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7 };

	public int tamanio() {
		return sueldo.length;
	}

	public double obtener(int i) {
		return sueldo[i];
	}

	public double sueldoPromedio() {
		double suma = 0;

		for (double salario : sueldo) {
			suma += salario;
		}
		return suma / tamanio();
	}

	public double sueldoMayor() {
		double mayor = sueldo[0];

		for (double salario : sueldo) {
			if (salario > mayor) {
				mayor = salario;
			}
		}
		return mayor;
	}

	public double sueldoMenor() {
		double menor = sueldo[0];

		for (double salario : sueldo) {
			if (salario < menor) {
				menor = salario;
			}
		}
		return menor;
	}

	public int cantMayoresSueldoPromedio() {
		int cantidadMayorPromedio = 0;

		for (double salario : sueldo) {
			if (salario >= sueldoPromedio()) {
				cantidadMayorPromedio++;
			}
		}
		return cantidadMayorPromedio;
	}

	public int cantMenoresSueldoPromedio() {
		int cantidadMenorPromedio = 0;
		for (double salario : sueldo) {
			if (salario < sueldoPromedio()) {
				cantidadMenorPromedio++;
			}
		}
		return cantidadMenorPromedio;
	}

	public int posSegundoSueldoMayorAlMinimo() {
		int contador = 0;
		double minimo = 850;

		for (int i = 0; i < tamanio(); i++) {
			if (sueldo[i] > minimo) {
				contador++;
				if (contador == 2) {
					return i;
				}
			}
		}
		return -1;
	}

	public int posUltimoSueldoMenorAlMinimo() {
		double minimo = 850;
		int posicion = -1;

		for (int i = tamanio() - 1; i >= 0; i--) {
			if (sueldo[i] < minimo) {
				posicion = i;
				return posicion;
			}
		}
		return posicion;
	}

	public void generarSueldo() {
		for (int i = 0; i < tamanio(); i++) {
			sueldo[i] = aleatorio(799.9, 4999.9);
		}
	}

	private double aleatorio(double min, double max) {
		return (double) ((max - min + 1) * Math.random()) + min;
	}
}
