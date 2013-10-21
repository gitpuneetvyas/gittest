<h:inputText id= "mnNum" value="#{UserBean.mnNum}" size="18" maxlength="17" styleClass="TxtSz12 LH18" tabindex="1" title="Man Number"/>
 
<h:selectOneMenu id="lstService" value="#{UserBean.serviceType}" tabindex="3">
   <f:selectItems value="#{UserBean.getServiceItems}"/>
</h:selectOneMenu>
 
<h:commandButton  action="#{UserBean.submit}" id="submitButton" value="Generate"/>
 
<h:outputText value="#{UserBean.getRequest}" />
 
public class UserBean extends FacesBean {
...
...
public String submit() {...}
public void setServiceType(String serviceType) {...}
public String getRequest() {
if(serviceType.toString()=="SearchService")
return "abc";
else if (serviceType.toString()=="basicService")
return "xyz";
else 
return null;
}
 
}