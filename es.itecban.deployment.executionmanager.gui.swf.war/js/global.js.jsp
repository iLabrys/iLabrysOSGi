<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

// ------------------------------------------------------
// Funci�n que muestra una alerta al usuario cuando una
// determinada funcionalidad no est� implementada
// ------------------------------------------------------
function nodisponible() {
	alert("No disponible");
}

// ------------------------------------------------------
// Funci�n que desconecta la sesi�n de usuario pidiendo
// confimaci�n en primer lugar
// ------------------------------------------------------
function desconexion() {
	if (confirm("�Desconectar?")) {
		document.location.href = "/swf";
	}
}

function validateEnviromentRadio(radioForm) {
	chosenOption = -1;	
	
	if (radioForm.selectedEnvironment.length == null){
		if (radioForm.selectedEnvironment.checked) {
			chosenOption = 0;
		}
	}

	else{
		for (i=0; i < radioForm.selectedEnvironment.length; i++) {
			if (radioForm.selectedEnvironment[i].checked) {
				chosenOption = i;
				i = radioForm.selectedEnvironment.length;
			}
		}
	}
	
	if (chosenOption == -1) {alert("Debe seleccionar una opci�n"); return false;}
	else {return true;}
}


function validateDeploymentRadio(radioForm) {
	chosenOption = -1;	
	
	if (radioForm.selectedDeploymentUnit.length == null){
		if (radioForm.selectedDeploymentUnit.checked) {
			chosenOption = 0;
		}
	}

	else{
		for (i=0; i < radioForm.selectedDeploymentUnit.length; i++) {
			if (radioForm.selectedDeploymentUnit[i].checked) {
				chosenOption = i;
				i = radioForm.selectedDeploymentUnit.length;
			}
		}
	}
	
	if (chosenOption == -1) {alert("Debe seleccionar una opci�n"); return false;}
	else {return true;}
}