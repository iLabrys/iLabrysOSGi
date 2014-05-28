// ------------------------------------------------------
// Función que muestra una alerta al usuario cuando una
// determinada funcionalidad no está implementada
// ------------------------------------------------------
function nodisponible() {
	alert("Función no disponible");
}

// ------------------------------------------------------
// Función que desconecta la sesión de usuario pidiendo
// confimación en primer lugar
// ------------------------------------------------------
function desconexion() {
	if (confirm("Desconectar usuario?")) {
		document.location.href = "/swf";
	}
}
