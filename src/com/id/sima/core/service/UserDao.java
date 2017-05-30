package com.id.sima.core.service;

import java.sql.SQLException;
import com.id.sima.core.model.User;

public interface UserDao {

	int checkLogin(User user) throws SQLException;
}