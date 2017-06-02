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
	<div class="easyui-layout" id="main">
        <div data-options="region:'west',split:true" title="Dasboard" id="west">
        	<ul class="easyui-tree" data-options="animate:true">
            <li>
                <span>My Documents</span>
                <ul>
                    <li data-options="state:'closed'">
                        <span>Master Inventaris</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/barang/SearchAllBarang.action">Inventaris Barang</a></li>
                            <li><a href="${pageContext.request.contextPath}/bhp/SearchAllBhp.action">Inventaris Barang Habis Pakai</a></li>
			    			<li><a href="${pageContext.request.contextPath}/masterRuangan/searchRuangan.action">Inventaris Ruang</a></li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Pengadaan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Formulir Pengajuan</a></li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Penggunaan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Kelas 1</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Kelas 2</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Kelas 3</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Kelas 4</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Kelas 5</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Kelas 6</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Perpus</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Ruang Guru</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Ruang Kepala Sekolah</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Mushola</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Gudang Produktif</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Gudang Nonproduktif</a></li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Laporan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Laporan Inventaris Barang</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Laporan</a> </li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Microsoft Office</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Games</a></li>
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
