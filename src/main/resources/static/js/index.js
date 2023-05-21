function actualizarPrecio(inputCantidad) {
    let fila = inputCantidad.parentNode.parentNode; // Acceder a la fila completa
    let cantidad = parseInt(inputCantidad.value);
    let precioUnitario = parseFloat(fila.querySelector('.precioUnitario').textContent); // Obtener el precio unitario de la fila
    let importeElement = fila.querySelector('.importe'); // Obtener el elemento donde se mostrará el importe

    let importe = cantidad * precioUnitario;
    importeElement.textContent = importe.toFixed(2) + '€'; // Actualizar el importe en el elemento correspondiente
}

