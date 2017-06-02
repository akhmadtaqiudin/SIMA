package com.id.sima.modul.service;

import java.util.List;
import com.id.sima.modul.model.Barang;

public interface BarangDao {

	int insertRecord(Barang record);
	int updateRecord(Barang record);
	int deletRecord(Barang record);
	int count(Barang kode);
	Barang selectWhereKode(Barang record);
	List<Barang> selectAllRecord(Barang record);
	List<Barang> selectList();
}
