# language: es
#autor: Michael Fonseca

Característica: Consultar libros en la Biblioteca
  Como administrador de la Biblioteca
  Quiero consultar los libros registrados
  Para visualizar el catalogo de libros disponible

  @consultarLibros
  Escenario: Verificar la consulta de libros

    Dado que el administrador se encuentra autenticado para consultar libros
    Cuando ingrese al modulo de libros
    Entonces se debe verificar que se visualice el listado de libros