#-------------------------------------------------------------------------------
# Copyright 2014 Indra
# 
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
# 
#   http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#-------------------------------------------------------------------------------
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

// ------------------------------------------------------
// Función que muestra una alerta al usuario cuando una
// determinada funcionalidad no está implementada
// ------------------------------------------------------
function nodisponible() {
	alert("No disponible");
}

// ------------------------------------------------------
// Función que desconecta la sesión de usuario pidiendo
// confimación en primer lugar
// ------------------------------------------------------
function desconexion() {
	if (confirm("¿Desconectar?")) {
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
	
	if (chosenOption == -1) {alert("Debe seleccionar una opción"); return false;}
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
	
	if (chosenOption == -1) {alert("Debe seleccionar una opción"); return false;}
	else {return true;}
}
