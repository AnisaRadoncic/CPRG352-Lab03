<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
        <label>Enter your age:</label>
        <input type="text" name="age" value=""><br>
        <input type="submit" value="Age Next Birthday">
        </form>
         <div> ${message} 
         </div>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
