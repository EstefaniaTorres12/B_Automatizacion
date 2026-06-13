# language: es

Característica: Registrar libros en la Biblioteca

  Antecedentes:
    Dado que el administrador ha iniciado sesion en la Biblioteca
    Y que el administrador se encuentra en la pagina de libros

  @registroLibro
  Escenario: Verificar el registro exitoso de un libro

    Cuando registra un nuevo libro con los siguientes datos

      | titulo                | autor           | isbn           | cantidad |
      | Clean Code            | Robert Martin   | 9780132350884  | 5        |

    Entonces se debe verificar que el libro fue registrado correctamente