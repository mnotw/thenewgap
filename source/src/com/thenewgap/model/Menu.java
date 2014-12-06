/******************************************************************************
 * Author Jonathan Zhang -- thenewgap.com
 * Under the Mit License。
 *****************************************************************************/
package com.thenewgap.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**  
 * 
 * @author      Jonathan Zhang
 *  
 * <p> Modification History:</p> 
 * <p> Date         Author     Description </p>  
 * <p>------------------------------------------------------------------</p>  
 * <p>2014-12-5    Jonathan Zhang      Created</p>
 * <p>....</p>  
 */
@Component("menu")
@Entity
@Table(name="menu")
public class Menu {
	@Id
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String name;
	@Column(name="parent_code")
	private String parentCode;
	@Column(name="url")
	private String url;
	@Column(name="is_enable")
	private String isEnable;
	@Column(name="remark")
	private String remark;
	@Column(name="order_no")
	private String orderNO;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOrderNO() {
		return orderNO;
	}
	public void setOrderNO(String orderNO) {
		this.orderNO = orderNO;
	}
	
}

