#language: es
Característica:Creación historia de usuario
  #Yo
  #Como
  #quiero
  #Para
  Antecedentes:
    Dado que estoy en la pagina de Guru
    Cuando ingreso mi usuario y clave
      | usuario    | clave   |
      | mngr452530 | gUsEtUg |

  Esquema del escenario: Ingreso el nuevo usuario en la página
    Cuando ingresa los datos del cliente proximo a crear
      | nombre   | fecha   | direccion   | ciudad   | estado   | pin   | telefono   | correo   | contrasena   |
      | <Nombre> | <Fecha> | <Direccion> | <Ciudad> | <Estado> | <Pin> | <Telefono> | <Correo> | <Contrasena> |
    Entonces debería ver el usuario creado
    Ejemplos:
      | Nombre       | Fecha      | Direccion | Ciudad | Estado   | Pin    | Telefono  | Correo                 | Contrasena |
      | pepita perez | 13/08/2021 | Bogota    | Bogota | Colombia | 123411 | 123456456 | Pepita.perez@asd200.co | pepita1234 |

