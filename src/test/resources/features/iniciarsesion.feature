# language: es
  #autor: EstefaniaTorres
Característica: Autenticar en la pagina de Sawg Labs
  Como usuario de Swag Labs
  Quiero autenticar en el portal de Sawg Labs
Para poder acceder al contenido

@autenticacion

Escenario: Verificar la autenticacion exitosa en la pagina de Swag Labs
  Dado que el usuario se encuentra en la pagina de inicio de sesion de Sawg Labs
  Cuando ingrese las credenciales correctas

    | username      | pasword      |
    | standard_user | secret_sauce |

  Entonces  se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.