<%--
  Created by IntelliJ IDEA.
  User: gihan
  Date: 25/05/09
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Courses</title></head>
<body>
<h2>Available Courses</h2>
<table border="1">
    <tr><th>Name</th><th>Instructor</th><th>Credits</th><th>Action</th></tr>
    <c:forEach var="course" items="${courses}">
        <tr>
            <td>${course.name}</td>
            <td>${course.instructor}</td>
            <td>${course.credits}</td>
            <td>
                <form action="register/${course.courseId}" method="post">
                    <button type="submit">Register</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
