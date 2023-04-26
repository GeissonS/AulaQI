<%
    //Tetatndo capturar a sessão com nome "userSession"
    String userSession = request.getSession("userSession");
    
    //caso encontre, criará um botão de "Logout"
    if(userSession != null){
%>
<button onclick=window.location.href="session/session_invalidate.jsp">Sair </button>
<%
    }else {
        response.sendRedirect("index.html");
    }




%>