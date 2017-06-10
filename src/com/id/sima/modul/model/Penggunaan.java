package com.id.sima.modul.model;

public class Penggunaan extends Barang{

	private String kodePenggunaan;
	private String kodeRuangan;
	private String namaRuangan;
	private int baik;
	private int rusak;
	public String getKodePenggunaan() {
		return kodePenggunaan;
	}
	public void setKodePenggunaan(String kodePenggunaan) {
		this.kodePenggunaan = kodePenggunaan;
	}
	public String getKodeRuangan() {
		return kodeRuangan;
	}
	public void setKodeRuangan(String kodeRuangan) {
		this.kodeRuangan = kodeRuangan;
	}
	public String getNamaRuangan() {
		return namaRuangan;
	}
	public void setNamaRuangan(String namaRuangan) {
		this.namaRuangan = namaRuangan;
	}
	public int getBaik() {
		return baik;
	}
	public void setBaik(int baik) {
		this.baik = baik;
	}
	public int getRusak() {
		return rusak;
	}
	public void setRusak(int rusak) {
		this.rusak = rusak;
	}
}
