// JavaScript Document
L = 0;  //Left position of the innerContentBox
T = 0;  //Top position of the innerContentBox
aMsg = new Array(); //Messages to show in the page
aToDoWhenLoaded = new Array(); //Array with some methods to execute when the page is loaded.

function toggle(id){
	obj = document.getElementById(id);
	if (obj.style.display=='none' || obj.style.display==''){
		obj.style.display = "block";
	} else	{
		obj.style.display = "none";
	}
	resizeInnerContentBox();
}

function writeMsg(i){
	txt = "";
	if (aMsg[i]){
		txt +="<p class=\"errorCode\">" + aMsg[i][0] + "</p>\n";
		txt +="<p>" + aMsg[i][1] + "</p>\n";
		document.getElementById("msgBox").innerHTML = txt;
	}			
}

function cb(){}
function resizeInnerContentBox(){}
function repositionMsgBox(){}
function repositionLoginBox(){}
function findPosX(obj){}
function findPosY(obj){}

function init(){
	objNav = document.getElementById("navigation");
	aLI = objNav.getElementsByTagName("li");
	if (navStatus>-1 && aLI[navStatus]){
		aLI[navStatus].className="on";
	}else{
		aLI[0].className="on";
	}

	if(aToDoWhenLoaded.length>0){
		for(iii=0;iii<aToDoWhenLoaded.length;iii++){
			eval(aToDoWhenLoaded[iii]);
		}
	}
}


window.onload   = init;
window.onresize = init;



