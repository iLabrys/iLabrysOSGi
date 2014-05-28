//Write Structure

function writeNavigation(){
	txt = "";
	for (i=0; i<aNavigation.length;i++){
		txtMore = "";
		if (aNavigation[i][2]){
			txtMore = aNavigation[i][2];
		}
		txt += "<a href=\"" + aNavigation[i][1] + "\" " + txtMore + ">" + aNavigation[i][0] + "</a>";
	}
	return txt;
}

function writeMenu(){
	txt = "";
	txt += "<div id=\"logoMenu\">";
	for (i=0; i<aMenu.length;i++){
		txt += "<div class=\"" + aMenu[i][0] + "\" onmouseover=\"this.className='" + aMenu[i][0] + "Over'\" onmouseout=\"this.className='" + aMenu[i][0] + "'\"><a href=\"" + aMenu[i][1] + "\"><img src=\"" + theme + "img/sp.gif\" border=\"0\"/></a></div>";
	}
	txt += "</div>";
	Tip(txt, BGCOLOR, '#000000', STICKY, true, CLICKCLOSE, true, BORDERCOLOR, '#FFFFFF', WIDTH, 0);
	return txt;
}

function writePreContent(){
	txt  = "";
	//txt += "<form id=\"f\" method=\"post\">\n";
	txt += "<div id=\"wrap\">\n";
	txt += "	<div id=\"logo\"><img src=\"" + theme + "img/logo.gif\" border=\"0\"></div>\n";
	txt += "	<div id=\"outerContentBox\">\n";
	txt += "		<div id=\"navigation\">" + writeNavigation() + "</div>\n";
	txt += "		<div id=\"innerContentBox\"><br /></div>\n";
	txt += "	</div>\n";
	txt += "</div>\n";
	txt += "\n";
	txt += "\n";
	txt += "\n";
	txt += "<div id=\"contentBox\">\n";
	txt += "	<div id=\"content\">\n";
	document.write(txt);
}

function writePostContent(){
	txt=  "";
	txt += "	</div>\n";
	txt += "	<div id=\"pie\">\n";
	txt += "		<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n";
	txt += "		<tr valign=\"top\">\n";
	txt += "			<td align=\"center\"><a href=\"#\"><img src=\"" + theme + "img/logoItecban.gif\" border=\"0\"></a></td>\n";
	txt += "			<td align=\"center\"><a href=\"#\"><img src=\"" + theme + "img/logoCajaMadrid.gif\" border=\"0\"></a></td>\n";
	txt += "			<td align=\"center\"><a href=\"#\"><img src=\"" + theme + "img/logoDitUpm.gif\" border=\"0\"></a></td>\n";
	txt += "			<td align=\"center\"><a href=\"#\"><img src=\"" + theme + "img/logoIndra.gif\" border=\"0\"></a></td>\n";
	txt += "		</tr>\n";
	txt += "		</table>\n";
	txt += "	</div>\n";
	txt += "</div>\n";
	txt += "	\n";
	txt += "<div id=\"loginBox\">\n";
	txt += "	<div class=\"user\">" + js_writePostContent_user + ": "+user+"</div>\n";
	txt += "	<div class=\"login\">[ <a href=\"../j_spring_security_logout\">" + js_writePostContent_logout + "</a> ]</div>\n";
	txt += "</div>\n";
	txt += "<div id=\"msgBox\"></div>\n";
	txt += "\n";
	txt += "	\n";
	txt += "		\n";
	//txt += "</form>\n";
	document.write(txt);
}