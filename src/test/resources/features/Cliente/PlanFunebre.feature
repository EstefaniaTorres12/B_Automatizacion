# language: es
# autor: EstefaniaTorres

Característica: Adquirir plan funerario
  Como usuario cliente autenticado
  Quiero adquirir un plan funerario
  Para acceder a los beneficios ofrecidos por AlmaSoft

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | Correo            | Contrasena |
      | david14@gmail.com | 0123456789 |

  @adquirirPlan

  Escenario: Adquirir un plan funerario exitosamente
    Cuando seleccione un plan funerario y complete la informacion de pago

      | MetodoPago | EntidadBancaria | TipoPersona | Correo            | PlanSeleccionado |
      | PSE        | Bancolombia     | Natural     | david14@gmail.com | Plan Premiun      |

    Entonces se debe verificar que el plan fue adquirido correctamente.