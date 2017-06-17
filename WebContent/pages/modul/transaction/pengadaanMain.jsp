<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.id.sima.modul.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/pages/template/header.jsp"></jsp:include>
<%-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/makeOver/css/jquery-ui.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/makeOver/js/jquery-ui.js"></script> --%>
<title>SIMA</title>
<script type="text/javascript">
	$(window).ready(function(){
		$(".btnRst").on("click", function(){
        	$(".search").val("");
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
                    <li data-options="state:'closed'">
                        <span>Master Inventaris</span>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/barang/SearchAllBarang.action">Inventaris Barang</a></li>
                            <li><a href="${pageContext.request.contextPath}/barang/SearchAllBhp.action">Inventaris Barang Habis Pakai</a></li>
			    			<li><a href="${pageContext.request.contextPath}/masterRuangan/searchRuangan.action">Inventaris Ruang</a></li>
                        </ul>
                    </li>
                    <li>
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
        <div data-options="region:'center',title:'Data Pengadaan Barang'" class="center">
            <div class="view">
			  <s:form namespace="/pengadaanBarang" id="form" method="pos">
				<s:textfield name="pengadaan.namaBarang" placeholder="Nama Barang " cssClass="search"/>
				<s:submit value="Search" action="SearchAllPengadaan" cssClass="btn btn-default btn-sm btnSrc" />
				<input value="Reset" class="btn btn-default btn-sm btnRst" />
				<s:submit value="Add data" action="AddPengadaan" cssClass="btn btn-success btn-sm btnAdd" />
			  </s:form>
			  <display:table id="listTablePengadaan" name="listPengadaan" pagesize="10"
				 requestURI="/pengadaanBarang/SearchAllPengadaan.action" class="table table-bordered table-hover table-striped" >
				<display:column title="Tanggal " property="tanggal" format="{0,date,dd/MM/yyyy}" />
				<display:column title="Kode Barang " property="kodeBarang" />
				<display:column title="Nama Barang " property="namaBarang" />
				<display:column title="Merek " property="merek" />
				<display:column title="Satuan " property="satuan" />
				<display:column title="Jumlah " property="jumlah"  />
				<display:column title="Harga " property="harga" />
				<display:column title="Keterangan " property="keterangan"  />
				<display:column title="Action">
					<c:choose>
						<c:when test="${listTablePengadaan.status=='1' }">
						    <a class="btn btn-warning btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/EditPengadaan.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">&nbsp; Edit &nbsp;</a>
							<a class="btn btn-danger btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/DeletPengadaan.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">Delete</a>
							<a class="btn btn-default btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/ViewPengadaan.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">&nbsp; View &nbsp;</a>
							<a class="btn btn-primary btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/Submit.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">Submit</a>
						</c:when>
						<c:when test="${listTablePengadaan.status!='1' }">
							<a class="btn btn-default btn-xs" href="${pageContext.request.contextPath}/pengadaanBarang/ViewPengadaan.action?pengadaan.kodePengadaan=<%=((Pengadaan) pageContext.getAttribute("listTablePengadaan")).getKodePengadaan()%>">&nbsp; View &nbsp;</a>
						</c:when>
					</c:choose>
				</display:column>
				<display:column title="status" media="html">
    				<div class="btn-group btn-group-xs" role="group" aria-label="...">
    					<c:choose>
			    			<c:when test="${listTablePengadaan.status=='1'}"> 
			    				<label class="label label-default">Created</label>
			    			</c:when>
			    			<c:when test="${listTablePengadaan.status=='2'}"> 
			    				<label class="label label-info">Process</label>
			    			</c:when>
			    			<c:when test="${listTablePengadaan.status=='3'}"> 
			    				<label class="label label-warning">Review</label>
			    			</c:when>
			    			<c:when test="${listTablePengadaan.status=='4'}"> 
			    				<label class="label label-success">Acc</label>
			    			</c:when>
			    			<c:otherwise>
			    				<label class="label label-default">Error</label>
			    			</c:otherwise>
			    		</c:choose>
					</div>
        		</display:column>	
			  </display:table>
			</div>
        </div>
    </div>
</body>
</html>