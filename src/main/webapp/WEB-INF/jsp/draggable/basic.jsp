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
    <title>draggable 可拖拽的 basic 基础的</title>
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
<div class="easyui-draggable" style="width: 300px; height: 300px; border: 1px solid #ccc; text-align: center">
    可拖拽
</div>
<div id="basics" style="width: 200px; height: 300px; border: 1px solid #ccc; text-align: center">
    js初始化可拖拽
</div>
<script type="text/javascript">
    $(function () {
        $("#basics").draggable();
    })
</script>

<div class="easyui-draggable" style="width: 200px; height: 200px; border: 1px solid #ccc" data-options="handle:'#title'">
    <div id="title" style="background-color: #CC2222; text-align: center">拖动标题</div>
</div>

<div id="basics1" style="width: 200px; height: 200px; border: 1px solid #ccc">
    <div id="title1" style="background-color: #CC2222; text-align: center;">
        js初始化拖动标题
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $("#basics1").draggable({
            handle:"#title1"
        });

    })
</script>

</body>
</html>
