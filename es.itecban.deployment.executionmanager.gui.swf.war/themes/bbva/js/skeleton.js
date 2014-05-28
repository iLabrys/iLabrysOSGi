var navStatus = -1;	
//Write Structure

function writeMenu(){
	txt = "";
	for (i=0; i<aMenu.length;i++){
		if (aMenu[i][2]){
			txt +="						<li class=\"on\"><a href=\""+ aMenu[i][1] + "\">"+ aMenu[i][3] + "</a></li>\n";			
		}else{
			txt +="						<li><a href=\""+ aMenu[i][1] + "\">"+ aMenu[i][3] + "</a></li>\n";			
		}
	}
	return txt;
}
	
function writeNavigation(){
	txt = "";
	for (i=0; i<aNavigation.length;i++){
		txtMore = "";
		txt += "<li><a href=\"" + aNavigation[i][1] + "\" " + txtMore + ">" + aNavigation[i][0] + "</a></li>";
	}
	return txt;
}

function writePreContent(){
	txt = "";

	txt +="		<div id=\"container\">\n";
	txt +="		  \n";
	txt +="			<div id=\"header\">\n";
	txt +="		    <div id=\"headerMenu\">\n";
	txt +="					<ul>\n";
	txt += writeMenu() + "\n";
	txt +="					</ul>\n";
	txt +="				</div>\n";
	txt +="				<div id=\"logo\"><img src=\"" + theme + "img/jovenes_tcm11-80343.jpg\" width=\"545\" height=\"100\" alt=\"Jóvenes\" border=\"0\" /></div>\n";
	txt +="				<div id=\"navigation\">\n";
	txt +="					<ul>\n";
	txt += writeNavigation() + "\n"; 
	
	
	txt +="					</ul>\n";
	txt +="\n";
	txt +="				</div>\n";
	txt +="		  </div>\n";
	txt +="		  \n";
	txt +="		  <div id=\"bodyContent\">\n";
	txt +="		    <div id=\"column\">\n";
	txt +="		      <div><p>"+ js_writePostContent_user + ": " + user + "</p></div>\n";
	txt +="		      <div><hr /></div>\n";
	txt +="		      <div id=\"msgBox\">\n";
	txt +="			  </div>\n";
	txt +="		      <div><br /><br /><br /><br /><br /><br /><br /><br /></div>\n";
	txt +="		    </div>\n";
	txt +="		    <div id=\"content\">\n";
	document.write(txt);
}

function writePostContent(){
	txt = "";

	txt+="		    </div>\n";
	txt+="		  </div>\n";
	txt+="		  <div id=\"footer\">\n";
	txt+="		    	<ul>\n";
	txt+="						<li><a href=\"#\">Itecban</a></li>\n";
	txt+="						<li><a href=\"#\">BBVA</a></li>\n";
	txt+="						<li><a href=\"#\">Indra</a></li>\n";
	txt+="						<li><a href=\"#\">Ilabrys</a></li>\n";
	txt+="					</ul>\n";
	txt+="		  </div>\n";
	txt+="		</div>\n";
	document.write(txt);
}

