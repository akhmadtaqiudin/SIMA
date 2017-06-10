package com.id.sima.modul.model;

import java.util.Date;

public class Pengadaan extends Barang{
	private String kodePengadaan;
	private String status;
	private Date tanggal;
	private String tglAwal;
	private String tglAkhir;
	public String getKodePengadaan() {
		return kodePengadaan; 
	}
	public void setKodePengadaan(String kodePengadaan) {
		this.kodePengadaan = kodePengadaan;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getTanggal() {
		return tanggal;
	}
	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	public String getTglAwal() {
		return tglAwal;
	}
	public void setTglAwal(String tglAwal) {
		this.tglAwal = tglAwal;
	}
	public String getTglAkhir() {
		return tglAkhir;
	}
	public void setTglAkhir(String tglAkhir) {
		this.tglAkhir = tglAkhir;
	}
}
