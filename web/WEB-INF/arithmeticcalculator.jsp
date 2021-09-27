<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
        <label>First:</label>
        <input type="text" name="first_number" value="${firstNum}"><br>
        
        <label>Second:</label>
        <input type="text" name="second_number" value="${secondNum}"><br>
        
        <input type="submit" value="+" name="plus">
        <input type="submit" value="-" name="minus">
        <input type="submit" value="*" name="multiply">
        <input type="submit" value="%" name="modulus"><br><br>
        </form>
        <div>
            Result: ${result}
        </div>
        <div>
            <a href="age">Age Calculator</a>
        </div>  
    </body>
</html>

