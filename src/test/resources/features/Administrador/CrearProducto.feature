# language: es
# autor: EstefaniaTorres

  Característica: Crear un nuevo producto
  Como usuario Administrador de AlmaSoft autenticado
  Quiero crear un nuevo producto
  Para tener más variedad de productos en la plataforma

  Antecedentes:
  Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

    | Correo          | Contrasena |
    | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @crearProducto

  Escenario: Crear un nuevo producto exitosamente
    Cuando ingrese al módulo de productos
    Y diligencie el formulario con los datos válidos del producto

      | nombre        | descripcion                    | precio | stock | estado | rutaImagen            | categoria | subcategoria   |
      | Ataud Clasico | Ataud hecho en madera de roble | 400000 | 20    | Activo | /img/AtaudClasico.jpg | Ataud     | Tamaño-Mediano |

    Entonces el sistema debe mostrar el mensaje "Producto creado exitosamente"

