# language: es
# autor: EstefaniaTorres

Característica: Realizar checkout
  Como usuario de Swag Labs autenticado
  Quiero realizar el proceso de checkout
  Para continuar con la compra de un producto

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Swag Labs
    Cuando ingrese las credenciales correctas

      | username      | pasword      |
      | standard_user | secret_sauce |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @checkout

  Escenario: Realizar checkout
    Cuando agrega un producto al carrito
    Y realiza el checkout

      | nombre | apellido | codigoPostal |
      | Estefa | Torres   | 110111       |

    Entonces debe visualizar la información de la compra