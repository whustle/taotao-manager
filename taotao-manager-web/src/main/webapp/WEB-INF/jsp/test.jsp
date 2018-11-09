<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>淘淘商城后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.4.1/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.4.1/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="../css/taotao.css" />
    <script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>
    <style type="text/css">
        .content {
            padding: 10px 10px 10px 10px;
        }
    </style>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>淘淘商城后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.4.1/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.4.1/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="../css/taotao.css" />
    <script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>
    <style type="text/css">
        .content {
            padding: 10px 10px 10px 10px;
        }
    </style>
</head>
<body >
<h2>Basic Layout</h2>
<p>The layout contains north,south,west,east and center regions.</p>
<div style="margin:20px 0;"></div>
<div class="easyui-layout" style="width:700px;height:350px;">
    <div data-options="region:'north'" style="height:50px"></div>
    <div data-options="region:'south',split:true" style="height:50px;"></div>
    <div data-options="region:'east',split:true" title="East" style="width:100px;"></div>
    <div data-options="region:'west',split:true" title="West" style="width:100px;"></div>
    <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
        <table class="easyui-datagrid"
               data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
            <thead>
            <tr>
                <th data-options="field:'itemid'" width="80">Item ID</th>
                <th data-options="field:'productid'" width="100">Product ID</th>
                <th data-options="field:'listprice',align:'right'" width="80">List Price</th>
                <th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
                <th data-options="field:'attr1'" width="150">Attribute</th>
                <th data-options="field:'status',align:'center'" width="60">Status</th>
            </tr>
            </thead>
        </table>
    </div>
</div>
</body>
</html>