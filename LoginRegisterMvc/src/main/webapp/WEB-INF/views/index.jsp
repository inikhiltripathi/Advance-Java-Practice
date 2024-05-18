<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="LoginStyle.css">

</head>
<body>
    <div class="main">
        <h1>LOGIN PAGE</h1>
        <form class="form" action="doLogin" method="post">
            <input type="email" name="name" placeholder="Email Id"><br>
            <input type="password" name="name" placeholder="Password"><br>
            <input class="btn" type="submit" value="Login">
        </form>
        <hr id="hr">
        <a href="register">
        <button class="btn btn-2">Register</button>
        </a>
    </div> 
</body>
</html>