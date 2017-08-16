package com.zhiyou100.service;



import java.util.List;

import com.zhiyou100.bean.User;
import com.zhiyou100.dao.IUserDao;
import com.zhiyou100.dao.impl.UserDaoImpl;

public class UserServiceImpl implements IUserService {
	
	private IUserDao userdao =new UserDaoImpl();//定一个全局变量
	
	@Override
	public User login(String phone, String password) {
//		if (userdao.login(phone, password)==1) return true;
//		return false;
		 //三元运算符也可以
		//return userdao.login(phone, password)==1 ? true:false;
		return userdao.login(phone, password);
	}

	@Override
	public boolean register(String phone, String password) {
		User user =new User();
		user.setPhone(phone);
		user.setPassword(password);
		
		return userdao.insertInfo(user)==0? false:true;
	}

	@Override
	public User update(User user) {
	if (userdao.updateInfo(user)==1) {//判断user是否更新 boolean 1为真 0为假
		return user;
	}
	return null;
	}

	@Override
	public List<User> delete(int id) {
		if (userdao.deleteInfo(id)==1) {
			return userdao.listUserInfo();//返回用户信息列表
		}
		return null;
	}



	@Override
	public List<User> listAllUser() {
		
		return userdao.listUserInfo();
	}

	@Override
	public User query(int id) {
		// TODO Auto-generated method stub
		return userdao.queryUserById(id);
	}

	@Override
	public User updateUserPassword(int uId, String oldPw, String newPw) {
		if (userdao.updateUserPassword(uId, oldPw, newPw)==1) {
			return userdao.queryUserById(uId);
		}
		return null;
	}

}
