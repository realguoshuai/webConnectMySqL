package com.zhiyou100.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.zhiyou100.dao.IBaseDao;
import com.zhiyou100.util.DBUtil;
//实现类
public class BaseDaoImpl implements IBaseDao{

	@Override
	public int excute(String sql, Object... objs) {
		int result = 0;
		PreparedStatement ps = null;
		//需要创建连接对象
		Connection con =DBUtil.getConnection();
		//预编译语句
		try {
			 ps = con.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				ps.setObject(i+1, objs[i]);
			}
			result = ps.executeUpdate();//不许需要传参数
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (ps!=null) {
				try {
					ps.close();
					//预编译需要关闭 连接不需要  用连接池处理
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return result;//返回result (由executeUpdate执行赋值)
	}

}
