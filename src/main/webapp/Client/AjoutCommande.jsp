<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/template/displaytag.tld" prefix="display"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<s:form id="ajoutCommande" action="AjoutCommande">


		<display:table name="listeCommandes" export="true" pagesize="2"
			decorator="pl.CommandeDecorator">

			<display:column property="identifiant" title="ID" />
			<display:column property="code" title="Code" />
			<display:column property="libelle" title="Libellé" />
			<display:column property="montant" title="Montant" />
			<display:column url="/editModifierCommande.action" paramId="code"
				paramProperty="code">Modifier</display:column>
			<display:column url="/supprimerCommande.action" paramId="code"
				paramProperty="code">Supprimer</display:column>

		</display:table>
	</s:form>
</body>
</html>