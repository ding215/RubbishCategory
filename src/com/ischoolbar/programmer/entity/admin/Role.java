package com.ischoolbar.programmer.entity.admin;

import org.springframework.stereotype.Component;

/**
 * @author gting0518@163.com
 * @deacription  角色实体
 * @data 2019/10/16
 */
@Component
public class Role {
	
	private Long id;
	
	private String name;
	
	private String remark;//角色备注

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
