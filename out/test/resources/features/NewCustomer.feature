Feature: HU-001 new customer

  Background:
    Given que estoy en la pagina de Guru
    When ingreso mi usuario y clave
      | usuario    | clave   |
      | mngr339622 | EmygevU |

  Scenario Outline: I display the new customer window
    When I enter the client's data
      | nombre   | fecha   | direccion   | ciudad   | estado   | pin   | telefono   | correo   | contraseña   |
      | <Nombre> | <Fecha> | <Direccion> | <Ciudad> | <Estado> | <Pin> | <Telefono> | <Correo> | <Contraseña> |
    Then you should see the user created

    Examples:
      | Nombre       | Fecha      | Direccion | Ciudad | Estado   | Pin    | Telefono  | Correo               | Contraseña |
      | pepita perez | 13/08/2021 | Bogota    | Bogota | Colombia | 123411 | 123456456 | Pepita.perez@asd4.co | pepita1234 |
