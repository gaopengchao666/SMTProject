<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投票主题列表</title>
</head>
<body>
    <table>
        <tr>
            <th>序号</th>
            <th>主题名称</th>
            <th>主题描述</th>
        </tr>
        <tbody>
            <c:forEach items="${votes}" var="vote" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${vote.themeName}</td>
                    <td>${vote.describe}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>