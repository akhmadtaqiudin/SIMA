<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@page import="com.id.sima.modul.model.Ruangan"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/pages/template/header.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<body>
	<div class="easyui-layout" id="main">
        <div data-options="region:'west',split:true,hideCollapsedContent:false,collapsed:true" title="Dasboard" id="west">
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
        <div data-options="region:'center',title:'Add Data Ruangan'" class="center">
        	<div class="view">
			  <s:form namespace="/masterRuangan" method="post" theme="bootstrap" cssClass="form-horizontal" >
				<s:textfield name="ruangan.namaRuangan" label="Nama Ruangan " labelSeparator=":"/>
				<s:textfield name="ruangan.panjang" label="Panjang " labelSeparator=":"/>
				<s:textfield name="ruangan.lebar" label="Lebar " labelSeparator=":"/>
				<div class="footer">
					<s:submit action="searchRuangan" value="Cansel" cssClass="btn btn-default"/>
					<s:submit action="SaveRuangan" value="Add" cssClass="btn btn-primary"/>
				</div>
			</s:form>
			</div>
        </div>
    </div>
</body>
</html>