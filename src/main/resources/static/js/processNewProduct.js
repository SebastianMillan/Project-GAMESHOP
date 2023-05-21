function verificarPrecio() {
  let precio = parseFloat(document.getElementById("precio").value);
  if (precio < 0) {
    document.getElementById("errorPrecio").classList.add("mostrar");
    document.getElementById("login").disabled = true;
  } else {
    document.getElementById("errorPrecio").classList.remove("mostrar");
    document.getElementById("login").disabled = false;
  }
}