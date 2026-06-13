# language: es
# autor: MichaelFonseca

Característica: Consultar prestamos activos en la Biblioteca

  Como administrador de la Biblioteca
  Quiero consultar los prestamos activos
  Para visualizar los prestamos vigentes registrados en el sistema

  @consultarPrestamosActivos

  Escenario: Verificar la consulta de prestamos activos

    Dado que el usuario ha iniciado sesion correctamente en la Biblioteca

    Cuando ingrese al modulo de prestamos

    Entonces se debe verificar que se visualice el listado de prestamos activos