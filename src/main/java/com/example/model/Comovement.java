package com.example.model;

import org.springframework.stereotype.Component;
//虚表对应的实体类
@Component
public class Comovement {
	private String pr_name;
	private String ci_name;
	private String co_name;
	public String getPr_name() {
		return pr_name;
	}
	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}
	public String getCi_name() {
		return ci_name;
	}
	public void setCi_name(String ci_name) {
		this.ci_name = ci_name;
	}
	public String getCo_name() {
		return co_name;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	
}
