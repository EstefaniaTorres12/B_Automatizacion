# language: es
# autor: EstefaniaTorres

Característica: Finalizar compra
  Como usuario de Swag Labs autenticado
  Quiero finalizar la compra de un producto
  Para completar exitosamente el pedido

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Swag Labs
    Cuando ingrese las credenciales correctas

      | username      | pasword      |
      | standard_user | secret_sauce |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @finalizarcompra

  Escenario: Finalizar compra
    Cuando finaliza la compra de un producto
    Entonces debe visualizar el mensaje de compra exitosa