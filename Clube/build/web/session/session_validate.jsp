<%
    //Tetatndo capturar a sess�o com nome "userSession"
    String userSession = request.getSession("userSession");
    
    //caso encontre, criar� um bot�o de "Logout"
    if(userSession != null){
%>
<button onclick=window.location.href="session/session_invalidate.jsp">Sair </button>
<%
    }else {
        response.sendRedirect("index.html");
    }




%>