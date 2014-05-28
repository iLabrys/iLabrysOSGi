// JavaScript Document
L = 0;  //Left position of the innerContentBox
T = 0;  //Top position of the innerContentBox
aMsg = new Array(); //Messages to show in the page
aToDoWhenLoaded = new Array(); //Array with some methods to execute when the page is loaded.


function findPosX(obj){
	var curleft = 0;
	if(obj.offsetParent){
		while(1){
			curleft += obj.offsetLeft;
			if(!obj.offsetParent){
      	break;
      }
			obj = obj.offsetParent;
		}
	}else if(obj.x){
  	curleft += obj.x;
  }
	return curleft;
}

function findPosY(obj){
	var curtop = 0;
	if(obj.offsetParent){
		while(1){
    	curtop += obj.offsetTop;
    	if(!obj.offsetParent){
      	break;
      }
    	obj = obj.offsetParent;
    }
  }else if(obj.y){
  	curtop += obj.y;
  }
	return curtop;
}

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
		txt += "<h1 class=\"" + aMsg[i][0] + "\">" + aMsg[i][0] + "</h1>\n";
		txt += "<p>" + aMsg[i][1] + "</p>\n";
		document.getElementById("msgBox").innerHTML = txt;
	}			
}
			
function resizeInnerContentBox(){
	L = findPosX(document.getElementById("innerContentBox"));
	T = findPosY(document.getElementById("innerContentBox"));
	
	objContentBox = document.getElementById("contentBox");
	objContentBox.style.left = L ;
	objContentBox.style.top  = T + 15;
	objContentBox.style.visibility = "visible";
	
	if (document.all){
		document.getElementById("innerContentBox").style.height = document.getElementById("contentBox").offsetHeight + 30;
	}else{
		document.getElementById("innerContentBox").style.height = document.getElementById("contentBox").offsetHeight;
	}
}

function repositionMsgBox(){
	objMsgBox = document.getElementById("msgBox");
	objMsgBox.style.left = L + 435;
	objMsgBox.style.top  = T + 45;
	objMsgBox.style.visibility = "visible"; 
}

function repositionLoginBox(){
	objLoginBox = document.getElementById("loginBox");
	objLoginBox.style.left = L + 435;
	objLoginBox.style.top  = T + 15;
	objLoginBox.style.visibility = "visible";
}

function init(){
	resizeInnerContentBox();
	repositionMsgBox();
	repositionLoginBox();

	if(aToDoWhenLoaded.length>0){
		for(iii=0;iii<aToDoWhenLoaded.length;iii++){
			eval(aToDoWhenLoaded[iii]);
		}
	}
}

function cb(){
	document.getElementById("contentBox").style.width= "640px";
}


window.onload   = init;
window.onresize = init;



