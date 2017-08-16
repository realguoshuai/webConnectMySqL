package com.zhiyou100.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zhiyou100.bean.User;
import com.zhiyou100.dao.IUserDao;
import com.zhiyou100.util.DBUtil;

public class UserDaoImpl extends BaseDaoImpl implements IUserDao {

	
	@Override
	public User login(String phone, String password) {
		User user =null;//null登陆失败  其它成功
		Connection con =DBUtil.getConnection();
		String sql ="SELECT * FROM USER WHERE phone =? AND pw=?";
		PreparedStatement ps =null;
		ResultSet rs =null;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, phone);
			ps.setString(2, password);
			rs= ps.executeQuery();//执行
//			if (rs.next()) {
//				result = 1;
//			}
			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setSex(rs.getBoolean(4));
				user.setAge(rs.getInt(5));
				user.setSchool(rs.getString(6));
				user.setPhone(rs.getString(7));
				user.setQq(rs.getString(8));
				user.setEmail(rs.getString(9));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (ps!=null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}

	@Override
	public int insertInfo(User user) {
		String sql ="INSERT INTO USER(phone,pw) VALUES (?,?)";
		return excute(sql, user.getPhone(),user.getPassword());
	}

	@Override
	public int updateInfo(User user) {
		String sql="UPDATE USER SET name=?,sex=?age=?,school=?,qq=?,email=? WHERE u_id=?";
	    return 	excute(sql,user.getName(),user.isSex(),user.getAge(),user.getSchool(),user.getQq(),user.getEmail(),user.getId());
	}

	@Override
	public int deleteInfo(int id) {
		String sql ="delete from user where u_id=?";
		return excute(sql,id);
	}
	
//参照上面login
	@Override
	public List<User> listUserInfo() {
		List<User> result =new ArrayList<>();
		Connection con =DBUtil.getConnection();
		String sql ="SELECT * FROM USER";
		PreparedStatement ps =null;
		ResultSet rs =null;
		try {
			ps=con.prepareStatement(sql);
			rs= ps.executeQuery();//执行
			while(rs.next()){
				User user =new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setSex(rs.getBoolean(4));
				user.setAge(rs.getInt(5));
				user.setSchool(rs.getString(6));
				user.setPhone(rs.getString(7));
				user.setQq(rs.getString(8));
				user.setEmail(rs.getString(9));
				result.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs!=null) {
					rs.close();
				}
				if (ps!=null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
		
	}

	@Override
	public User queryUserById(int id) {
		User user = new User();
		Connection con = DBUtil.getConnection();
		String sql = "SELECT * FROM USER where u_id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();// 执行
			if (rs.next()) {
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setSex(rs.getBoolean(4));
				user.setAge(rs.getInt(5));
				user.setSchool(rs.getString(6));
				user.setPhone(rs.getString(7));
				user.setQq(rs.getString(8));
				user.setEmail(rs.getString(9));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;

	}

	@Override
	public int updateUserPassword(int uId, String oldPw, String newPw) {
		String sql ="UPDATE USER SET=? where u_id=? and pw=?";
		return excute(sql, newPw,uId,oldPw);
	}

}
