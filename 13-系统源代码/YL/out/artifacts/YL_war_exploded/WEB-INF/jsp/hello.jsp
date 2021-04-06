<%--
  Created by IntelliJ IDEA.
  User: Chenshufu
  Date: 2017/7/1
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"  language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="ctxStatic" value="${pageContext.request.contextPath }/static"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello ${user.userName}
</body>
</html>
