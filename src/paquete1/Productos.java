package paquete1;

import java.util.Objects;

public abstract sealed class Productos  permits Detergente, Cereales,
	Vino{
	final private String marca;
	private double precio;
	
	Productos(String marca, double precio){
		this.marca = asignarMarca(marca);
		setPrecio(precio);
	}
	
	
	public String getMarca() {
		return this.marca;
	}
	
	
	
	
	
	private String asignarMarca(String marca) {
		return switch(marca) {
		case "Nestle" -> marca;
		case "Trustrus" ->  marca;
		default -> marca;
		};
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Productos other = (Productos) obj;
		return Objects.equals(marca, other.marca)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

	@Override
	public String toString() {
		return "Productos [marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
