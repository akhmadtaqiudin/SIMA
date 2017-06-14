<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>SIMA</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/js/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/js/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/js/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/css/bootstrap-old.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/css/style.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeOver/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeOver/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/makeOver/js/bootstrap.min.js" ></script>
</head>
<body>	
	<div class="navbar navbar-default navbar-fixed-top bs-docs-nav">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <h3>Sistem Informasi Manajemen Aset</h3>
        </div>
        <div id="navbar" >
          <div class="nav navbar-nav navbar-right">  
            <a class="navbar-right" href="${pageContext.request.contextPath}/authentication/logout.action">
	          <span class="glyphicon glyphicon-user" aria-hidden="true"></span><s:property value="#session['userName'].userName" /> Logout
	        </a>
	      </div>
        </div><!--/.navbar-collapse -->
      </div>
    </div>
</body>
</html>