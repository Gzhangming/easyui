<%--
  Created by IntelliJ IDEA.
  User: TC20043
  Date: 2019/5/8
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
<head>
    <title>拖动代理</title>
    <%
        String contextPath=request.getContextPath();
        session.setAttribute("path",contextPath);
    %>
    <link type="text/css" rel="stylesheet" href="<%=contextPath%>/easyUi/themes/default/easyui.css">
    <link type="text/css" rel="stylesheet" href="<%=contextPath%>/easyUi/themes/icon.css"/>
    <script type="text/javascript" src="<%=contextPath%>/easyUi/jquery.min.js"></script>
    <script type="text/javascript" src="<%=contextPath%>/easyUi/jquery.easyui.min.js"></script>
</head>
<body>

</body>
</html>
