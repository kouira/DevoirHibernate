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

	<s:if test="userList.size() > 0">
		<table cellpadding="5px">
			<tr>
				<th>Id</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>login</th>

			</tr>
			<s:iterator value="userList" status="userStatus" >
				<tr>
					<td><s:property value="idUtilisateur" /></td>
					<td><s:property value="nom" /></td>
					<td><s:property value="prenom" /></td>
					<td><s:property value="compte.login" /></td>
					<td><s:url id="editURL" action="editUtilisateur"
							namespace="/Admin">
							<s:param name="idUtilisateur" value="%{idUtilisateur}"></s:param>
						</s:url> <s:a href="%{editURL}">Edit</s:a></td>
					<td><s:url id="deleteURL" action="deleteUtilisateur">
							<s:param name="idUtilisateur" value="idUtilisateur"></s:param>
						</s:url> <s:a href="%{deleteURL}">Delete</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
</html>