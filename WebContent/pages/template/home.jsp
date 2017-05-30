<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SIMA</title>
<jsp:include page="/pages/template/header.jsp"></jsp:include>
</head>
<body>
	<div class="navbar navbar-default navbar-fixed-top">
	  <div class="container">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">
	        <img id="logo" alt="Loading" src="${pageContext.request.contextPath}/makeOver/images/logo.png">
	      </a>
	      <h1>Sistem Informasi Manajemen Aset</h1>
	    </div>
	  </div>
	</div>
	<div class="easyui-layout" id="main">
        <div data-options="region:'west',split:true" title="Dasboard" id="west">
        	<ul class="easyui-tree" data-options="animate:true">
            <li>
                <span>My Documents</span>
                <ul>
                    <li data-options="state:'closed'">
                        <span>Barang Inventaris</span>
                        <ul>
                            <li><span>Ruangan</span></li>
                            <li><span>Barang</span></li>
                            <li><span>Company</span></li>
                        </ul>
                    </li>
                    <li>
                        <span>Barang Habis Pakai</span>
                        <ul>
                            <li>Formulir Pengajuan</li>
                            <li>Java</li>
                            <li>Microsoft Office</li>
                            <li>Games</li>
                        </ul>
                    </li>
                    <li>
                        <span>Laporan</span>
                        <ul>
                            <li>Intel</li>
                            <li>Java</li>
                            <li>Microsoft Office</li>
                            <li>Games</li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>
        </div>
        <div data-options="region:'center',title:'Wellcome'" class="center">
        	<div class="box">
			  <h2>Hello, <s:property value="#session['userName'].userName" /></h2>
			</div>
        </div>
    </div>
</body>
</html>