#language: es
#autor: Estefania Torres

  Característica:  Crear una nueva categoria
    Como usuario Administrador de AlmaSoft autenticado
  Quiero crear una nueva categoria


  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | Correo          | Contrasena |
      | admin@gmail.com | 123456     |

    Entonces  se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

    @crearCategoria

    Escenario: Crear una nueva categoria exitosamente
      Cuando ingrese al modulo categorias
      Y diligencie el formulario con datos validos de la categoria

        | nombre      |
        | Categoria 1 |

      Entonces  el sistema debera mostrar el mensaje "Categoria creada correctamente"
