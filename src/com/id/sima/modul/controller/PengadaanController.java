package com.id.sima.modul.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.id.sima.core.controller.CoreAction;
import com.id.sima.modul.model.Pengadaan;
import com.id.sima.modul.service.PengadaanDao;

public class PengadaanController extends CoreAction{

	private static final long serialVersionUID = 1L;
	private Pengadaan pengadaan;
	private List<Pengadaan> listPengadaan = new ArrayList<Pengadaan>();
	private PengadaanDao pengadaanDao = (PengadaanDao) new ClassPathXmlApplicationContext("config-db.xml").getBean("pengadaanDao");
	
	public String searchAllPengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		if(pengadaan == null){
			pengadaan = new Pengadaan();
			pengadaan.setNamaBarang("");
		}
		listPengadaan = pengadaanDao.selectAll(pengadaan);
		return SUCCESS;
	}
	
	public String searchWherePengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		pengadaan = pengadaanDao.selectWhereKode(pengadaan);
		return SUCCESS;
	}
	
	public String addPengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		String kode="";
		kode += "KPB";
		int y = 0;
		y = pengadaanDao.count(pengadaan);
		int x = pengadaanDao.maxID(pengadaan);
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
			addFieldError("invaliPengadaan", "Kode Barang : "+pengadaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			pengadaan.setKodePengadaan(kode);
			pengadaan.setStatus("1");
			pengadaanDao.insertRecord(pengadaan);
		} catch (Exception e) {
			addFieldError("invaliPengadaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}			
		return SUCCESS;
	}
	
	public String editPengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		int y = 0;
		y = pengadaanDao.count(pengadaan);
		if(y > 0){
			addFieldError("invaliPengadaan", "Kode Barang : "+pengadaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			pengadaanDao.updateRecord(pengadaan);
		} catch (Exception e) {
			addFieldError("invaliPengadaan", "Gagal merubah data dikarenakan "+e);
			return ERROR;
		}		
		return SUCCESS;
	}
	
	public String deletPengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		try {
			pengadaanDao.deletRecord(pengadaan);
		} catch (Exception e) {
			addFieldError("invaliPengadaan", "Gagal menghapus data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String submitPengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		try {
			pengadaan.setStatus("2");
			pengadaanDao.updateRecord(pengadaan);
		} catch (Exception e) {
			addFieldError("invaliPengadaan", "Gagal mengirim data dikarenakan "+e);
			return ERROR;
		}	
		return SUCCESS;
	}
	
	public String riviewPengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		try {
			pengadaan.setStatus("3");
			pengadaanDao.updateRecord(pengadaan);
		} catch (Exception e) {
			addFieldError("invaliPengadaan", "Gagal meriview data dikarenakan "+e);
			return ERROR;
		}	
		return SUCCESS;
	}
	
	public String accPengadaan(){
		System.out.println("Jalankan method searchAllPengadaan");
		
		try {
			pengadaan.setStatus("4");
			pengadaanDao.updateRecord(pengadaan);
		} catch (Exception e) {
			addFieldError("invaliPengadaan", "Gagal memberi acc data dikarenakan "+e);
			return ERROR;
		}	
		return SUCCESS;
	}
	public Pengadaan getPengadaan() {
		return pengadaan;
	}
	public void setPengadaan(Pengadaan pengadaan) {
		this.pengadaan = pengadaan;
	}
	public List<Pengadaan> getListPengadaan() {
		return listPengadaan;
	}
	public void setListPengadaan(List<Pengadaan> listPengadaan) {
		this.listPengadaan = listPengadaan;
	}
	public PengadaanDao getPengadaanDao() {
		return pengadaanDao;
	}
	public void setPengadaanDao(PengadaanDao pengadaanDao) {
		this.pengadaanDao = pengadaanDao;
	}
}
