#language: es
  #autor: Estefania Torres

Característica: Eliminar producto del carrito

Antecedentes:
Dado que el usuario se encuentra en la pagina de inicio de sesion de Swag Labs
Cuando ingrese las credenciales correctas

| username      | pasword      |
| standard_user | secret_sauce |

Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  Escenario: Eliminar producto del carrito
    Cuando agrega un producto al carrito
    Y elimina el producto del carrito
    Entonces el carrito debe quedar vacío