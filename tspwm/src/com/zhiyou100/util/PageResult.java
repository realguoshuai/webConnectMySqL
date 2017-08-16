
package com.zhiyou100.util;

import java.util.List;

public class PageResult <T> {
	private List<T> listData;//当前页的结果集，通过SQL查询出来的
	private int totalCount;//结果总数，通过SQL查询出来的
	private int currentPage = 1;//当前页
	private int pageSize = 10;//每页最多显示多少条数据
	private int beginPage = 1;//首页
	private int prevPage;//上一页
	private int nextPage;//下一页
	private int totalPage;//末页/总页数
	public PageResult(List<T> listData, int totalCount, int currentPage, int pageSize) {
		super();
		this.listData = listData;
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		//接下来计算其余的数据
		this.totalPage = this.totalCount % this.pageSize == 0?this.totalCount/this.pageSize:this.totalCount/this.pageSize+1;
		this.prevPage = this.currentPage-1>=1?this.currentPage-1:1;
		this.nextPage = this.currentPage+1<=this.totalPage?this.currentPage+1:this.totalPage;
	}
	public List<T> getListData() {
		return listData;
	}
	public void setListData(List<T> listData) {
		this.listData = listData;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getBeginPage() {
		return beginPage;
	}
	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	

}
