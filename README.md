# Descripción del programa
**Consiste en mi resolución del primer parcial de la materia de Orientación a Objetos I de la carrera de Sistemas de la UNLa**.

**Está desarrollado completamente en Java mediante el paradigma de la POO, aplicando conceptos tales como clases, atributos, métodos, polimorfismo, reutilización de código y manejo de excepciones y de fechas y horas**.

*Lamentablemente no cuento con las consignas detalladas de ese parcial, pero a partir de mi resolución voy a hacer una reconstrucción del modelo provisto, los casos de uso y test solicitados*.

**Modelo**:
![modelo](https://github.com/MaximilianoCalahorra/Primer_Parcial/assets/152804837/7694adca-5446-4155-9a49-0bcb1a552dc2)

**Casos de uso**:
- #1: + traerUsuario(long dni): Usuario 
- #2: + agregarUsuario(long dni, String nombre, String apellido, boolean tieneDescuento): boolean
  - Lanza una excepción si el usuario ya existe.
  - ID del usuario autoincrementable según altas y bajas.
- #3: + agregarTarjeta(String codigo, Usuario usuario): boolean
  - Lanza una excepción en caso de que el código de la tarjeta tenga menos de 10 caracteres.
- #4: + traerTarjeta(String codigo): Tarjeta
- #5: + agregarViaje(Tarjeta tarjeta, String linea, String medio, LocalDateTime fechaHoraViaje, double precio): boolean
- #6: + traerViaje(LocalDateTime desde, LocalDateTime hasta): List\<Viaje>
- #7: + totalAPagar(): double
- #8: + calcularTotalFacturadoEntreFechas(LocalDateTime desde, LocalDateTime hasta): double

**Test**:
- #1: Agregar los siguientes usuarios e imprimir la lista:
  - Usuario = \[dni = 44444444, nombre = "Nombre 1", apellido = "Apellido 1", tieneDescuento = false]
  - Usuario = \[dni = 55555555, nombre = "Nombre 2", apellido = "Apellido 2", tieneDescuento = false]
  - Usuario = \[dni = 66666666, nombre = "Nombre 3", apellido = "Apellido 3", tieneDescuento = true]
- #2: Intentar agregar el siguiente usuario:
  - Usuario = \[dni = 55555555, nombre = "Nombre 2", apellido = "Apellido 2", tieneDescuento = false]
- #3: Agregar las siguientes tarjetas e imprimir la lista:
  - Tarjeta = \[codigo = "1234567890", usuario = \[dni = 44444444, nombre = "Nombre 1", apellido = "Apellido 1", tieneDescuento = false]]
  - Tarjeta = \[codigo = "1234567891", usuario = \[dni = 55555555, nombre = "Nombre 2", apellido = "Apellido 2", tieneDescuento = false]]
  - Tarjeta = \[codigo = "1234567892", usuario = \[dni = 66666666, nombre = "Nombre 3", apellido = "Apellido 3", tieneDescuento = true]]
- #4: Intentar agregar la siguiente tarjeta:
  - Tarjeta = \[codigo = "1234", usuario = \[dni = 55555555, nombre = "Nombre 2", apellido = "Apellido 2", tieneDescuento = false]]
- #5: Agregar los siguientes viajes e imprimir la lista:
  - Viaje = \[tarjeta = \[codigo = "1234567890", usuario = \[dni = 44444444, nombre = "Nombre 1", apellido = "Apellido 1", tieneDescuento = false], linea = "Linea 1", medio = "Medio 1", fechaHoraViaje = 2023-09-01T10:00, precio = 50.0]
  - Viaje = \[tarjeta = \[codigo = "1234567890", usuario = \[dni = 44444444, nombre = "Nombre 1", apellido = "Apellido 1", tieneDescuento = false], linea = "Linea 2", medio = "Medio 2", fechaHoraViaje = 2023-09-01T10:30, precio = 50.0]
  - Viaje = \[tarjeta = \[codigo = "1234567890", usuario = \[dni = 44444444, nombre = "Nombre 1", apellido = "Apellido 1", tieneDescuento = false], linea = "Linea 3", medio = "Medio 3", fechaHoraViaje = 2023-09-02T09:00, precio = 100.0]
  - Viaje = \[tarjeta = \[codigo = "1234567891", usuario = \[dni = 55555555, nombre = "Nombre 2", apellido = "Apellido 2", tieneDescuento = false], linea = "Linea 1", medio = "Medio 1", fechaHoraViaje = 2023-09-01T10:00, precio = 60.0]
  - Viaje = \[tarjeta = \[codigo = "1234567891", usuario = \[dni = 55555555, nombre = "Nombre 2", apellido = "Apellido 2", tieneDescuento = false], linea = "Linea 2", medio = "Medio 2", fechaHoraViaje = 2023-09-02T15:00, precio = 60.0]
  - Viaje = \[tarjeta = \[codigo = "1234567891", usuario = \[dni = 55555555, nombre = "Nombre 2", apellido = "Apellido 2", tieneDescuento = false], linea = "Linea 3", medio = "Medio 3", fechaHoraViaje = 2023-09-03T22:00, precio = 60.0]
  - Viaje = \[tarjeta = \[codigo = "1234567892", usuario = \[dni = 66666666, nombre = "Nombre 3", apellido = "Apellido 3", tieneDescuento = true], linea = "Linea 1", medio = "Medio 1", fechaHoraViaje = 2023-09-01T10:00, precio = 100.0]
  - Viaje = \[tarjeta = \[codigo = "1234567892", usuario = \[dni = 66666666, nombre = "Nombre 3", apellido = "Apellido 3", tieneDescuento = true], linea = "Linea 2", medio = "Medio 2", fechaHoraViaje = 2023-09-02T10:30, precio = 100.0]
  - Viaje = \[tarjeta = \[codigo = "1234567892", usuario = \[dni = 66666666, nombre = "Nombre 3", apellido = "Apellido 3", tieneDescuento = true], linea = "Linea 3", medio = "Medio 3", fechaHoraViaje = 2023-09-03T10:00, precio = 100.0]
- #6: Imprimir los viajes que hayan sido realizados entre las fechas 2023-09-02T10:30 y 2023-09-03T10:00.
- #7: Imprimir el total facturado entre las fechas 2023-09-02T10:30 y 2023-09-03T10:00.

*Gracias por interesarte en visitar este repositorio y leer acerca de él*.

¡Saludos!

Maximiliano Calahorra.
