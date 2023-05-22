function actualizarCantidad(venta_id, lineaVenta_id, nuevaCantidad){
    window.location.href= "/actualizarCantidad/venta/" + venta_id + "/lineaVenta/" + lineaVenta_id + "/cantidad/" + nuevaCantidad;
}

function verificarCantidad(lineaVenta_id) {
    let precio = parseInt(document.getElementById(lineaVenta_id).value);
    if (precio < 0) {
      document.getElementById("errorCantidad").classList.add("mostrar");
      document.getElementById("compra").disabled = true;
    } else {
      document.getElementById("errorCantidad").classList.remove("mostrar");
      document.getElementById("compra").disabled = false;
    }
}