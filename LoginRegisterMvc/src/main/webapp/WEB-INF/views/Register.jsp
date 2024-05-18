<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <link rel="stylesheet" href="RegisterStyle.css">
</head>
<body>
    <div class="main">
        <h1>REGISTRATION FORM</h1>
        <form class="form" action="doRegister" method="post">
            <input type="text" name="name" placeholder="Name"><br>
            <input type="text" name="mobile" placeholder="Mobile Number"><br>
            <input type="email" name="email" placeholder="Email Id"><br>
            <input type="password" name="pass" placeholder="Password"><br>
            <input id="btn" type="submit" value="Register">
        </form>
        <hr id="hr">
        <span>Already have account - <a href="/">Login</a></span>
    </div> 
</body>
</html>
