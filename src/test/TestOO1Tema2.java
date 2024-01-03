package test; 

import java.time.LocalDateTime;

import modelo.SistemaSube;

public class TestOO1Tema2 
{
	public static void main(String[] args) 
	{
		///Sistema Sube:
		SistemaSube sistemaSube = new SistemaSube();
		
		///Test 1:
		System.out.println("Test 1:");
		try 
		{
			sistemaSube.agregarUsuario(44444444, "Nombre 1", "Apellido 1", false);
			sistemaSube.agregarUsuario(55555555, "Nombre 2", "Apellido 2", false);
			sistemaSube.agregarUsuario(66666666, "Nombre 3", "Apellido 3", true);
			System.out.println("Usuarios agregados...\n");
			System.out.println(sistemaSube.getUsuarios());
		}
		catch(Exception e) 
		{
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		///Test 2:
		System.out.println("Test 2:");
		try 
		{
			sistemaSube.agregarUsuario(55555555, "Nombre 2", "Apellido 2", false); //Excepción!
		}
		catch(Exception e) 
		{
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		///Test 3:
		System.out.println("Test 3:");
		try 
		{
			sistemaSube.agregarTarjeta("1234567890", sistemaSube.traerUsuario(44444444));
			sistemaSube.agregarTarjeta("1234567891", sistemaSube.traerUsuario(55555555));
			sistemaSube.agregarTarjeta("1234567892", sistemaSube.traerUsuario(66666666));
			System.out.println("Tarjetas agregadas...\n");
			System.out.println(sistemaSube.getTarjetas());
		}
		catch(Exception e) 
		{
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		///Test 4:
		System.out.println("Test 4:");
		try 
		{
			sistemaSube.agregarTarjeta("1234", sistemaSube.traerUsuario(55555555)); //Excepción!
		}
		catch(Exception e) 
		{
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		///Test 5:
		System.out.println("Test 5:");
		//Tarjeta 1:
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567890"), "Linea 1", "Medio 1", LocalDateTime.of(2023, 9, 1, 10, 0), 50.0);
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567890"), "Linea 2", "Medio 2", LocalDateTime.of(2023, 9, 1, 10, 30), 50.0);
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567890"), "Linea 3", "Medio 3", LocalDateTime.of(2023, 9, 2, 9, 0), 100.0);
	
		//Tarjeta 2:
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567891"), "Linea 1", "Medio 1", LocalDateTime.of(2023, 9, 1, 10, 0), 60.0);
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567891"), "Linea 2", "Medio 2", LocalDateTime.of(2023, 9, 2, 15, 0), 60.0);
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567891"), "Linea 3", "Medio 3", LocalDateTime.of(2023, 9, 3, 22, 0), 60.0);
		
		//Tarjeta 3:
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567892"), "Linea 1", "Medio 1", LocalDateTime.of(2023, 9, 1, 10, 0), 100.0);
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567892"), "Linea 2", "Medio 2", LocalDateTime.of(2023, 9, 2, 10, 30), 100.0);
		sistemaSube.agregarViaje(sistemaSube.traerTarjeta("1234567892"), "Linea 3", "Medio 3", LocalDateTime.of(2023, 9, 3, 10, 0), 100.0);
	
		System.out.println("Viajes agregados:\n");
		System.out.println(sistemaSube.getViajes());
		
		///Test 6:
		System.out.println("Test 6:");
		System.out.println("Viajes entre las fechas 2023-09-02T10:30 y 2023-09-03T10:00:\n");
		System.out.println(sistemaSube.traerViaje(LocalDateTime.of(2023, 9, 2, 10, 30), LocalDateTime.of(2023, 9, 3, 10, 0)));
		
		///Test 7:
		System.out.println("Test 7:");
		System.out.println("Total facturado entre las fechas 2023-09-02T10:30 y 2023-09-03T10:00 = $" + sistemaSube.calcularTotalFacturadoEntreFechas(LocalDateTime.of(2023, 9, 2, 10, 30), LocalDateTime.of(2023, 9, 3, 10, 0)) + "\n");	
	}
}
