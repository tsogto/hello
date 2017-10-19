<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <head>
        <title>Hello Application</title>
        <meta charset="UTF-8">
    </head>
    <body>
        Hello Spring!<br>
        <table width="100%" border="1">
            <tr>
                <td>Id</td>
                <td>Title</td>
                <td>Text</td>
            </tr>
            <c:forEach var="message" items="${ messages }">
                <tr>
                    <td>${ message.id }</td>
                    <td>${ message.title }</td>
                    <td>${ message.text }</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>