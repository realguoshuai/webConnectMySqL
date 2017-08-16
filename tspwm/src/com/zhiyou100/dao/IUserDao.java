package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.bean.User;

public  interface IUserDao extends IBaseDao {
	/** 
	 * @Title: login 
	 * @Description:用于登陆使用
	 * @param phone password
	 * @return: int
	 */
	User login(String phone,String password);
	//插入信息,新用户注册
	int insertInfo(User user);//重构之后的
	
	//更新用户信息
	int updateInfo(User user);
	//删除用户的信息
	int deleteInfo(int id);//根据用户的id
	//查取所有的用户
	List<User> listUserInfo();
	//通过用户id查取用户
	User queryUserById(int id);
	int updateUserPassword(int uId,String oldPw,String newPw);
}
