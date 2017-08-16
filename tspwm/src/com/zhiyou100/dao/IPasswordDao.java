package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.bean.Password;

public interface IPasswordDao extends IBaseDao{
	/**
	 * 根据用户ID返回该用户所保存的所有密码
	 * @param uId
	 * @return 返回属于该用户的密码列表
	 */
	List<Password> listAllPassword(int uId);
	
	/** 
	 * @Title: queryPageByUId 
	 * @Description: 分页查询
	 * @param currentPage 当前页
	 * @param pageSize 每条显示页数
	 * @param uId 当前所属用户id
	 * @return
	 * @return: List<Password>
	 */
	List<Password>queryPageByUId(int currentPage,int pageSize,int uId);
	/** 
	 * @Title: queryCount 
	 * @Description:查询数
	 * @param uId 
	 * @return
	 * @return: int
	 */
	int  queryCount(int uId);
	/**
	 * 插入密码信息
	 * @param p
	 * @return 插入成功返回1，反之返回0
	 */
	int insertPassword(Password p);
	/**
	 * 查询单条密码记录信息
	 * @param pId  该密码的ID
	 * @param uId  该密码所属用户的ID
	 * @return
	 */
	Password queryPwInfo(long pId,int uId);
	/**
	 * 更新密码记录的信息
	 * @param p
	 * @return
	 */
	int update(Password p);
	/**
	 * 删除单条密码记录信息
	 * @param pId  该密码的ID
	 * @param uId  该密码所属用户的ID
	 * @return
	 */
	int delete(long pId,int uId);
	/**
	 * 模糊查询密码记录
	 * @param uId
	 * @param key
	 * @return
	 */
	List<Password> listAllPasswordByKey(int uId,String key);
}
