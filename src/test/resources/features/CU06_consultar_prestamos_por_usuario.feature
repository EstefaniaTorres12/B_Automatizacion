# language: es
#autor: Michael Fonseca

Característica: Consultar prestamos por usuario en la Biblioteca
  Como administrador de la Biblioteca
  Quiero consultar los prestamos de un usuario
  Para visualizar los prestamos asociados al usuario

  @consultarPrestamosPorUsuario

  Escenario: Verificar la consulta de prestamos por usuario

    Dado que el usuario ha iniciado sesion correctamente en la Biblioteca

    Cuando ingrese al modulo de usuarios y consulte los prestamos de un usuario

    Entonces se debe verificar que se visualice el detalle de prestamos del usuario