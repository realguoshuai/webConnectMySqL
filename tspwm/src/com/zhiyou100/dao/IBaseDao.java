package com.zhiyou100.dao;

public interface IBaseDao {
	
	 /** 
	 * @Title: excute 
	 * @Description: 该方法可以执行insert update delete的DML语句
	 * @param sql objs
	 * @return: int
	 */
	int excute(String sql,Object...objs);
	 
}
