<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Index</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/do/?page=welcome" method="post">
    <label>
        <input name="message" type="text">
    </label>
    <br>
    <input name="submit" type="submit" value="Send message">
</form>

</body>
</html>
