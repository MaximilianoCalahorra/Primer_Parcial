# Descripción del programa
Consiste en mi resolución al primer parcial de la materia de Orientación a Objetos I de la carrera de Sistemas de la UNLa.

Está desarrollado completamente en Java mediante el paradigma de la POO, aplicando conceptos tales como clases, atributos, métodos, polimorfismo, reutilización de código y manejo de excepciones y de fechas y horas.

Lamentablemente no cuento con las consignas detalladas de ese parcial, pero a partir de él voy a hacer una reconstrucción del modelo provisto, los casos de uso y test solicitados.

Modelo:
![modelo](https://github.com/MaximilianoCalahorra/Primer_Parcial/assets/152804837/952fbd89-6846-404b-b06e-4d0d47812265)

Casos de uso:
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

Test:
Pendientes...
