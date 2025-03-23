package paquete1;

import java.time.LocalDate;
import java.util.Objects;

public final class Cereales extends Productos implements EsAlimento{
	final private String tipoCereal;
	final private double calorias;
	private LocalDate fc;
	Cereales(String marca, double precio, String tipoCereal) {
		super(marca, precio);
		this.tipoCereal=getTipoCereal(tipoCereal);
		this.calorias= getCalorias(tipoCereal);
		this.fc=LocalDate.now();
	}
	
	private String getTipoCereal(String tipoCereal){
		return switch(tipoCereal) {
		case "Espelta" -> tipoCereal;
		case "Maiz" -> tipoCereal;
		case "Trigo" -> tipoCereal;
		default -> "Otro";
		};
	}
	
	public String getTipoCereal() {
		return tipoCereal;
	}
	
	
	
	
	//A tener en cuenta: las calorías serán las siguientes: 5 si el cereal es espelta,
	//8 si es maíz, 12 si es trigo, y 15 en los demás casos
	private double getCalorias(String tipoCereal){
		return switch(tipoCereal) {
		case "Espelta" -> 5.0;
		case "Maiz" -> 8.0;
		case "Trigo" -> 12.0;
		default -> 15.0;
		};
		
	}

	@Override
	public int getCalorias() {
		return (int)this.calorias;
	}

	@Override
	public void setCaducidad(LocalDate fc) {
		this.fc=fc;
		
	}



	@Override
	public LocalDate getCaducidad() {
		return this.fc;
	}





	@Override
	public String toString() {
		return "Cereales [tipoCereal=" + tipoCereal + ", calorias=" + calorias + ", fc=" + fc + ", getMarca()="
				+ getMarca() + ", getPrecio()=" + getPrecio() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(calorias, fc, tipoCereal, getMarca(), getPrecio());
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
		Cereales other = (Cereales) obj;
		return Double.doubleToLongBits(calorias) == Double.doubleToLongBits(other.calorias)
				&& Objects.equals(fc, other.fc) && Objects.equals(tipoCereal, other.tipoCereal)
				&& Objects.equals(getMarca(), other.getMarca())
				&& Double.doubleToLongBits(getPrecio()) == Double.doubleToLongBits(other.getPrecio());
	}
	
	
	
	
	
	
}
