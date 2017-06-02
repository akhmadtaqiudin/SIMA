package com.id.sima.modul.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.id.sima.core.controller.CoreAction;
import com.id.sima.modul.model.Barang;
import com.id.sima.modul.service.BarangDao;

public class BarangHabisPakaiController extends CoreAction{

	private static final long serialVersionUID = 1L;
	private Barang bhp;
	private List<Barang> listBhp = new ArrayList<Barang>();
	private BarangDao barangDao = (BarangDao) new ClassPathXmlApplicationContext("config-db.xml").getBean("barangDao");
	
	public String searchAllBhp(){
		System.out.println("jalankan method searchAllBhp");
		
		if(bhp.getNamaBarang().equalsIgnoreCase("")){
			bhp = new Barang();
			bhp.setNamaBarang("");
		}
		
		listBhp = barangDao.selectAllRecord(bhp);
		return SUCCESS;
	}
	
	public String searchWhereKodeBhp(){
		System.out.println("jalankan method searchWhereKodeBhp");
		
		bhp = barangDao.selectWhereKode(bhp);		
		return SUCCESS;
	}
	
	public String searchKodeToJson(){
		System.out.println("jalankan method searchKode");
		
		bhp = barangDao.selectWhereKode(bhp);
		return SUCCESS;
	}
	
	public String searchList(){
		System.out.println("jalankan method searchList");
		
		listBhp = barangDao.selectList();
		return SUCCESS;
	}
	
	public String addBarangBhp(){
		System.out.println("jalankan method addBarangBhp");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int x = barangDao.count(bhp);
		x++;
		
		if(x <99 && x>=10){
			date+="00"+x;
		}else if(x>99 && x<1000){
			date+="0"+x;
		}else if(x>=999){
			date+=x;
		}else{
			date+="000"+x;
		}
		
		try {
			bhp.setKodeBarang(date);
			bhp.setJenis("bhp");
			barangDao.insertRecord(bhp);
		} catch (Exception e) {
			addFieldError("invaliBarangBhp", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String editBarangBhp(){
		System.out.println("jalankan method editBarangBhp");
		
		try {
			barangDao.updateRecord(bhp);
		} catch (Exception e) {
			addFieldError("invaliBarangBhp", "Gagal merubah data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String deletBarangBhp(){
		System.out.println("jalankan method deletBarangBhp");
		
		try {
			barangDao.deletRecord(bhp);
		} catch (Exception e) {
			addFieldError("invaliBarangBhp", "Gagal menghapus data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	public Barang getBhp() {
		return bhp;
	}

	public void setBhp(Barang bhp) {
		this.bhp = bhp;
	}
	public List<Barang> getListBhp() {
		return listBhp;
	}

	public void setListBhp(List<Barang> listBhp) {
		this.listBhp = listBhp;
	}

	public BarangDao getBarangDao() {
		return barangDao;
	}
	public void setBarangDao(BarangDao barangDao) {
		this.barangDao = barangDao;
	}
}
