/*
 * CLASS   : BaseBean
 * PACKAGE : jp.co.cyms.base
 * VERSION : 1.0
 * HISTORY : 2014-08-01　LSC　LU CREATE
 */
package jp.co.cyms.base;

import jp.co.cyms.common.SystemCommon;

/**
 * BaseBean
 * 
 * @author LSC LU
 * @since 2014/08/01
 */
public abstract class BaseBean {

	/**
	 * gridTotal
	 */
	private int gridTotal = 0;
	/**
	 * gridTotalPage
	 */
	private int gridTotalPage = 0;
	/**
	 * gridNextPage
	 */
	private int gridNextPage = 0;
	/**
	 * gridPageCount
	 */
	private int gridPageCount = SystemCommon.rowPerPage;

	/**
	 * @return the start
	 */
	public int getGridStart() {
		if (this.gridNextPage < 1 || this.gridTotalPage == 0) {
			return 0;
		}
		if (this.gridNextPage > this.gridTotalPage) {
			return (this.gridTotalPage - 1) * SystemCommon.rowPerPage;
		}
		return (this.gridNextPage - 1) * gridPageCount;
	}

	/**
	 * @return the total
	 */
	public int getGridTotal() {
		return gridTotal;
	}

	/**
	 * setGridTotal
	 * 
	 * @param gridTotal the total to set
	 */
	public void setGridTotal(int gridTotal) {
		this.gridTotal = gridTotal;
		this.gridTotalPage = this.gridTotal / this.gridPageCount + (this.gridTotal % this.gridPageCount > 0 ? 1 : 0);
	}

	/**
	 * @return the next
	 */
	public int getGridNextPage() {
		if (this.gridNextPage < 1) {
			if (this.gridTotalPage == 0) {
				return 0;
			}
			return 1;
		}
		if (this.gridNextPage > this.gridTotalPage) {
			return this.gridTotalPage;
		}
		return this.gridNextPage;
	}

	/**
	 * setGridNextPage
	 * 
	 * @param gridNextPage next the next to set
	 */
	public void setGridNextPage(int gridNextPage) {
		this.gridNextPage = gridNextPage;
	}

	/**
	 * @return the count
	 */
	public int getGridPageCount() {
		return gridPageCount;
	}

	/**
	 * setGridPageCount
	 * 
	 * @param gridPageCount count the count to set
	 */
	public void setGridPageCount(int gridPageCount) {
		this.gridPageCount = gridPageCount;
	}

	/**
	 * @return the totalPage
	 */
	public int getGridTotalPage() {
		return gridTotalPage;
	}
}
