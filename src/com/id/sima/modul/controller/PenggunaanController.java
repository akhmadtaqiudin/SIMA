package com.id.sima.modul.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.id.sima.core.controller.CoreAction;
import com.id.sima.modul.model.Penggunaan;
import com.id.sima.modul.service.PenggunaanDao;

public class PenggunaanController extends CoreAction{

	private static final long serialVersionUID = 1L;
	private Penggunaan penggunaan;
	private List<Penggunaan> listPenggunaan = new ArrayList<Penggunaan>();
	private PenggunaanDao penggunaanDao = (PenggunaanDao) new ClassPathXmlApplicationContext("config-db.xml").getBean("penggunaanDao");
	
	public String searchAllPenggunaan(){
		System.out.println("Jalankan method searchAllPenggunaan");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		listPenggunaan = penggunaanDao.selectAll(penggunaan);
		return SUCCESS;
	}
	
	public String searchWherePenggunaan(){
		System.out.println("Jalankan method searchWherePenggunaan");
		
		penggunaan = penggunaanDao.selectWhereKode(penggunaan);
		return SUCCESS;
	}
	
	public String addPenggunaan(){
		System.out.println("Jalankan method addPenggunaan");
		
		String kode="";
		kode += "KP";
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(kode);
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String editPenggunaan(){
		System.out.println("Jalankan method editPenggunaan");
		
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaanDao.updateRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal merubah data dikarenakan "+e);
			return ERROR;
		}		
		return SUCCESS;
	}
	
	public String deletPenggunaan(){
		System.out.println("Jalankan method deletPenggunaan");
		
		try {
			penggunaanDao.deletRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menghapus data dikarenakan "+e);
			return ERROR;
		}		
		return SUCCESS;
	}
	public Penggunaan getPenggunaan() {
		return penggunaan;
	}
	public void setPenggunaan(Penggunaan penggunaan) {
		this.penggunaan = penggunaan;
	}
	public List<Penggunaan> getListPenggunaan() {
		return listPenggunaan;
	}
	public void setListPenggunaan(List<Penggunaan> listPenggunaan) {
		this.listPenggunaan = listPenggunaan;
	}
	public PenggunaanDao getPenggunaanDao() {
		return penggunaanDao;
	}
	public void setPenggunaanDao(PenggunaanDao penggunaanDao) {
		this.penggunaanDao = penggunaanDao;
	}	
}
