#language: es
Característica: HU-001 Login

  Yo como usuario
  Quiero ingresar a guru99
  Para realizar

  Antecedentes:
    Dado que estoy en la pagina de Guru
    Cuando ingreso mi usuario y clave
      | usuario    | clave   |
      | mngr452530 | gUsEtUg |


  @NewAccount
  Esquema del escenario: Como usuario ingreso los datos de la nueva cuenta
    Cuando ingresa los datos de la cuenta que sera creada
      | id   | deposito   |
      | <Id> | <Deposito> |
    Entonces  deberia ver los datos que se quieren ingresar
    Ejemplos:
      | Id    | Deposito |
      | 17652 | 123456   |

  @NewCustomer
  Esquema del escenario: Ingreso el nuevo usuario en la página
    Cuando ingresa los datos del cliente proximo a crear
      | nombre   | fecha   | direccion   | ciudad   | estado   | pin   | telefono   | correo   | contrasena   |
      | <Nombre> | <Fecha> | <Direccion> | <Ciudad> | <Estado> | <Pin> | <Telefono> | <Correo> | <Contrasena> |
    Entonces debería ver el usuario creado
    Ejemplos:
      | Nombre       | Fecha      | Direccion | Ciudad | Estado   | Pin    | Telefono  | Correo                 | Contrasena |
      | pepita perez | 13/08/2021 | Bogota    | Bogota | Colombia | 123411 | 123456456 | Pepita.perez@asd200.co | pepita1234 |
