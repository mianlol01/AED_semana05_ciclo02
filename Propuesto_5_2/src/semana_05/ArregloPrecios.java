package semana_05;

public class ArregloPrecios {
	private double[] precio = { 240.5, 350.2, 80.4, 100.3, 470.1, 60.0, 330.8, 260.6, 510.9, 200.7 };

	public int tamanio() {
		return precio.length;
	}

	public double obtener(int i) {
		return precio[i];
	}

	public double precioPromedio() {
		double suma = 0;
		for (double valor : precio) {
			suma += valor;
		}
		return suma / tamanio();
	}

	public double precioMayor() {
		double mayor = precio[0];
		for (double valor : precio) {
			if (valor > mayor) {
				mayor = valor;
			}
		}
		return mayor;
	}

	public double precioMenor() {
		double menor = precio[0];
		for (double valor : precio) {
			if (valor < menor) {
				menor = valor;
			}
		}
		return menor;
	}

	public int cantMayoresPrecioPromedio() {
		int contador = 0;
		for (double valor : precio) {
			if (valor >= precioPromedio()) {
				contador++;
			}
		}
		return contador;
	}

	public int cantMenoresPrecioPromedio() {
		return tamanio() - cantMayoresPrecioPromedio();
	}

	public int posPrimerPrecioMayorAlSegundo() {
		for (int i = 0; i < tamanio(); i++) {
			if (precio[i] > precio[1]) {
				return i;
			}
		}
		return -1;
	}

	public int posUltimoPrecioMenorAlPenultimo() {
		for (int i = tamanio() - 1; i >= 0; i--) {
			if (precio[i] < precio[precio.length - 2]) {
				return i;
			}
		}
		return -1;
	}

	public void generarPrecios() {
		for (int i = 0; i < tamanio(); i++) {
			double nuevoPrecio = 99.9 + Math.random() * (999.9 - 99.9);
			nuevoPrecio = Math.round(nuevoPrecio * 10) / 10.0;
			precio[i] = nuevoPrecio;
		}
	}
}
