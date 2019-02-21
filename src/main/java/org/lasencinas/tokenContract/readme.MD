# Clase TokenContract

Esta clase representa un contrato inteligente en nuestra plataforma. Lleva un control del número de tokens que existen de un producto, por ejemplo una entrada de concierto, y a quién pertenecen.
Todo contrato tiene un propietario.

### ATRIBUTOS
- *Todos los que exijan los métodos de la clase.*

- ```balances``` contiene una tabla que hace el seguimiento de cuántos tokens pertenecen a cada propietario.

MÉTODOS
- ```name``` devuelve el nombre del token de forma human-readable (p.e., “US Dollars”).
- ```symbol()``` devuelve el nombre del símbolo del token de forma human-readable (p.e., “USD”).
- ```totalSupply()``` devuelve el total de unidades de este token que actualmente existen.
- ```addOwner(PublicKey PK, Double units)``` añade un propietario a ```balances```.
- ```numOwners()``` devuelve el numero de propietarios en ```balances```.
- ```balanceOf(PublicKey owner)``` devuelve el numero de tokens de un propietario.
- ```transfer(PublicKey recipient, Double units)``` transfiere tokens del propietario del contrato a la dirección de destino.
- ```transfer(PublicKey sender, PublicKey recipient, Double units)``` transfiere tokens del sender al recipient.
- ```require(Boolean holds) throws Exception``` lanza una excepción cuando holds es ```false```.
- ```owners()``` muestra en consola todos los propietarios.
- ```payable(PublicKey recipient, Double enziniums)``` envía los tokens a la dirección recipient y envía los enziniums al propietario del contrato.
