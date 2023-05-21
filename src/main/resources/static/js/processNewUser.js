function verificarPasswords() {
    let pass1 = document.getElementById('contra');
    let pass2 = document.getElementById('repite-contra');

    if (pass1.value != pass2.value) {
        document.getElementById("errorPass").classList.add("mostrar");
        document.getElementById("login").disabled = true;
    } else {
        document.getElementById("errorPass").classList.remove("mostrar");
        document.getElementById("okPass").classList.remove("ocultar");
        document.getElementById("login").disabled = false;
    }
}
function validarDNI() {
    let dni = document.getElementById('dni').value;    
    let letras = 'TRWAGMYFPDXBNJZSQVHLCKE';
    let numero = dni.substr(0, dni.length - 1);
    let letra = dni.charAt(dni.length - 1).toUpperCase();
    let indice = numero % 23;

    if (letras.charAt(indice) === letra) {
        document.getElementById("errorDNI").classList.remove("mostrar");
        document.getElementById("okDNI").classList.remove("ocultar");
        document.getElementById("login").disabled = false;
    } else {
        document.getElementById("errorDNI").classList.add("mostrar");
        document.getElementById("login").disabled = true;
    }
}