<html>
<head>
<title>Login Page</title>
</head>
<body>
    <p><font color="red">${errorMessage}</font></p>
    <form action="/login" method="POST"><br>
        Name : <input name="name" type="text" /> <br>
        Password : <input name="password" type="password" /> <br>
        <input type="submit" />
    </form>
</body>
</html>