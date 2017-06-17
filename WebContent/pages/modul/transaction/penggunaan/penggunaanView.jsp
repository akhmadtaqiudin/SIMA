<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@page import="com.id.sima.modul.model.Ruangan"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/pages/template/header.jsp"></jsp:include>
<title>SIMA</title>
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
        <div data-options="region:'center',title:'View Penggunaan Barang'" class="center">
        	<div class="view">
			  <s:form namespace="/penggunaanBarang" method="post" theme="bootstrap" cssClass="form-horizontal" >
 			    <s:textfield name="penggunaan.kodePenggunaan" label="Kode Penggunaan " labelSeparator=":" readonly="true" />
				<s:textfield name="penggunaan.kodeBarang" label="Kode Barang " labelSeparator=":" readonly="true" />
				<s:textfield name="penggunaan.namaBarang" label="Nama Barang " labelSeparator=":" readonly="true" />				
				<s:textfield name="penggunaan.merek" label="Merek " labelSeparator=":" readonly="true"/>
				<s:textfield name="penggunaan.satuan" label="Satuan " labelSeparator=":" readonly="true"/>
				<s:textfield name="penggunaan.baik" label="Baik " labelSeparator=":" readonly="true"/>
				<s:textfield name="penggunaan.rusak" label="Rusak " labelSeparator=":" readonly="true"/>
				<s:textfield name="penggunaan.jumlah" label="Jumlah " labelSeparator=":" readonly="true"/>
				<s:textarea name="penggunaan.keterangan" label="Keterangan " labelSeparator=":" readonly="true"/>
				<s:textfield name="penggunaan.kodeRuangan" label="Kode Ruangan " labelSeparator=":" readonly="true" />
				<s:textfield name="penggunaan.namaRuangan" label="Nama Ruangan " labelSeparator=":" readonly="true"/>
				<div class="footer">
					<s:submit action="SearchAllPenggunaan" value="Close" cssClass="btn btn-default" id="view"/>
				</div>
			</s:form>
			</div>
        </div>
    </div>
</body>
</html>