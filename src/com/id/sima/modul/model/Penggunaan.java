package com.id.sima.modul.model;

public class Penggunaan extends Barang{

	private String kodePenggunaan;
	private String kodeRuangan;
	private String namaRuangan;
	private int jumlah;
	private int baik;
	private int Rusak;
	private String keterangan;
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
	public int getJumlah() {
		return jumlah;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public int getBaik() {
		return baik;
	}
	public void setBaik(int baik) {
		this.baik = baik;
	}
	public int getRusak() {
		return Rusak;
	}
	public void setRusak(int rusak) {
		Rusak = rusak;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
}
