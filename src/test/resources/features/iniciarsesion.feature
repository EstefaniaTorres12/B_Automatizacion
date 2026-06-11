# language: es
  #autor: EstefaniaTorres
Característica: Autenticar en la pagina de Biblioteca
  Como usuario de Swag Labs
  Quiero autenticar en el portal de Sawg Labs
Para poder acceder al contenido

@autenticacion

Escenario: Verificar la autenticacion exitosa en la pagina de Biblioteca
  Dado que el usuario se encuentra en la pagina de inicio de sesion de Biblioteca
  Cuando ingrese las credenciales correctas

    | email                | password |
    | admin@biblioteca.com | demo1234 |

  Entonces  se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.