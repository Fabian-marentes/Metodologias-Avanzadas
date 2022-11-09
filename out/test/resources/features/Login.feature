@SmokeTest
Feature: HU-001 Login
  Scenario Outline: Inicio de sesion exitoso
    Given que estoy en la pagina de Guru
    When ingreso mi usuario y clave
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Then deberia ver el texto SIGN-OFF

    Examples:
      | Usuario    | Clave   |
      | mngr339622 | EmygevU |

