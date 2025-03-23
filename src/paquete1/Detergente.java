package paquete1;

import java.util.Objects;

//Falta implementar interfaz esLiquido

public final class Detergente extends Productos implements ConDescuento {
	//Propiedades expansion detergente:
	private double cantidadLitros;
	private double descuento; 
	Detergente(String marca, double precio, double cantidadLitros) {
		super(marca, precio);
		setCantidadLitros(cantidadLitros);
		
	}

	
	
	
	public double getCantidadLitros() {
		return cantidadLitros;
	}

	public void setCantidadLitros(double cantidadLitros) {
		if(cantidadLitros > 0 && cantidadLitros < 10) 
			this.cantidadLitros = cantidadLitros;
		else 
			this.cantidadLitros=0;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = (getPrecio() / 100 * des) ;
		
	}

	@Override
	public double getDescuento() {
		return this.descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return getPrecio() - getDescuento();
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cantidadLitros, descuento, getMarca(), getPrecio(), getDescuento());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Detergente other = (Detergente) obj;
		return Double.doubleToLongBits(cantidadLitros) == Double.doubleToLongBits(other.cantidadLitros)
				&& Double.doubleToLongBits(descuento) == Double.doubleToLongBits(other.descuento)
				&& Objects.equals(getMarca(), other.getMarca())
				&& Double.doubleToLongBits(getPrecio()) == Double.doubleToLongBits(other.getPrecio());
	}




	@Override
	public String toString() {
		return "Detergente [cantidadLitros=" + cantidadLitros + ", descuento=" + descuento + ", getCantidadLitros()="
				+ getCantidadLitros() + ", getDescuento()=" + getDescuento() + ", getPrecioDescuento()="
				+ getPrecioDescuento() + ", getMarca()=" + getMarca() + ", getPrecio()=" + getPrecio() + "]";
	}

	
	
	


	
	





	
	
	
}
