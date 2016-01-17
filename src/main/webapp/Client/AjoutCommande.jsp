<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="s" uri="/struts-tags"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form id="ajoutCommande" action="AjoutCommande" >
 
 
libelle : <s:property name="nom" id="libelle" />


Description : <s:property name="nom" id="description" />

Montant : <s:property name="montant" id="montant" />

<s:submit value="commander" />

</s:form>

</body>
</html>