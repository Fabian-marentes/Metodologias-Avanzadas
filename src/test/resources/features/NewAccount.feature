#language: es
Característica: HU-001 Login

  Yo como usuario ingr
  Quiero ingresar a guru99
  Para realizar

  Antecedentes:
    Dado que estoy en la pagina de Guru
    Cuando ingreso mi usuario y clave
      | usuario    | clave   |
      | mngr452530 | gUsEtUg |

  @NewCustomer
  Escenario: Ingreso el nuevo usuario en la página
    Cuando ingresa los datos del cliente proximo a crear
    Entonces debería ver el usuario creado

  @NewAccount
  Esquema del escenario: Como usuario ingreso los datos de la nueva cuenta
    Cuando ingresa los datos de la cuenta que sera creada
      | id   | deposito   |
      | <Id> | <Deposito> |
    Entonces  deberia ver los datos que se quieren ingresar
    Ejemplos:
      | Id    | Deposito |
      | 17652 | 123456   |


