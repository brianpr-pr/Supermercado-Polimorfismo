package paquete1;

import java.util.Objects;

public final class Vino extends Productos implements EsLiquido, ConDescuento {
	final private String tipoVino;
	final private double gradosAlchol;
	final private double calorias;
	final private String tipoEnvase;
	
	private double volumen;
	private double descuento;
	
	
	
	Vino(String marca, double precio, String tipoVino, double volumen) {
		super(marca, precio);
		this.tipoVino = getTipoVino(tipoVino);
		this.gradosAlchol = getGradosAlchol(tipoVino);
		this.calorias= getCalorias(this.gradosAlchol);
		setVolumen(volumen);
		this.tipoEnvase = setTipoEnvaseFinal();
		this.descuento=0;
	}
	

	private String getTipoVino(String tipoVino) {
		return switch(tipoVino) {
		case "Afrutado" -> tipoVino;
		case "Blanco" -> tipoVino;
		case "Tinto" -> tipoVino;
		default -> "Desconocido";
		};
	}
	
	
	public String getTipoVino() {
		return this.tipoVino;
		};
	

	
	
	private double getGradosAlchol(String tipoVino) {
		return switch(tipoVino) {
		case "Afrutado" -> 12.3;
		case "Blanco" -> 15.5;
		case "Tinto" -> 20;
		default -> 22.22;
		};
	}
	
	
	public double getGradosAlchol() {
		return this.gradosAlchol;
	}
	
	
	
	
	
	private double getCalorias(double gradosAlchol) {
		return gradosAlchol = gradosAlchol * 10; 
	}
	
	public double getCalorias() {
		return this.calorias;
	};
	

	@Override
	public void setVolumen(double v) {
		if(v > 0) {
			this.volumen =v;
		}
		
	}

	@Override
	public double getVolumen() {
		return this.volumen;
	}

	private  String setTipoEnvaseFinal() {
		
		if(this.getVolumen() > 0 && this.getVolumen() <=1.55) 
			return "Brick";
		else if(this.getVolumen() > 1.55 && this.getVolumen() <= 3.00) 
			return "Botella";
		else if(this.getVolumen() > 3.00 && this.getVolumen() <= 6.00) 
			return "Garrafa";
		return "Desconocido";
	}
	
	

	@Override
	public String getTipoEnvase() {
		return this.tipoEnvase;
	}

	@Override
	public void setDescuento(double des) {
		this.descuento = this.descuento / 100 * des ;
	}

	@Override
	public double getDescuento() {
		return descuento;
	}

	@Override
	public double getPrecioDescuento() {
		return this.getPrecio() - this.descuento;
	}

	@Override
	public String toString() {
		return "Vino [tipoVino=" + tipoVino + ", gradosAlchol=" + gradosAlchol + ", calorias=" + calorias + ", volumen="
				+ volumen + ", tipoEnvase=" + tipoEnvase + ", descuento=" + descuento + ", getMarca()=" + getMarca()
				+ ", getPrecio()=" + getPrecio() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(calorias, descuento, gradosAlchol, tipoEnvase, tipoVino, volumen, getMarca(), getPrecio());
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
		Vino other = (Vino) obj;
		return Double.doubleToLongBits(calorias) == Double.doubleToLongBits(other.calorias)
				&& Double.doubleToLongBits(descuento) == Double.doubleToLongBits(other.descuento)
				&& Double.doubleToLongBits(gradosAlchol) == Double.doubleToLongBits(other.gradosAlchol)
				&& Objects.equals(tipoEnvase, other.tipoEnvase) && Objects.equals(tipoVino, other.tipoVino)
				&& Double.doubleToLongBits(volumen) == Double.doubleToLongBits(other.volumen)
				&& Objects.equals(getMarca(), other.getMarca())
				&& Double.doubleToLongBits(getPrecio()) == Double.doubleToLongBits(other.getPrecio());
	}

//Se que en la correcion me vas a comentar esto pero hacia dias que no miraba el codigo de este ejercicio y vi 
	//lo de el envase que no era final y pense espera envase deberia de ser final
	//luego me di cuenta de la interfaz tiene un metodo que me obliga a implementar el metodo.... en fin...
	@Override
	public void setTipoEnvase(String env) {
		System.out.println("El envase para este objecto es : " + this.getTipoEnvase() + " esto no es modificable..");
		
	}
	
	
	
	
	
	

}
