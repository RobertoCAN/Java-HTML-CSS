<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<body>

 <c:import url="logout-parcial.jsp"/>

	<c:if test="${not empty empresa}">
            Empresa ${ empresa } cadastrada com sucesso! <fmt:formatDate value="${data}" pattern="dd/MM/yyyy" />
        </c:if>

	<c:if test="${empty empresa}">
            Nenhuma empresa cadastrada!
        </c:if>
</body>
</html>