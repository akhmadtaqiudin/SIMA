package com.id.sima.modul.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.id.sima.core.controller.CoreAction;
import com.id.sima.modul.model.Ruangan;
import com.id.sima.modul.service.RuanganDao;

public class RuanganController extends CoreAction{

	private static final long serialVersionUID = 1L;
	private Ruangan ruangan;
	private List<Ruangan> listRuangan = new ArrayList<Ruangan>();
	private RuanganDao ruanganDao = (RuanganDao) new ClassPathXmlApplicationContext("config-db.xml").getBean("ruanganDao");
	
	public String searchAllRecord(){
		System.out.println("Jalankan Method searchAllRecord");
		
		if(ruangan==null){
			ruangan = new Ruangan();
			ruangan.setNamaRuangan("");
		}
		
		listRuangan = ruanganDao.selectAllRecord(ruangan);
		return SUCCESS;
	}
	
	public String searchWhereRecord(){
		System.out.println("Jalankan Method searchWhereRecord");
		
		ruangan = ruanganDao.selectWhereKode(ruangan);
		return SUCCESS;
	}
	
	public String searchKodeToJson(){
		System.out.println("jalankan method searchKode");
		
		ruangan = ruanganDao.selectWhereKode(ruangan);
		return SUCCESS;
	}
	
	public String searchList(){
		System.out.println("jalankan method searchList");
		
		listRuangan = ruanganDao.selectList();
		return SUCCESS;
	}
	
	public String addRecord(){
		System.out.println("Jalankan Method addRecord");
		
		String kode="";
		kode += "KAR";
		int y = 0;
		y = ruanganDao.count(ruangan);
		int x = ruanganDao.maxID(ruangan);
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
			addFieldError("invaliRuangan", "Nama Ruangan : "+ruangan.getNamaRuangan()+" sudah terdaftar pada database, harap gunakan Nama Ruangan lain");
			return ERROR;
		}
		try {
			ruangan.setKodeRuangan(kode);
			ruanganDao.insertRecord(ruangan);
		} catch (Exception e) {
			addFieldError("invaliRuang", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String editRecord(){
		System.out.println("Jalankan Method editRecord");
		int y = 0;
		y = ruanganDao.count(ruangan);
		if(y > 0){
			addFieldError("invaliRuangan", "Nama Ruangan : "+ruangan.getNamaRuangan()+" sudah terdaftar pada database, harap gunakan Nama Ruangan lain");
			return ERROR;
		}
		try {
			ruanganDao.updateRecord(ruangan);
		} catch (Exception e) {
			addFieldError("invaliRuang", "Gagal merubah data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String deletRecord(){
		System.out.println("Jalankan Method deletRecord");
		
		try {
			ruanganDao.deletRecord(ruangan);
		} catch (Exception e) {
			addFieldError("invaliRuang", "Gagal menghapus data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	public Ruangan getRuangan() {
		return ruangan;
	}
	public void setRuangan(Ruangan ruangan) {
		this.ruangan = ruangan;
	}
	public List<Ruangan> getListRuangan() {
		return listRuangan;
	}
	public void setListRuangan(List<Ruangan> listRuangan) {
		this.listRuangan = listRuangan;
	}
	public RuanganDao getRuanganDao() {
		return ruanganDao;
	}
	public void setRuanganDao(RuanganDao ruanganDao) {
		this.ruanganDao = ruanganDao;
	}
}
