# language: es
  #autor: EstefaniaTorres
Característica: Agregar producto al carrito
  Como usuario de Sawg Labs autenticado
  Quiero agregar un producto a mi carrito

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Swag Labs
    Cuando ingrese las credenciales correctas

      | username      | pasword      |
      | standard_user | secret_sauce |

    Entonces  se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @autenticacion

  Escenario:Agregar producto al carrito
    Cuando agrega un producto al carrito
    Entonces debe visualizar el producto en el carrito