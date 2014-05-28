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



