package modelo; 

///Clase Tarjeta:
public class Tarjeta
{
	///Atributos:
	private String codigo;
	private Usuario usuario;
	
	///Constructor:
	public Tarjeta(String codigo, Usuario usuario) throws Exception
	{
		setCodigo(codigo); 
		this.usuario = usuario;
	}

	///Getters:
	public String getCodigo() 
	{
		return codigo;
	}
	public Usuario getUsuario() 
	{
		return usuario;
	}

	///Setters:
	public void setCodigo(String codigo) throws Exception
	{
		if (!validarCodigo(codigo)) 
		{
			throw new Exception("Error! El codigo de la tarjeta debe tener 10 o mas digitos.\n");
		}
		this.codigo = codigo;
	}
	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
	
	///Equals:
	public boolean equals(Tarjeta tarjeta) 
	{
		boolean iguales = false;
		if (this.codigo.equalsIgnoreCase(tarjeta.codigo) && this.usuario.equals(tarjeta.usuario)) 
		{
			iguales = true;
		}
		return iguales;
	}
	
	///To String:
	public String toString() 
	{
		return "Tarjeta:\n"
				+ "Codigo: #" + codigo + "\n"
				+ usuario.toString();
	}
	
	///Validar código:
	public boolean validarCodigo(String codigo) 
	{
		boolean valido = false;
		if (codigo.length() >= 10) //Si tiene menos de 10 dígitos es inválido.
		{
			valido = true;
		}
		return valido;
	}
}
