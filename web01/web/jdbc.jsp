<%@ page import="com.westos.web01.jdbc.PoolUtil" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/7
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection conn = PoolUtil.getDruidConnection();
    System.out.println(conn.isClosed());
    conn.close();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
