package modelo;

import java.time.LocalDateTime;

///Clase Viaje:
public class Viaje 
{
	///Atributos:
	private Tarjeta tarjeta;
	private String linea;
	private String medio;
	private LocalDateTime fechaHoraViaje;
	private double precio;
	
	///Constructor:
	public Viaje(Tarjeta tarjeta, String linea, String medio, LocalDateTime fechaHoraViaje, double precio) 
	{
		this.tarjeta = tarjeta;
		this.linea = linea;
		this.medio = medio;
		this.fechaHoraViaje = fechaHoraViaje;
		this.precio = precio;
	}

	///Getters:
	public Tarjeta getTarjeta() 
	{
		return tarjeta;
	}
	public String getLinea()
	{
		return linea;
	}
	public String getMedio()
	{
		return medio;
	}
	public LocalDateTime getFechaHoraViaje() 
	{
		return fechaHoraViaje;
	}
	public double getPrecio() 
	{
		return precio;
	}

	///Setters:
	public void setTarjeta(Tarjeta tarjeta) 
	{
		this.tarjeta = tarjeta;
	}
	public void setLinea(String linea) 
	{
		this.linea = linea;
	}
	public void setMedio(String medio) 
	{
		this.medio = medio;
	}
	public void setFechaHoraViaje(LocalDateTime fechaHoraViaje) 
	{
		this.fechaHoraViaje = fechaHoraViaje;
	}
	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}
	
	///Equals:
	public boolean equals(Viaje viaje) 
	{
		boolean iguales = false;
		if (this.tarjeta.equals(viaje.tarjeta) && this.linea.equalsIgnoreCase(viaje.linea) &&
			this.medio.equalsIgnoreCase(viaje.medio) && this.fechaHoraViaje.isEqual(viaje.fechaHoraViaje)
			&& this.precio == viaje.precio) 
		{
			iguales = true;
		}
		return iguales;
	}
	
	///To String:
	public String toString() 
	{
		return "Viaje:\n"
				+ tarjeta.toString()
				+ "Linea: " + linea + "\n"
				+ "Medio: " + medio + "\n"
				+ "Fecha y hora: " + fechaHoraViaje + "\n"
				+ "Precio: $" + precio + "\n";
	}
	
	///Total a pagar:
	//CU 7:
	public double totalAPagar() 
	{
		double totalAPagar = precio; //Inicialmente, el total a pagar será el precio original.
		if (tarjeta.getUsuario().getTieneDescuento() == true) //Si es un usuario con descuento...
		{
			totalAPagar = precio * 0.85; //El total es el 85% del precio original.
		}
		return totalAPagar;
	}
}
