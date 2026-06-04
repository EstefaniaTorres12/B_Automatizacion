# language: es
# autor: Estefania Torres

Característica: Crear un nuevo usuario

  Como usuario Administrador de AlmaSoft autenticado
  Quiero crear un nuevo usuario
  Para registrar usuarios en el sistema

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | Correo          | Contrasena |
      | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @crearUsuario
  Escenario: Crear un nuevo usuario exitosamente

    Cuando ingrese al módulo de usuarios
    Y diligencie el formulario con los datos válidos del usuario

      | rol    | documento | primerNombre | segundoNombre | primerApellido | segundoApellido | direccion      | telefono   | correo          | contrasena |
      | Asesor | 39764005  | Juana        | Dayana        | Perez          | Gomez           | Calle 10 #5-20 | 3001234568 | juana@gmail.com | 123456     |

    Entonces el sistema deberá mostrar el mensaje "Usuario creado correctamente"