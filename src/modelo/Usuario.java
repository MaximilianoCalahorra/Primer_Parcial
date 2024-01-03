package modelo; 

///Clase Usuario:
public class Usuario
{
	///Atributos:
	private int id;
	private long dni;
	private String nombre;
	private String apellido;
	private boolean tieneDescuento;
	
	///Constructor:
	public Usuario(int id, long dni, String nombre, String apellido, boolean tieneDescuento) 
	{
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tieneDescuento = tieneDescuento;
	}

	///Getters:
	public int getId()
	{
		return id;
	}
	public long getDni() 
	{
		return dni;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public boolean getTieneDescuento() {
		return tieneDescuento;
	}


	///Setters:
	public void setId(int id)
	{
		this.id = id;
	}
	public void setDni(long dni) 
	{
		this.dni = dni;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	public void setTieneDescuento(boolean tieneDescuento) 
	{
		this.tieneDescuento = tieneDescuento;
	}
	
	///Equals:
	public boolean equals(Usuario usuario) 
	{
		boolean iguales = false;
		if (this.id == usuario.id && this.dni == usuario.dni && this.nombre.equalsIgnoreCase(usuario.nombre)
			&& this.apellido.equalsIgnoreCase(usuario.apellido) && this.tieneDescuento == usuario.tieneDescuento)
		{
			iguales = true;
		}
		return iguales;
	}
	
	///To String:
	public String toString()
	{
		return "Usuario:\n"
			   + "ID: #" + id + "\n"
			   + "DNI: #" + dni + "\n"
			   + "Nombre: " + nombre + "\n"
			   + "Apellido: " + apellido + "\n"
			   + "Tiene descuento? " + tieneDescuento + "\n";
	}	
}
