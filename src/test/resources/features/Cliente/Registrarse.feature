# language: es
# autor: EstefaniaTorres

Característica: Registro de usuario en AlmaSoft
  Como nuevo usuario de AlmaSoft
  Quiero registrarme en la plataforma
  Para poder acceder al sistema mediante una cuenta.

  @registro

  Escenario: Verificar el registro exitoso de un cliente
    Dado que el usuario se encuentra en la pagina de registro de AlmaSoft
    Cuando ingrese los datos requeridos correctamente

      | documento  | primerNombre | segundoNombre | primerApellido | segundoApellido | correo            | direccion | telefono   | contraseña | fechaNacimiento |
      | 1020304050 | Liliana      | Maria         | Corredor       | Lopez           | Liliana@gmail.com | Medellin  | 3115644244 | 123456     | 10/12/2000      |

    Entonces se debe verificar que el usuario haya sido registrado correctamente.