package com.id.sima.modul.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.id.sima.core.controller.CoreAction;
import com.id.sima.modul.model.Barang;
import com.id.sima.modul.service.BarangDao;

public class BarangController extends CoreAction{

	private static final long serialVersionUID = 1L;
	private Barang barang;
	private List<Barang> listBarang = new ArrayList<Barang>();
	private BarangDao barangDao = (BarangDao) new ClassPathXmlApplicationContext("config-db.xml").getBean("barangDao");
	
	public String searchAllBarang(){
		System.out.println("jalankan method serachAllBarang");
		
		if(barang==null){
			barang = new Barang();
			barang.setNamaBarang("");
		}
		barang.setJenis("1");
		listBarang = barangDao.selectAllRecord(barang);
		return SUCCESS;
	}
	
	public String searchAllBarangBhp(){
		System.out.println("jalankan method serachAllBarang");
		
		if(barang==null){
			barang = new Barang();
			barang.setNamaBarang("");
		}
		barang.setJenis("2");
		listBarang = barangDao.selectAllRecord(barang);
		return SUCCESS;
	}
	
	public String searchWhereKode(){
		System.out.println("jalankan method searchWhereKode");
		
		barang = barangDao.selectWhereKode(barang);		
		return SUCCESS;
	}
	
	public String searchList(){
		System.out.println("jalankan method searchList");
		
		listBarang = barangDao.selectList();
		return SUCCESS;
	}
	
	public String addBarang(){
		System.out.println("jalankan method addBarang");
		
		String kode="";
		kode += "KBI";
		int y = 0;
		y = barangDao.count(barang);
		int x = barangDao.maxID(barang);
		x++;
		
		if(x <99 && x>=10){
			kode+="00"+x;
		}else if(x>99 && x<1000){
			kode+="0"+x;
		}else if(x>=999){
			kode+=x;
		}else{
			kode+="000"+x;
		}
		if(y > 0){
			addFieldError("invaliPengadaan", "Nama Barang : "+barang.getNamaBarang()+" dan Keterangan : "+barang.getKeterangan()+" sudah terdaftar pada database, harap gunakan yang lain");
			return ERROR;
		}
		try {
			barang.setKodeBarang(kode);
			barang.setJenis("1");
			barangDao.insertRecord(barang);
		} catch (Exception e) {
			addFieldError("invaliBarang", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String addBarangBhp(){
		System.out.println("jalankan method addBarangBhp");
		
		String kode="";
		kode += "KBHP";
		int y = 0;
		y = barangDao.count(barang);
		int x = barangDao.maxID(barang);
		x++;
		
		if(x <99 && x>=10){
			kode+="00"+x;
		}else if(x>99 && x<1000){
			kode+="0"+x;
		}else if(x>=999){
			kode+=x;
		}else{
			kode+="000"+x;
		}
		if(y > 0){
			addFieldError("invaliPengadaan", "Nama Barang : "+barang.getNamaBarang()+" dan Keterangan : "+barang.getKeterangan()+" sudah terdaftar pada database, harap gunakan yang lain");
			return ERROR;
		}
		try {
			barang.setKodeBarang(kode);
			barang.setJenis("2");
			barangDao.insertRecord(barang);
		} catch (Exception e) {
			addFieldError("invaliBarang", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	public String editBarang(){
		System.out.println("jalankan method editBarang");
		int y = 0;
		y = barangDao.count(barang);
		if(y > 0){
			addFieldError("invaliPengadaan", "Nama Barang : "+barang.getNamaBarang()+" dan Keterangan : "+barang.getKeterangan()+" sudah terdaftar pada database, harap gunakan yang lain");
			return ERROR;
		}
		try {
			barangDao.updateRecord(barang);
		} catch (Exception e) {
			addFieldError("invaliBarang", "Gagal merubah data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String deletBarang(){
		System.out.println("jalankan method deletBarang");
		
		try {
			barangDao.deletRecord(barang);
		} catch (Exception e) {
			addFieldError("invaliBarang", "Gagal menghapus data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	public Barang getBarang() {
		return barang;
	}
	public void setBarang(Barang barang) {
		this.barang = barang;
	}
	public List<Barang> getListBarang() {
		return listBarang;
	}
	public void setListBarang(List<Barang> listBarang) {
		this.listBarang = listBarang;
	}
	public BarangDao getBarangDao() {
		return barangDao;
	}
	public void setBarangDao(BarangDao barangDao) {
		this.barangDao = barangDao;
	}
}
