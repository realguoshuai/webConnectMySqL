package com.zhiyou100.service;



import java.util.List;

import com.zhiyou100.bean.Password;
import com.zhiyou100.dao.IPasswordDao;
import com.zhiyou100.dao.impl.PasswordDaoImpl;
import com.zhiyou100.util.PageResult;

public class PasswordServiceImpl implements IPasswordService{

	private IPasswordDao passwordDao = new PasswordDaoImpl();
	@Override
	public List<Password> listAllByUId(int uId) {
		// TODO Auto-generated method stub
		return passwordDao.listAllPassword(uId);
	}

	@Override
	public List<Password> addPw(Password p) {
		if(passwordDao.insertPassword(p) == 1) return passwordDao.listAllPassword(p.getuId());
		return null;
	}

	@Override
	public Password query(long pId, int uId) {
		
		return passwordDao.queryPwInfo(pId, uId);
	}

	@Override
	public List<Password> update(Password p) {
		if(passwordDao.update(p) == 1) return passwordDao.listAllPassword(p.getuId());
		return null;
	}

	@Override
	public List<Password> delete(long pId, int uId) {
		if(passwordDao.delete(pId, uId) == 1) return passwordDao.listAllPassword(uId);
		return null;
	}

	@Override
	public List<Password> listAllPwByKey(int uId, String key) {
		return passwordDao.listAllPasswordByKey(uId, key);
	}

	@Override
	public PageResult<Password> pageResultByUId(int currentPage, int pageSize, int uId) {
		
		return new PageResult<>(passwordDao.queryPageByUId(currentPage, pageSize, uId),
				passwordDao.queryCount(uId),
				currentPage, pageSize);
	}

	@Override
	public PageResult<Password> delete(int currentPage, int pageSize, long pId, int uId) {
		if (passwordDao.delete(pId, uId)==1) {
			return pageResultByUId(currentPage, pageSize, uId);
		}
		return null;
	}

	@Override
	public PageResult<Password> update(int currentPage, int pageSize, Password p) {
		if (passwordDao.update(p)==1) {
			return pageResultByUId(currentPage, pageSize, p.getuId());
		}
		return null;
	}
}
