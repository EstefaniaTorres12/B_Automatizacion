# language: es
# autor: Estefania Torres

Característica: Registrar usuarios en la Biblioteca

  Como administrador de la Biblioteca
  Quiero registrar nuevos usuarios
  Para gestionar los préstamos de libros

  Antecedentes:
    Dado que el administrador ha iniciado sesion en la Biblioteca

  @registroUsuario
  Escenario: Verificar el registro exitoso de un usuario

    Dado que el administrador se encuentra en la pagina de usuarios

    Cuando registra un nuevo usuario con los siguientes datos

      | telefono   | password |
      | 3001234567 | demo123  |

    Entonces se debe verificar que el usuario fue registrado correctamente
