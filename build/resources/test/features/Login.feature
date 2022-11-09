#language: es
Característica: : HU-001 Login
@InicioSesion


  Esquema del escenario: Inicio de sesion exitoso
    Dado que estoy en la pagina de Guru
    Cuando ingreso mi usuario y clave
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces deberia ver el texto SIGN-OFF

    Ejemplos:
      | Usuario    | Clave   |
      | mngr452530 | gUsEtUg |

  @NewAccount
  Antecedentes:
    Dado que estoy en la pagina de Guru
    Cuando ingreso mi usuario y clave
      | usuario    | clave   |
      | mngr452530 | gUsEtUg |
  Esquema del escenario: Como usuario ingreso los datos de la nueva cuenta
    Cuando ingresa los datos de la cuenta que sera creada
      | id   | deposito   |
      | <Id> | <Deposito> |
    Entonces  deberia ver los datos que se quieren ingresar
    Ejemplos:
      | Id    | Deposito |
      | 17652 | 123456   |
