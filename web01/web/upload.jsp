<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/29
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form name="form1" action="doupload.jsp" method="post" enctype="multipart/form-data">
        <input type="text" name="name" value="test" />
        <input type="file" name="file1" />
        <button type="submit">上传</button>
    </form>
</body>
</html>
