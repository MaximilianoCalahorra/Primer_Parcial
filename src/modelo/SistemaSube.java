package modelo;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

///Clase SistemaSube:
public class SistemaSube 
{
	///Atributos:
	private List<Usuario> usuarios;
	private List<Tarjeta> tarjetas;
	private List<Viaje> viajes;
	
	///Constructor:
	public SistemaSube() 
	{
		this.usuarios = new ArrayList<Usuario>();
		this.tarjetas = new ArrayList<Tarjeta>();
		this.viajes = new ArrayList<Viaje>();
	}

	///Getters:
	public List<Usuario> getUsuarios() 
	{
		return usuarios;
	}
	public List<Tarjeta> getTarjetas() 
	{
		return tarjetas;
	}
	public List<Viaje> getViajes() 
	{
		return viajes;
	}
	
	///To String:
	public String toString() 
	{
		String sistemaSube = "Sistema Sube:\n"
							 + "Usuarios:\n";
		for (int i = 0; i < usuarios.size(); i++) 
		{
			sistemaSube += usuarios.get(i).toString();
		}
		sistemaSube += "Tarjetas:\n";
		for (int i = 0; i < tarjetas.size(); i++) 
		{
			sistemaSube += tarjetas.get(i).toString();
		}
		sistemaSube += "Viajes:\n";
		for (int i = 0; i < viajes.size(); i++) 
		{
			sistemaSube += viajes.get(i).toString();
		}
		return sistemaSube;
	}
	
	
	///Traer:
	//CU 1:
	public Usuario traerUsuario(long dni) 
	{
		Usuario usuarioAuxiliar = null;
		Usuario usuarioBuscado = null;
		int i = 0;
		while (i < usuarios.size() && usuarioBuscado == null) 
		{
			usuarioAuxiliar = usuarios.get(i);
			if (usuarioAuxiliar.getDni() == dni) 
			{
				usuarioBuscado = usuarioAuxiliar;
			}
			i++;
		}
		return usuarioBuscado;
	}
	
	//CU 4:
	public Tarjeta traerTarjeta(String codigo) 
	{
		Tarjeta tarjetaAuxiliar = null;
		Tarjeta tarjetaBuscada = null;
		int i = 0;
		while (i < tarjetas.size() && tarjetaBuscada == null) 
		{
			tarjetaAuxiliar = tarjetas.get(i);
			if (tarjetaAuxiliar.getCodigo().equalsIgnoreCase(codigo)) 
			{
				tarjetaBuscada = tarjetaAuxiliar;
			}
			i++;
		}
		return tarjetaBuscada;
	}
	
	//CU 6:
	public List<Viaje> traerViaje(LocalDateTime desde, LocalDateTime hasta)
	{
		List<Viaje> viajesEntreFechas = new ArrayList<Viaje>();
		Viaje viajeAuxiliar = null;
		for (int i = 0; i < viajes.size(); i++) 
		{
			viajeAuxiliar = viajes.get(i);
			if (!(viajeAuxiliar.getFechaHoraViaje().isBefore(desde)) &&
				!(viajeAuxiliar.getFechaHoraViaje().isAfter(hasta))) 
			{
				viajesEntreFechas.add(viajeAuxiliar);
			}
		}
		return viajesEntreFechas;
	}
	
	///Agregar:
	//CU 2:
	public boolean agregarUsuario(long dni, String nombre, String apellido, boolean tieneDescuento) throws Exception
	{
		if (traerUsuario(dni) != null) 
		{
			throw new Exception("Error! El usuario con DNI #" + dni + " ya existe en la lista de usuarios.\n");
		}
		int idUsuarioNuevo = 1; //El primer usuario será de ID 1.
		if (usuarios.size() > 0) 
		{
			int tamanio = usuarios.size();
			idUsuarioNuevo = usuarios.get(tamanio - 1).getId() + 1;
		}
		return usuarios.add(new Usuario(idUsuarioNuevo, dni, nombre, apellido, tieneDescuento));
	}
	
	//CU 3:
	public boolean agregarTarjeta(String codigo, Usuario usuario) throws Exception
	{
		return tarjetas.add(new Tarjeta(codigo, usuario));
	}
	
	//CU 5:
	public boolean agregarViaje(Tarjeta tarjeta, String linea, String medio, LocalDateTime fechaHoraViaje, double precio) 
	{
		return viajes.add(new Viaje(tarjeta, linea, medio, fechaHoraViaje, precio));
	}
	
	///Calcular total entre fechas:
	//CU 8:
	public double calcularTotalFacturadoEntreFechas(LocalDateTime desde, LocalDateTime hasta) 
	{
		List<Viaje> viajesEntreFechas = traerViaje(desde, hasta);
		double totalFacturado = 0;
		for (int i = 0; i < viajesEntreFechas.size(); i++) 
		{
			totalFacturado += viajesEntreFechas.get(i).totalAPagar();
		}
		return totalFacturado;
	}
}
