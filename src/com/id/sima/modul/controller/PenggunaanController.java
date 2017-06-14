package com.id.sima.modul.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	
	public String searchWherePenggunaan(){
		System.out.println("Jalankan method searchWherePenggunaan");
		
		penggunaan = penggunaanDao.selectWhereKode(penggunaan);
		return SUCCESS;
	}
	
	public String searchAllKelas1(){
		System.out.println("Jalankan method searchAllKelas1");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0013");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKelas1(){
		System.out.println("Jalankan method addKelas1");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0013");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKelas2(){
		System.out.println("Jalankan method searchAllKelas2");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0014");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKelas2(){
		System.out.println("Jalankan method addKelas2");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0014");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKelas3(){
		System.out.println("Jalankan method searchAllKelas3");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0015");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKelas3(){
		System.out.println("Jalankan method addKelas3");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0015");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKelas4(){
		System.out.println("Jalankan method searchAllKelas4");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0016");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKelas4(){
		System.out.println("Jalankan method addKelas4");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0016");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKelas5(){
		System.out.println("Jalankan method searchAllKelas5");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0017");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKelas5(){
		System.out.println("Jalankan method addKelas5");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0017");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKelas6(){
		System.out.println("Jalankan method searchAllKelas6");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0018");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKelas6(){
		System.out.println("Jalankan method addKelas6");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0018");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllMusholla(){
		System.out.println("Jalankan method searchAllMusholla");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0001");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addMusholla(){
		System.out.println("Jalankan method addMusholla");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0001");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllPerpus(){
		System.out.println("Jalankan method searchAllPerpus");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0002");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addPerpus(){
		System.out.println("Jalankan method addPerpus");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0002");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKepsek(){
		System.out.println("Jalankan method searchAllKepsek");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0003");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKepsek(){
		System.out.println("Jalankan method addKepsek");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0003");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllGuru(){
		System.out.println("Jalankan method searchAllGuru");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0004");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addGuru(){
		System.out.println("Jalankan method addGuru");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0004");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllUks(){
		System.out.println("Jalankan method searchAllUks");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0005");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addUks(){
		System.out.println("Jalankan method addUks");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0005");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllLab(){
		System.out.println("Jalankan method searchAllLab");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0006");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addLab(){
		System.out.println("Jalankan method addLab");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0006");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllSerbaguna(){
		System.out.println("Jalankan method searchAllSerbaguna");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0007");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addSerbaguna(){
		System.out.println("Jalankan method addSerbaguna");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0007");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllGudangPeralatan(){
		System.out.println("Jalankan method searchAllGudangPeralatan");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0008");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addGudangPeralatan(){
		System.out.println("Jalankan method addGudangPeralatan");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0008");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllGudangPerlengkapan(){
		System.out.println("Jalankan method searchAllGudangPerlengkapan");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0009");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addGudangPerlengkapan(){
		System.out.println("Jalankan method addGudangPerlengkapan");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0009");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKmGuru(){
		System.out.println("Jalankan method searchAllKmGuru");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0010");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKmGuru(){
		System.out.println("Jalankan method addKmGuru");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0010");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKmSiswa(){
		System.out.println("Jalankan method searchAllKmSiswa");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0011");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKmSiswa(){
		System.out.println("Jalankan method addKmSiswa");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0011");
			penggunaanDao.insertRecord(penggunaan);
		} catch (Exception e) {
			addFieldError("invaliPenggunaan", "Gagal menambahkan data dikarenakan "+e);
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String searchAllKmSerbaguna(){
		System.out.println("Jalankan method searchAllKmSerbaguna");
		
		if(penggunaan==null){
			penggunaan = new Penggunaan();
			penggunaan.setNamaBarang("");
		}
		penggunaan.setKodeRuangan("KAR0012");
		listPenggunaan = penggunaanDao.selectAllRecord(penggunaan);
		return SUCCESS;
	}
	
	public String addKmSerbaguna(){
		System.out.println("Jalankan method addKmSerbaguna");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String d[] = sdf.format(new Date()).split("/"),date="";
		date+=d[0]+d[1]+d[2];
		int y = 0;
		y = penggunaanDao.count(penggunaan);
		int x = penggunaanDao.maxID(penggunaan);
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
		if(y > 0){
			addFieldError("invaliPenggunaan", "Kode Barang : "+penggunaan.getKodeBarang()+" sudah terdaftar pada database, harap gunakan Kode Barang lain");
			return ERROR;
		}
		try {
			penggunaan.setKodePenggunaan(date);
			penggunaan.setKodeRuangan("KAR0012");
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