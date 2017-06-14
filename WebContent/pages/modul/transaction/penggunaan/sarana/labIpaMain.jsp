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
                            <li><a href="${pageContext.request.contextPath}/pengadaanBarang/SearchAllPengadaan.action">Formulir Pengajuan</a></li>
                        </ul>
                    </li>
                    <li>
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
                            <li>
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
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Laporan Master Barang</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Laporan</a> </li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Microsoft Office</a></li>
                            <li><a href="${pageContext.request.contextPath}/ruangan/searchRuangan.action">Games</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>
        </div>
        <div data-options="region:'center',title:'Data Penggunaan LAB IPA'" class="center">
        	<div class="view">
			  <s:form namespace="/penggunaanBarang" id="form">
				<s:textfield name="penggunaan.namaBarang" placeholder="Nama Barang " cssClass="search"/>
				<s:submit value="Search" action="SearchAllPenggunaan" cssClass="btn btn-default btn-sm btnSrc" />
				<s:submit value="Add data" action="AddPenggunaan" cssClass="btn btn-success btn-sm btnAdd" />
			  </s:form>
			  <display:table id="listTablePenggunaan" name="listPenggunaan" pagesize="10"
				 requestURI="/penggunaanBarang/SearchAllPenggunaan.action" class="table table-bordered table-hover table-striped" >
				<display:column title="Kode Barang " property="kodeBarang" />
				<display:column title="Nama Barang " property="namaBarang" />
				<display:column title="Baik " property="baik"  />
				<display:column title="Rusak " property="rusak" />
				<display:column title="Jumlah " property="jumlah" />
				<display:column title="Keterangan " property="keterangan" />
				<display:column title="Action">
				  <a class="btn btn-warning btn-xs" href="${pageContext.request.contextPath}/penggunaanBarang/EditPenggunaan.action?penggunaan.kodePenggunaan=<%=((Penggunaan) pageContext.getAttribute("listTablePenggunaan")).getKodePenggunaan()%>">Edit</a>
				  <a class="btn btn-danger btn-xs" href="${pageContext.request.contextPath}/penggunaanBarang/DeletPenggunaan.action?penggunaan.kodePenggunaan=<%=((Penggunaan) pageContext.getAttribute("listTablePenggunaan")).getKodePenggunaan()%>">Delete</a>
				  <a class="btn btn-default btn-xs" href="${pageContext.request.contextPath}/penggunaanBarang/ViewPenggunaan.action?penggunaan.kodePenggunaan=<%=((Penggunaan) pageContext.getAttribute("listTablePenggunaan")).getKodePenggunaan()%>">View</a>
				</display:column>	
			   </display:table>
			</div>
        </div>
    </div>
</body>
</html>