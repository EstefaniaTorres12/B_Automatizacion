# language: es
# autor: EstefaniaTorres

Característica: Editar o actualizar datos
  Como usuario de AlmaSoft autenticado
  Quiero actualizar los datos de mi perfil
  Para tener al dia mis datos en la plataforma

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | Correo            | Contrasena |
      | david14@gmail.com | 0123456789           |

  @editarCliente

  Escenario: Actualizar un perfil exitosamente
    Cuando actualice los datos del perfil y haga click en "Guardar cambios"

      | PrimerNombre | SegundoNombre | PrimerApellido | SegundoApellido | Correo            | Direccion | Contrasena |
      | David        | Editado  2    | Gonzales       | Roldan          | david14@gmail.com | Bogota    | 0123456789 |

    Entonces se debe verificar que los datos fueron actualizados correctamente.