<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2025-01-06
  Time: 오후 4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>사용자 등록</h1>
<form action="http://localhost:8080/servlet_study_war/user" method="post">
  <input type="text" name="searchValue">
  <button>등록 시작</button>
<table>
  <tr>
    <td>username</td>
    <td><input type="text" name="username"></td>
    <td>password</td>
    <td><input type="text" name="password"></td>
  </tr>
  <tr>
    <td>name</td>
    <td><input type="text" name="name"></td>
    <td>email</td>
    <td><input type="text" name="email"></td>
  </tr>

</table>
<button>추가</button>
</form>
<h1>사용자 조회</h1>
<input type="text" name="searchValue">
<button type="submit">조회</button>
<table>
  <tr>
    <th>username</th>
    <th>password</th>
    <th>name</th>
    <th>email</th>
  </tr>
  <c:forEach>
    <td>username</td>
    <td>password</td>
    <td>name</td>
    <td>email</td>
  </c:forEach>
</table>

</body>
</html>
