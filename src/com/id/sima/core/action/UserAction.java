package com.id.sima.core.action;

import java.sql.SQLException;
import java.util.Map;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.id.sima.core.model.User;
import com.id.sima.core.service.UserDao;

public class UserAction extends CoreAction{

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String hakAkses;
	private Map<String, Object> session;
	private UserDao userDao = (UserDao) new ClassPathXmlApplicationContext("config-db.xml").getBean("userDao");
	
	public String Login(){
		System.out.println("Jalankan Method Login");
		
		try {
			User user = new User(userName, password, hakAkses);
			int x=0;
			x = userDao.checkLogin(user);
			if(x>0){
				session.put("userName",user);
				if(hakAkses.equalsIgnoreCase("admin") && session != null){
					user =(User) session.get("userName");
					return "admin";
				}else if(hakAkses.equalsIgnoreCase("manager") && session != null){
					user =(User) session.get("userName");
					return "manager";
				}else if(hakAkses.equalsIgnoreCase("user") && session != null){
					user =(User) session.get("userName");
					return "user";
				}else{
					return ERROR;
				}
			}else{
				addFieldError("invalid", "Maaf Username & Password Salah");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ERROR;
	}
	
	public String LogOut(){
		System.out.println("Jalankan method LogOut");
		session.remove("userName");
		return SUCCESS;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHakAkses() {
		return hakAkses;
	}

	public void setHakAkses(String hakAkses) {
		this.hakAkses = hakAkses;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
