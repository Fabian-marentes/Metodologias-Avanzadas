#language: es
Característica: HU-001 Login

  Yo como Usuario
  Deseo ingresar al sistema
  Para poder hacer uso de las funcionalidades del sistema

  Antecedentes:
    Dado que estoy en la pagina de Guru99

  @Exitoso
  Esquema del escenario: Inicio de sesion exitoso
    Cuando ingreso mi usuario y claveU
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces deberia ver el texto SIGN-OFF.

    Ejemplos:
      | Usuario    | Clave   |
      | mngr455013 | esumAsa |

  @ClaveYUsuarioErroneos
  Esquema del escenario: Inicio de sesion campos erroneos
    Cuando ingreso credenciales erroneas
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces deberia ver que el usuario o la contraseña no son válidas
    Ejemplos:
      | Usuario    | Clave   |
      | mngr452530 | gUsEtUg |


  @CampoClaveVacio
  Esquema del escenario: Inicio de sesion campo en blanco
    Cuando ingreso un usuario y dejo el campo clave vacio
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces deberia ver que la contraseña no debe estar en blanco
    Ejemplos:
      | Usuario    | Clave |
      | mngr452530 |       |