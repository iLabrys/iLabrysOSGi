// ------------------------------------------------------
// Función que muestra una alerta al usuario cuando una
// determinada funcionalidad no está implementada
// ------------------------------------------------------
function nodisponible() {
	alert(js.artifactUtils.notAvailable);
}

// ------------------------------------------------------
// Función que desconecta la sesión de usuario pidiendo
// confimación en primer lugar
// ------------------------------------------------------
function desconexion() {
	if (confirm(js.artifactUtils.logout)) {
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
	
	if (chosenOption == -1) {alert(js.artifactUtils.selEnvironment); return false;}
	else {doProceed();}
}

function validatePlanRadio(radioForm) {
	chosenOption = -1;	
	
	if (radioForm.showPlan.length == null){
		if (radioForm.showPlan.checked) {
			chosenOption = 0;
		}
	}

	else{
		for (i=0; i < radioForm.showPlan.length; i++) {
			if (radioForm.showPlan[i].checked) {
				chosenOption = i;
				i = radioForm.showPlan.length;
			}
		}
	}
	
	if (chosenOption == -1) {alert(js.artifactUtils.selPlan); return false;}
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
	
	if (chosenOption == -1) {alert(js.artifactUtils.selUnitDeployment); return false;}
	else {return true;}
}


