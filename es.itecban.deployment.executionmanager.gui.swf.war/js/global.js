// ------------------------------------------------------
// Funci�n que muestra una alerta al usuario cuando una
// determinada funcionalidad no est� implementada
// ------------------------------------------------------
function nodisponible() {
	alert("Funci�n no disponible");
}

// ------------------------------------------------------
// Funci�n que desconecta la sesi�n de usuario pidiendo
// confimaci�n en primer lugar
// ------------------------------------------------------
function desconexion() {
	if (confirm("Desconectar usuario?")) {
		document.location.href = "/swf";
	}
}
