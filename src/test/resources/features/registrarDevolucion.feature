# language: es

Característica: Registrar devolución de libros

  Como administrador de la Biblioteca
  Quiero registrar la devolución de un libro
  Para actualizar la disponibilidad del inventario

  Antecedentes:
    Dado que el administrador ha iniciado sesion en la Biblioteca
    Y que el administrador se encuentra en la pagina de prestamos

  @devolucion
  Escenario: Verificar la devolución exitosa de un libro

    Cuando registra la devolucion de un libro prestado

    Entonces se debe verificar que la devolucion fue registrada correctamente