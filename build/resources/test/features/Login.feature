#language: es
Característica: HU-001 Login

  Esquema del escenario: Inicio de sesion exitoso
    Dado que estoy en la pagina de Guru q
    Cuando ingreso mi usuario y clave q
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces deberia ver el texto SIGN-OFFq

    Ejemplos:
      | Usuario    | Clave   |
      | mngr452530 | gUsEtUg |

