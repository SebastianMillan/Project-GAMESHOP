
<h1 align="center">
  <img src="https://i.postimg.cc/L8YMgnkK/icono-web-min.png" alt="Logo" width="160" height="200">
  <br>
    GAMESHOP
  <br>
</h1>
<h4 align="center">Tienda de venta de Videojuegos</h4>
<p align="center">
    CLIENTE:
    <br>
        - Username: user
    <br>
        - Password: 1234
    <br>
    ADMINISTRADOR:
    <br>
        - Username: admin
    <br>
        - Password: admin
    <br>
</p>

## FUNCIONAMIENTO :video_game:

* Nada mas entrar en la web se deberá de logearse con uno de los 'username' y 'password' de alguno de los usuarios creados en la base de datos.
* Una vez iniciado sesión se accederá al menú principal donde encontramos los diferentes productos que se muestran en columnas junto a algunos atributos. Cada uno tiene un botón para añadirlo al carrito y uno para visualizar sus detalles.
* Mediante un filtro múltiple a la izquierda de la página principal podremos hacer una busqueda avanzada de los productos.
* Mediante la barra de busqueda superior de la página principal podremos hacer una busqueda simple de productos.
* Al seleccionar un producto para su compra te lo añadirá a tu carrito de compra, el cuál al finalizar la compra se registrará como una nueva venta.
* En función de los privilegios el perfil mostrará secciónes diferentes.
* En ambos perfiles se podrá visualizar las compras realizadas por el usuario logeado y visualizar y editar los datos del usuario en cuestión.
* En el perfil del administrador se podrá visualizar las listas de usuarios, ventas y productos.
* En esas listas se podrá añadir, editar y borrar los diferentes elementos.
* En la vista de administrador se podrán visualizar algunas estadisticas generales de las compras realizadas en la tienda.

## ACTUALIZACIÓN FUTURA :hourglass:
* Implementación de consolas de videojuegos como productos para su respectiva compra.
* Implementación de la funcionalidad de comprar por parte de la tienda de videojuegos y consolas de segunda mano aplicandole un descuento a la venta final.
* Implementación de la funcionalidad de reservar consolas y videojuegos para obtener el producto mediante un email el día del lanzamiento del mismo.
* Implementación de un sistema de gráficos para una mejor visualización de las estadisticas de la tienda.

## PRUEBAS :radioactive:
Las tres A’s del Unit Testing - AAA (Arrange-Act-Assert)
| Arrange (Organizar) | Act (Actuar)   | Assert (Afirmar) |
| :---                | :---           |      :---:       |
| En la cesta de la compra añadir en la cantidad un número negativo | Al introducir un número negativo se añade automaticamente el número 0 | :heavy_check_mark: |
| En un formulario para añadir o editar un producto introducir un precio negativo | Al introducir un número negativo en el precio aparece un mensaje imposibilitando finalizar el formulario | :heavy_check_mark: |
| Cambiar manualmente la ruta del navegador sin pasar el login | Se redirecciona automaticamente al login porque es indispensable para inciar la aplicación web | :heavy_check_mark: |
| En el formulario de crear o editar usuario introducir un DNI falso o de formato erróneo | Se muestra un mensaje avisando del error y se imposibilita finalizar el formulario | :heavy_check_mark: |
| Iniciando como usuario sin privilegios intentar acceder a una ruta del administrador | Se muestra error de privilegios | :heavy_check_mark: |
| En la cesta quitar la cantidad y dejar el campo vacio | Error      | :x: |




