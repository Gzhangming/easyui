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
    <title>EasyUi学习</title>
    <%
        String contextPath = request.getContextPath();
        session.setAttribute("path", contextPath);
    %>
    <link  type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/easyUi/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/easyUi/themes/icon.css"/>
    <script type="text/javascript" src="<%=request.getContextPath() %>/easyUi/jquery.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath() %>/easyUi/jquery.easyui.min.js"></script>
</head>
<body>
<ul class="easyui-tree">
    <li><samp>菜单0</samp></li>
</ul>

<ul id="tree">
    <li><samp>菜单1</samp></li>
    <li>
        <samp>菜单2</samp>
        <ul>
            <li><samp>菜单2-0</samp></li>
            <li><samp>菜单2-1</samp></li>
        </ul>
    </li>
</ul>

<script type="text/javascript">
    $(function(){
        $("#tree").tree();
    })
</script>
</body>
</html>
