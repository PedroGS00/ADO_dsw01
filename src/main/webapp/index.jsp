<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Car</title>
</head>
<body>
    <form action="/create-car" method="post">
        <label for="car-name">Car Name</label>
        <input type="text" name="car-name" id="car-name">
        <label for="car-color">Color</label>
        <input type="text" name="car-color" id="car-color">
        <br>
        <button type="submit">Register</button>
    </form>

    <% if (request.getAttribute("response") != null) { %>
        <pre><%= request.getAttribute("response") %></pre>
    <% } %>
</body>
</html>