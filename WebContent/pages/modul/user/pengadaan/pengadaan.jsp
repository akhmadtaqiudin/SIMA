<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.id.sima.modul.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SIMA</title>
<jsp:include page="/pages/template/header.jsp"></jsp:include>
<script type="text/javascript">
	$(window).ready(function(){
		$(".btnRst2").on("click", function(){
        	$("#search").val("");
        });
		$("#listTablePengadaan  > thead tr th, tr td").css({"text-align": "center", "vertical-align": "middle"});
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
                    <li>
                        <span>Pengadaan</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/pengadaanBarang/Pengadaan.action">Formulir Pengajuan</a></li>
                        </ul>
                    </li>
                    <li data-options="state:'closed'">
                        <span>Penggunaan</span>
                        <ul>
                            <li data-options="state:'closed'">
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
        <div data-options="region:'center',title:'Data Pengadaan Barang'" class="center">
            <div class="view">
			  <s:form namespace="/pengadaanBarang" id="form">
			  	<s:hidden name="pengadaan.status"/>
				<s:textfield name="pengadaan.namaBarang" placeholder="Nama Barang " id="search"/>
				<s:submit value="Search" action="Pengadaan" cssClass="btn btn-default btn-sm btnSrc2" />
				<input value="Reset" class="btn btn-default btn-sm btnRst2" />
			  </s:form>
			  <display:table id="listTablePengadaan" name="listPengadaan" pagesize="10"
				 requestURI="/pengadaanBarang/Pengadaan.action" class="table table-bordered table-hover table-striped" >
				<display:column title="Tanggal Pengajuan " property="tanggalPengajuan" format="{0,date,dd/MM/yyyy hh:mm:ss}" />
				<display:column title="Tanggal Persetujuan" property="tanggalPersetujuan" format="{0,date,dd/MM/yyyy hh:mm:ss}" />
				<display:column title="Kode Barang " property="kodeBarang" />
				<display:column title="Nama Barang " property="namaBarang" />
				<display:column title="Merek " property="merek" />
				<display:column title="Satuan " property="satuan" />
				<display:column title="Jumlah " property="jumlah"  />
				<display:column title="Harga Satuan " property="harga" />
				<display:column title="Action">
				    <a class="btn btn-success btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/Acc.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">&nbsp; Acc &nbsp;</a>
					<a class="btn btn-danger btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/Reject.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">&nbsp; Reject &nbsp;</a>
					<a class="btn btn-default btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/View.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">View</a>
				</display:column>	
			  </display:table>
			</div>
        </div>
    </div>
</body>
</html>
