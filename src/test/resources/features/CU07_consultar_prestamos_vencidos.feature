# language: es
#autor: MaicolFonseca

Característica: Consultar prestamos vencidos en la Biblioteca
  Como administrador de la Biblioteca
  Quiero consultar los prestamos vencidos
  Para visualizar los prestamos que excedieron la fecha de devolución

  @consultarPrestamosVencidos

  Escenario: Verificar la consulta de prestamos vencidos

    Dado que el usuario ha iniciado sesion correctamente en la Biblioteca

    Cuando ingrese al modulo de prestamos y consulte los prestamos vencidos

    Entonces se debe verificar que se visualice el listado de prestamos vencidos