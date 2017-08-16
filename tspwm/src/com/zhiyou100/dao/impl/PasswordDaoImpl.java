package com.zhiyou100.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.prism.paint.RadialGradient;
import com.zhiyou100.bean.Password;
import com.zhiyou100.dao.IPasswordDao;
import com.zhiyou100.util.DBUtil;

public class PasswordDaoImpl extends BaseDaoImpl implements IPasswordDao {
	@Override
	public List<Password> listAllPassword(int uId) {
		List<Password> result = new ArrayList<Password>();
		Connection con = DBUtil.getConnection();
		String sql = "SELECT * FROM PASSWORDS WHERE u_id = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, uId);
			rs = ps.executeQuery();
			while(rs.next()) {
				Password p = new Password();
				p.setpId(rs.getLong(1));
				p.setuId(uId);
				p.setUrl(rs.getString(3));
				p.setUrlName(rs.getString(4));
				p.setLoginAcc(rs.getString(5));
				p.setLoginPassword(rs.getString(6));
				p.setQq(rs.getBoolean(7));
				p.setWechat(rs.getBoolean(8));
				p.setPhone(rs.getString(9));
				p.setEmail(rs.getString(10));
				result.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(ps!=null) {
					ps.close();
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public int insertPassword(Password p) {
		String sql = "INSERT INTO USER(u_id,url,url_name,login_acc,login_pw,isQQ,iSWeChat,phone,email) VALUES(?,?,?,?,?,?,?,?,?)";
		return excute(sql,
				p.getuId(),
				p.getUrl(),
				p.getUrlName(),
				p.getLoginAcc(),
				p.getLoginPassword(),
				p.isQq(),
				p.isWechat(),
				p.getPhone(),
				p.getEmail()
				);
	}

	@Override
	public Password queryPwInfo(long pId, int uId) {
		Password p = null;
		Connection con = DBUtil.getConnection();
		String sql = "SELECT * FROM PASSWORDS WHERE u_id = ? and p_id = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, uId);
			ps.setLong(2, pId);
			rs = ps.executeQuery();
			if(rs.next()) {
				p = new Password();
				p.setpId(rs.getLong(1));
				p.setuId(uId);
				p.setUrl(rs.getString(3));
				p.setUrlName(rs.getString(4));
				p.setLoginAcc(rs.getString(5));
				p.setLoginPassword(rs.getString(6));
				p.setQq(rs.getBoolean(7));
				p.setWechat(rs.getBoolean(8));
				p.setPhone(rs.getString(9));
				p.setEmail(rs.getString(10));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(ps!=null) {
					ps.close();
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.close(con, ps, rs);
			}
		}
		return p;
	}

	@Override
	public int update(Password p) {
		String sql = "UPDATE PASSWORDS login_acc=?,login_pw=?,isQQ=?,iSWeChat=?,phone=?,email=? WHERE p_id = ? AND u_id = ?";
		return excute(sql,
				p.getLoginAcc(),
				p.getLoginPassword(),
				p.isQq(),
				p.isWechat(),
				p.getPhone(),
				p.getEmail(),
				p.getpId(),
				p.getuId()
				);
	}

	@Override
	public int delete(long pId, int uId) {
		String sql = "DELETE FROM PASSWORDS WHERE u_id = ? AND p_id = ?";
		return excute(sql, uId,pId);
	}

	@Override
	public List<Password> listAllPasswordByKey(int uId, String key) {
		List<Password> result = new ArrayList<Password>();
		Connection con = DBUtil.getConnection();
		String sql = "SELECT * FROM PASSWORDS WHERE u_id = ? AND url_name LIKE concat('%',?,'%')";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, uId);
			ps.setString(2, key);
			rs = ps.executeQuery();
			while(rs.next()) {
				Password p = new Password();
				p.setpId(rs.getLong(1));
				p.setuId(uId);
				p.setUrl(rs.getString(3));
				p.setUrlName(rs.getString(4));
				p.setLoginAcc(rs.getString(5));
				p.setLoginPassword(rs.getString(6));
				p.setQq(rs.getBoolean(7));
				p.setWechat(rs.getBoolean(8));
				p.setPhone(rs.getString(9));
				p.setEmail(rs.getString(10));
				result.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(con, ps, rs);
		}
		return result;
	}

	@Override
	public List<Password> queryPageByUId(int currentPage, int pageSize, int uId) {
		Connection conn = DBUtil.getConnection();
		List<Password> result = new ArrayList<Password>();
		String quertSql ="SELECT * FROM PASSWORDS WHERE u_id =? Limit ?,?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps=conn.prepareStatement(quertSql);
			ps.setInt(1, uId);
			ps.setInt(2, (currentPage-1)*pageSize);
			ps.setInt(3, pageSize);
			rs = ps.executeQuery();
			while(rs.next()){
				Password p =new Password();
				//Result结果集从1开始.....
				p.setpId(rs.getLong(1));
				p.setuId(uId);
				p.setUrl(rs.getString(3));
				p.setUrlName(rs.getString(4));
				p.setLoginAcc(rs.getString(5));
				p.setLoginPassword(rs.getString(6));
				p.setQq(rs.getBoolean(7));
				p.setWechat(rs.getBoolean(8));
				p.setPhone(rs.getString(9));
				p.setEmail(rs.getString(10));
				result.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, rs);
		}
		//空指针
		return result;
	}

	@Override
	public int queryCount(int uId) {
		Connection conn =DBUtil.getConnection();
		int totalCount =0;//用于存放符合条件的总数
		String sql ="SELECT COUNT(1) from passwords where u_id=?";
		PreparedStatement ps =null;
		ResultSet rs =null;
			try {
				ps=conn.prepareStatement(sql);
				ps.setInt(1, uId);
				rs=ps.executeQuery();
				if (rs.next()) {
				totalCount =rs.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				DBUtil.close(conn, ps, rs);
			}
		
		return totalCount;
	}

}
