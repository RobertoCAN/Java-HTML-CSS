<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>

<c:import url="logout-parcial.jsp"/>
    
	Usuario Logado: ${usuarioLogado.login }

    <br>
    <br>
    <br>

	<c:if test="${not empty empresas}">
            Empresa ${ empresa } cadastrada com sucesso! <fmt:formatDate value="${data}" pattern="dd/MM/yyyy" />
        </c:if>

	<c:if test="${empty empresas}">
            Nenhuma empresa cadastrada!
        </c:if>
        
	<br/>
 	<br/>
	<a href="/gerenciador/entrada?acao=NovaEmpresaForm"><button style="background: #069cc2; 
	border-radius: 4px; padding: 6px; cursor: pointer; 
	color: #fff; border: none; font-size: 16px;">Cadastro Nova Empresa</button></a>
	<br/>
	<br/>

	Lista de empresas:<br/>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
		
			<li>
				${empresa.id} - ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">Editar</a> 
				<a href="/gerenciador/entrada?acao=RemovaEmpresa&id=${empresa.id}">Remove</a> 
			</li>
		</c:forEach>
		
<%-- 		<c:forEach var="i" begin="1" end="10" step="2"> --%>
<%--       	 ${i} <br /> --%>
<%--      	</c:forEach> --%>
     
	</ul>
</body>
</html>