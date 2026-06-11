# language: es

# autor: Estefania Torres

Característica: Registrar préstamos en la Biblioteca

  Como administrador de la Biblioteca
  Quiero registrar préstamos de libros
  Para controlar los libros entregados a los usuarios

  Antecedentes:
    Dado que el administrador ha iniciado sesion en la Biblioteca
    Y que el administrador se encuentra en la pagina de prestamos

  @registroPrestamo
  Escenario: Verificar el registro exitoso de un préstamo

    Cuando registra un nuevo prestamo con los siguientes datos

      | usuario  | libro      | fechaDevolucion |
      | Usuario1 | Clean Code | 15/06/2026      |

    Entonces se debe verificar que el prestamo fue registrado correctamente
