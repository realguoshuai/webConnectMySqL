package com.zhiyou100.bean;

public class Password {
	private long pId;
	private int uId;
	private String url;
	private String urlName;
	private String loginAcc;
	private String loginPassword;
	private boolean qq;
	private boolean wechat;
	private String phone;
	private String email;
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	public String getLoginAcc() {
		return loginAcc;
	}
	public void setLoginAcc(String loginAcc) {
		this.loginAcc = loginAcc;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public boolean isQq() {
		return qq;
	}
	public void setQq(boolean qq) {
		this.qq = qq;
	}
	public boolean isWechat() {
		return wechat;
	}
	public void setWechat(boolean wechat) {
		this.wechat = wechat;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Password(long pId, int uId, String url, String urlName, String loginAcc, String loginPassword, boolean qq,
			boolean wechat, String phone, String email) {
		super();
		this.pId = pId;
		this.uId = uId;
		this.url = url;
		this.urlName = urlName;
		this.loginAcc = loginAcc;
		this.loginPassword = loginPassword;
		this.qq = qq;
		this.wechat = wechat;
		this.phone = phone;
		this.email = email;
	}
	public Password() {
		super();
	}
	
}
