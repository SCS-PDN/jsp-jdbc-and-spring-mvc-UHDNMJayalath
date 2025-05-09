<%--
  Created by IntelliJ IDEA.
  User: nishaka
  Date: 25/05/09
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Login</title></head>
<body>
<form action="login" method="post">
    Email: <input type="text" name="email" required /><br/>
    Password: <input type="password" name="password" required /><br/>
    <input type="submit" value="Login" />
</form>
<p style="color:red">${error}</p>
</body>
</html>
