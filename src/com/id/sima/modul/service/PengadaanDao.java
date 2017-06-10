package com.id.sima.modul.service;

import java.util.List;

import com.id.sima.modul.model.Pengadaan;

public interface PengadaanDao {

	int insertRecord(Pengadaan record);
	int updateRecord(Pengadaan record);
	int deletRecord(Pengadaan record);
	int maxID(Pengadaan record);
	int count(Pengadaan record);
	Pengadaan selectWhereKode(Pengadaan row);
	List<Pengadaan> selectAll(Pengadaan all);
}
