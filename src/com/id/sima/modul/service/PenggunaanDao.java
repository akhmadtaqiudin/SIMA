package com.id.sima.modul.service;

import java.util.List;

import com.id.sima.modul.model.Penggunaan;

public interface PenggunaanDao {

	int insertRecord(Penggunaan record);
	int updateRecord(Penggunaan record);
	int deletRecord(Penggunaan record);
	int maxID(Penggunaan record);
	int count(Penggunaan record);
	Penggunaan selectWhereKode(Penggunaan row);
	List<Penggunaan> selectAll(Penggunaan all);
}
