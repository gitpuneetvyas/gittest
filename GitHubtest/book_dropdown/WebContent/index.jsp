<html>
   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   <f:view>
      <head> 
         <link href="styles.css" rel="stylesheet" type="text/css"/>
         <f:loadBundle basename="messages_en_US" var="msgs"/>
         <title>
            <h:outputText value="#{msgs.windowTitle}"/> 
         </title>
      </head>

      <body>
         <h:outputText value="#{msgs.pageTitle}" styleClass="emphasis"/>
         <p/>
         <h:form>
            <h:panelGrid columns="2">
               <h:outputText value="#{msgs.streetAddressPrompt}"/>
               <h:inputText id="streetAddress" value="#{form.streetAddress}"/>

               <h:outputText id="cityPromptI" value="#{msgs.cityPrompt}" /> 
               
               <h:outputText id="mytext" value="#{form.selectedValue}"/>
               

               <h:outputText id="statePrompt" value="#{msgs.statePrompt}"/> 
               <h:inputText value="#{form.state}"/>

               <h:outputText value="#{msgs.countryPrompt}"/> 

               <h:selectOneMenu id= "Asia" value="#{form.country}"
                  onchange="submit()"
                  valueChangeListener="#{form.countryChanged}">
                  <f:selectItems value="#{form.countryNames}"/>
               </h:selectOneMenu>
               <br></br>
                 <h:outputText value="#{msgs.cityPrompt}"/> 
                <h:selectOneMenu id="CityList" value="#{form.city}"
                  valueChangeListener="#{form.cityChanged}">
                  <f:selectItems value="#{form.cityNames}"/>
               </h:selectOneMenu>
               
            </h:panelGrid>
            <p/>
            <h:commandButton value="#{msgs.submit}" action="result" />
         </h:form>
      </body>
   </f:view>
</html>  
