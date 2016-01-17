<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajout Utilisateur</title>
</head>
<body>
	<h3>
		<s:label value="Ajouter un Utilisateur" />
	</h3>

	<s:form action="ajoutUtilisateur" namespace="/Admin/">

		<s:textfield label="Nom " name="nom" />
		<s:textfield label="Prenom " name="prenom" />
		<s:textfield label="Telephone " name="tel" />
		<s:textfield label="Adresse " name="adresse" />
		<s:textfield label="Login " name="login" />
		<s:password label="Password " key="pwd" />
		<s:select label="Role Utilisateur"
		    headerKey="-1" 
			 list="profils"
			name="selectedProfil" />

		<s:submit />

	</s:form>

</body>
</html>