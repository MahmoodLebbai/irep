<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>

<html>
<head>
    <title>Login</title>
</head>

<body>
<h2 align="center">Login</h2>

<p align="center">Please log in as user "guest" with password "guest."</p>

<form name="f" action="<c:url value='/j_spring_security_check'/>" method="POST">
    <table>
        <tr>
            <td><label for="j_username">User</label></td>
            <td><input type='text' id="j_username" name="j_username"
                       value='<c:if test="${not empty param.login_error}"><c:out value="${SPRING_SECURITY_LAST_USERNAME}"/></c:if>'/>
            </td>
            <td align="left"></td>
        </tr>
        <tr>
            <td><label for="j_password">Password</label></td>
            <td><input type='password' id="j_password" name='j_password'></td>
        </tr>
        <tr>
            <td align="right"><input type="checkbox" name="_spring_security_remember_me" value="true"></td>
            <td align="left">remember me</td>
        </tr>

        <tr>
            <td colspan='2'><input name="submit" type="submit" value="Login"></td>
        </tr>
    </table>
</form>

<c:if test="${not empty param.login_error}">
    <div align="center">
      <span style="color: red;">
        Your login attempt was not successful, please try again.
      </span>
    </div>
</c:if>

</body>
</html>