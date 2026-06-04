# language: es
  #autor: EstefaniaTorres
Característica: Autenticar en la pagina de AlmaSoft
  Como usuario de AlmaSoft
  Quiero autenticar en el portal de AlmaSoft
Para poder acceder al contenido y funcionalidades disponibles segun mi rol y cuenta.

@autenticacion

Escenario: Verificar la autenticacion exitosa en la pagina de AlmaSoft
  Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

    | correo            | contrasena |
    | david14@gmail.com | 0123456789           |
  Entonces  se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.