


<h1 style="color:red;text-align:center">Docker Testing Web Application using Servlet and Jsp</h1>

<%
    Object time = request.getAttribute("time");
    if (time != null) {
        out.println("<h1> Date and Time: " + time + "</h1>");
    } else {
        out.println("<h1> Time is not available</h1>");
    }
%>

<a href="dateurl">show date and time</a>