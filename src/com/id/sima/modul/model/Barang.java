package com.id.sima.modul.model;

import java.math.BigDecimal;

public class Barang {

	private String kodeBarang;
	private String namaBarang;
	private String keterangan;
	private String merek;
	private String jenis;
	private int satuan;
	private int jumlah;
	private BigDecimal harga;
	public String getKodeBarang() {
		return kodeBarang;
	}
	public void setKodeBarang(String kodeBarang) {
		this.kodeBarang = kodeBarang;
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}
	public String getKeterangan() {
		return keterangan;
	}
	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}
	public String getMerek() {
		return merek;
	}
	public void setMerek(String merek) {
		this.merek = merek;
	}
	public String getJenis() {
		return jenis;
	}
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	public int getSatuan() {
		return satuan;
	}
	public void setSatuan(int satuan) {
		this.satuan = satuan;
	}
	public int getJumlah() {
		return jumlah;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public BigDecimal getHarga() {
		return harga;
	}
	public void setHarga(BigDecimal harga) {
		this.harga = harga;
	}
}
