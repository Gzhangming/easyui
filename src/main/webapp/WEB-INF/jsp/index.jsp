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

<ul class="easyui-tree" data-options="checkbox:true">
    <li><span>菜单0</span></li>
</ul>

<ul id="tree">
    <li><span>菜单1</span></li>
    <li>
        <span>菜单2</span>
        <ul>
            <li><span>菜单2-0</span></li>
            <li><span>菜单2-1</span></li>
        </ul>
    </li>
</ul>

<script type="text/javascript">
    $(function(){
        $("#tree").tree({
            checkbox:true
        });
    })
</script>
</body>
</html>
