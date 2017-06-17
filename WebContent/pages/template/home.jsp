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
                            <li><a href="${pageContext.request.contextPath}/barang/SearchAllBhp.action">Inventaris Barang Habis Pakai</a></li>
			    			<li><a href="${pageContext.request.contextPath}/masterRuangan/searchRuangan.action">Inventaris Ruang</a></li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Pengadaan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/pengadaanBarang/SearchAllPengadaan.action">Formulir Pengajuan</a></li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Penggunaan</span>
                        <ul>
                            <li data-options="state:'closed'">
                            	<span>Kelas</span>
                            	<ul>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKelas1.action">Kelas 1</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKelas2.action">Kelas 2</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKelas3.action">Kelas 3</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKelas4.action">Kelas 4</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKelas5.action">Kelas 5</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKelas6.action">Kelas 6</a></li>
                            	</ul>
                            </li>
                            <li data-options="state:'closed'">
                            	<span>Ruangan</span>
                            	<ul>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchRuangKepalaSekolah.action">Ruang Kepala Sekolah</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchRuangGuru.action">Ruang Guru</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchGudangPeralatan.action">Ruang Gudang Peralatan</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchGudangPerlengkapan.action">Ruang Gudang Perlengkapan</a></li>
                            	</ul>
                            </li>
                            <li data-options="state:'closed'">
                            	<span>Sarana</span>
                            	<ul>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchMusholla.action">Mushola</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchPerpus.action">Perpus</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchRuangUks.action">Ruang UKS</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchRuangLabIpa.action">Ruang Lab IPA</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchRuangSerbaguna.action">Ruang Serbaguna</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKamarMandiGuru.action">Kamar Mandi Guru</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKamarMandiSiswa.action">Kamar Mandi Siswa</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/SearchKamarMandiSerbaguna.action">Kamar Mandi Ruang Serbaguna</a></li>
                            	</ul>
                            </li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Laporan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/pengadaanBarang/ReportPengadaan.action">Laporan Pengadaan Barang</a></li>
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
