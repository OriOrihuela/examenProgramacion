# ENZINIUM

#### Contratos inteligentes con enZinium.

Rick va a organizar un concierto de Los Ricknillos y quiere poner a la venta 100 entradas en
nuestra plataforma enZinium.
- Para ello va a utilizar un contrato inteligente construido sobre nuestra plataforma.
- Este contrato recibira instrucciones sobre a quien vender las entradas.
- El contrato almacenara que usuarios/as de la plataforma poseen las entradas.
Cada usuario/a dipone de una Address /direccion en la plataforma, desde la
que gestionar sus enZiniums y las entradas.

#### El proyecto consta de 4 clases que interactúan entre ellas, demostrando sus relaciones mediante la inyección de dependencias.
#### Éstas clases son:
- App (**clase main para checkear la salida del código; su código es intocable**)
- Address
- TokenContract
- GenSig (clase soporte que nos permitirá genera pares de llaves, tanto pública como privada)

El proyecto ha de defender la lógica propuesta en el **PDF** adjunto al repositorio. Es necesario entregar un **diagrama UML** representando
las clases y sus relaciones. Finalmente, las **historias de usuario** correspondientes a la clase *App* deben realizarse y presentarse
mediante el formato propuesto hasta la fecha.
