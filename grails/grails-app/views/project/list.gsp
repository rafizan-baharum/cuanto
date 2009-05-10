%{--

 Copyright (c) 2008 thePlatform, Inc.

This file is part of Cuanto, a test results repository and analysis program.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.


--}%

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
	<meta name="layout" content="main"/>

	<g:javascript src="prototype/moo.fx.js"/>
	<g:javascript src="prototype/accordion.js"/>
	<p:css name='accordion'/>
	<p:css name='../js/yui/2.6.0/button/assets/skins/sam/button'/>
	<p:css name='../js/yui/2.6.0/autocomplete/assets/skins/sam/autocomplete'/>

	<yui:javascript dir="button" file="button-min.js" version="2.6.0"/>
	<yui:javascript dir="datasource" file="datasource-min.js" version="2.6.0"/>
	<yui:javascript dir="animation" file="animation-min.js" version="2.6.0"/>
	<yui:javascript dir="json" file="json-min.js" version="2.6.0"/>
	<yui:javascript dir="autocomplete" file="autocomplete-min.js" version="2.6.0"/>
	
	<g:javascript src="cuanto/url.js"/>
	<g:javascript src="cuanto/events.js"/>
	<g:javascript src="cuanto/projectDialog.js"/>
	<g:javascript src="cuanto/deleteProjectDialog.js"/>
	<g:javascript src="cuanto/projectList.js"/>
	<g:javascript>
		<g:render template="/testRun/urls"/>
			YAHOO.util.Event.onDOMReady(function () {
				var projectList = new YAHOO.cuanto.ProjectList();
				projectList.init();
			});
		</g:javascript>
	</head>
	<body class=" yui-skin-sam">
		<div class=" body">
			<div id="projectBody">
				<g:render template="projectList"/>
			</div>
			<g:render template="projectDialog"/>
			<g:render template="deleteProjectDialog"/>
		</div>
	</body>

</html>
