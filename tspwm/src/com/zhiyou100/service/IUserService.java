package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.bean.User;

public interface IUserService {
	//登录
	User login(String phone, String password);
	//注册,增
	boolean register(String phone,String password);

	//改,更新
	User update(User user);
	//删除(通过id)
	List<User> delete(int id);
	//查询所有
	//boolean find(User user);//boolean 变成 List<User>
	List<User> listAllUser();
	//通过id查询用户信息
	//User queryUserById(int id);
	User query(int id);
	User updateUserPassword(int uId,String oldPw,String newPw);
	
}
