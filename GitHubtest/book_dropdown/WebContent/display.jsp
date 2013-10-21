  <%@ page contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>drop down example</title>
</head>
<body>
<f:view>
    		  <f:loadBundle basename="messages_en_US" var="msgs"/>
    	<h1>You Selected Following Items</h1>
       <h:outputText value="#{msgs.streetAddressPrompt}"/> 
    	<h:outputText value="#{form.streetAddress}">
    	</h:outputText>
      
      
       <h:outputText value="#{msgs.cityPrompt}"/> 
    	<h:outputText value="#{form.city}">
    	</h:outputText>
    	
      <h:outputText value="#{msgs.statePrompt}"/> 
    	<h:outputText value="#{form.state}">
    	</h:outputText>
    	
    	 <h:outputText value="#{msgs.countryPrompt}"/> 
    	<h:outputText value="#{form.country}">
    	</h:outputText>
</f:view>
</body>
</html>