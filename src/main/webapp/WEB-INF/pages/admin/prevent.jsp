<script type="text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};

</script> 

<%
	response.setHeader("Cache-Control","no-cache,must-revalidate,no-store");
	if(session.getAttribute("id")==null)
	response.sendRedirect("redirect");
<<<<<<< HEAD
%>
=======
%>
>>>>>>> 050e5b00767e0d942f18cd082c835d8965312b53
