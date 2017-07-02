<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@page import="com.id.sima.modul.model.Penggunaan"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/pages/template/header.jsp"></jsp:include>
<title>SIMA</title>
<script type="text/javascript">
	$(window).ready(function(){
		$(".btnRst2").on("click", function(){
        	$("#search").val("");
        });
		$("#listTablePenggunaan  > thead tr th, tr td").css({"text-align": "center", "vertical-align": "middle"});
    }); 
</script>
</head>
<body>
	<div class="easyui-layout" id="main">
        <div data-options="region:'west',split:true" title="Dasboard" id="west">
        	<ul class="easyui-tree" data-options="animate:true">
            <li>
                <span>My Documents</span>
                <ul>
                    <li data-options="state:'closed'">
                        <span>Pengadaan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/pengadaanBarang/Pengadaan.action">Formulir Pengajuan</a></li>
                        </ul>
                    </li>
                    <li>
                        <span>Penggunaan</span>
                        <ul>
                            <li>
                            	<span>Kelas</span>
                            	<ul>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/Kelas1.action">Kelas 1</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/Kelas2.action">Kelas 2</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/Kelas3.action">Kelas 3</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/Kelas4.action">Kelas 4</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/Kelas5.action">Kelas 5</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/Kelas6.action">Kelas 6</a></li>
                            	</ul>
                            </li>
                            <li data-options="state:'closed'">
                            	<span>Ruangan</span>
                            	<ul>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/RuangKepalaSekolah.action">Ruang Kepala Sekolah</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/RuangGuru.action">Ruang Guru</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/GudangPeralatan.action">Ruang Gudang Peralatan</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/GudangPerlengkapan.action">Ruang Gudang Perlengkapan</a></li>
                            	</ul>
                            </li>
                            <li data-options="state:'closed'">
                            	<span>Sarana</span>
                            	<ul>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/Musholla.action">Mushola</a></li>
                            		<li><a href="${pageContext.request.contextPath}/penggunaanBarang/Perpus.action">Perpus</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/RuangUks.action">Ruang UKS</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/RuangLabIpa.action">Ruang Lab IPA</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/RuangSerbaguna.action">Ruang Serbaguna</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/KamarMandiGuru.action">Kamar Mandi Guru</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/KamarMandiSiswa.action">Kamar Mandi Siswa</a></li>
		                            <li><a href="${pageContext.request.contextPath}/penggunaanBarang/KamarMandiSerbaguna.action">Kamar Mandi Ruang Serbaguna</a></li>
                            	</ul>
                            </li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Laporan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/pengadaanBarang/ReportPengadaanBarang.action">Laporan Pengadaan Barang</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>
        </div>
        <div data-options="region:'center',title:'Data Penggunaan Kelas 4'" class="center">
        	<div class="view">
			  <s:form namespace="/penggunaanBarang" id="form">
			  	<s:hidden name="penggunaan.kodeRuangan"/>
				<s:textfield name="penggunaan.namaBarang" placeholder="Nama Barang " id="search"/>
				<s:submit value="Search" action="Kelas4" cssClass="btn btn-default btn-sm btnSrc2" />
				<input value="Reset" class="btn btn-default btn-sm btnRst2" />
			  </s:form>
			  <display:table id="listTablePenggunaan" name="listPenggunaan" pagesize="10"
				 requestURI="/penggunaanBarang/Kelas4.action" class="table table-bordered table-hover table-striped" >
				<display:column title="Kode Barang " property="kodeBarang" />
				<display:column title="Nama Barang " property="namaBarang" />
				<display:column title="Baik " property="baik"  />
				<display:column title="Rusak " property="rusak" />
				<display:column title="Jumlah " property="jumlah" />
				<display:column title="Keterangan " property="keterangan" />	
			   </display:table>
			</div>
        </div>
    </div>
</body>
</html>