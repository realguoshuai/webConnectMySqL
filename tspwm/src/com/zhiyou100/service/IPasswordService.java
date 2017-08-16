package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.bean.Password;
import com.zhiyou100.util.PageResult;

public interface IPasswordService {
	/**
	 * 根据用户ID返回该用户所属的所有密码列表
	 * @param uId
	 * @return
	 */
	List<Password> listAllByUId(int uId);
	/**
	 * 在密码管理页面添加密码信息，添加成功则返回密码列表，否则返回null
	 * @param p
	 * @return
	 */
	List<Password> addPw(Password p);
	/**
	 * 查询一条密码详细信息
	 * @param pId
	 * @param uId
	 * @return
	 */
	Password query(long pId,int uId);
	/**
	 * 更新密码记录，并成功则返回该用户所属的全部密码列表，反之返回null
	 * @param p
	 * @return
	 */
	List<Password> update(Password p);
	/**
	 * 删除一条密码记录，并成功则返回该用户所属的全部密码列表，反之返回null
	 * @param pId
	 * @param uId
	 * @return
	 */
	List<Password> delete(long pId,int uId);
	/**
	 * 根据关键字查询该用户所属密码下的所有相关密码
	 * @param uId
	 * @param key
	 * @return
	 */
	List<Password> listAllPwByKey(int uId,String key);
	PageResult<Password> pageResultByUId(int currentPage, int pageSize, int uId);
	PageResult<Password>  delete(int currentPage,int pageSize,long pId, int uId);
	PageResult<Password> update(int currentPage, int pageSize, Password p);

}
