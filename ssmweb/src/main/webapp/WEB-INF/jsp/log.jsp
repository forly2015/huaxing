<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录日志</title>
</head>
<body>
<table width="100%" bgcolor="#f2f2f2">
    <!--页头-->
    <tr height="80px" bgcolor="#14191e">
        <td><font size="100" color="white">登录日志一览</font></td>
    </tr>
    <!--上空行-->
    <tr height="10px">
        <td></td>
    </tr>
    <!--内容-->
    <tr>
        <td>
            <table align="center" width="100%">
                <tr>
                    <td width="240px"  valign="top">
                        <table width="100%" bgcolor="#ffffff">
                            <c:forEach items="${userLogs}" var="log">
                                <tr>
                                    <td align="center" height="60px">${log.userName}</td>
                                    <td align="center" height="60px">${log.userLogLoginTime}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </td>
            </table>

        </td>
    </tr>
    <!--下空行-->
    <tr height="10px">
        <td></td>
    </tr>
    <!--页脚-->
    <tr height="150px" bgcolor="#14191e">
        <td>111</td>
    </tr>
</table>
</body>
</html>