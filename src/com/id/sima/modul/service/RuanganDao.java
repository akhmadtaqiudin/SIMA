package com.id.sima.modul.service;

import java.util.List;

import com.id.sima.modul.model.Ruangan;

public interface RuanganDao {

	int insertRecord(Ruangan record);
	int updateRecord(Ruangan record);
	int deletRecord(Ruangan record);
	int count(Ruangan kode);
	Ruangan selectWhereKode(Ruangan record);
	List<Ruangan> selectAllRecord(Ruangan record);
	List<Ruangan> selectList();
}
